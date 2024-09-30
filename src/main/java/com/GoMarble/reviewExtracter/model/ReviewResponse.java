package com.GoMarble.reviewExtracter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewResponse {
    private int reviewsCount;
    private List<Review> reviews;
}
