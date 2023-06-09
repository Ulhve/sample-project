package com.example.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfo {

    private String title;
    private BigDecimal averageRating;
    private List<RatingWithCount> ratings;
    private Integer currentClientRating;

}
