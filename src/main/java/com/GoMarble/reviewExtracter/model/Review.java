package com.GoMarble.reviewExtracter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private String title;
    private String body;
    private int rating;
    private String reviewer;
}
