package com.GoMarble.reviewExtracter.service;

import com.GoMarble.reviewExtracter.model.Review;
import com.GoMarble.reviewExtracter.model.ReviewResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewScraperService {

    // TODO: Integrate Puppeteer/Playwright & OpenAI for dynamic scraping

    public ReviewResponse extractReviews(String productUrl) {
        // Mock data for now, replace with actual scraping logic later
        List<Review> reviews = new ArrayList<>();
        reviews.add(new Review("Great Product!", "I loved this product so much.", 5, "John Doe"));
        reviews.add(new Review("Not bad", "It was okay, could be better.", 3, "Jane Smith"));
        
        ReviewResponse response = new ReviewResponse(reviews.size(), reviews);
        return response;
    }
}
