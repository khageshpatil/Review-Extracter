package com.GoMarble.reviewExtracter.controller;

import com.GoMarble.reviewExtracter.model.ReviewResponse;
import com.GoMarble.reviewExtracter.service.ReviewScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @Autowired
    private ReviewScraperService reviewScraperService;

    @GetMapping("/api/reviews")
    public ReviewResponse getReviews(@RequestParam String page) {
        return reviewScraperService.extractReviews(page);
    }
}
