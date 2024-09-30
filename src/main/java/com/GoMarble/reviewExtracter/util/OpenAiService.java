package com.GoMarble.reviewExtracter.util;

import org.springframework.stereotype.Service;
import java.io.IOException;
import okhttp3.*;

@Service
public class OpenAiService {

    private static final String OPENAI_API_KEY = "your-openai-api-key-here";
    private static final String OPENAI_API_URL = "https://api.openai.com/v1/completions";
    
    public String getCssSelector(String pageHtml) throws IOException {
        OkHttpClient client = new OkHttpClient();
        
        String prompt = "Extract the CSS selector for reviews from the following HTML: " + pageHtml;

        RequestBody body = new FormBody.Builder()
                .add("prompt", prompt)
                .add("max_tokens", "100")
                .add("model", "gpt-3.5-turbo") // Assuming we use GPT-3.5
                .build();

        Request request = new Request.Builder()
                .url(OPENAI_API_URL)
                .post(body)
                .addHeader("Authorization", "Bearer " + OPENAI_API_KEY)
                .build();
        
        Response response = client.newCall(request).execute();
        
        if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

        return response.body().string();
    }
}
