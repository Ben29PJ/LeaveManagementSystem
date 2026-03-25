package com.leave.dto;

import lombok.Data;

@Data
public class ReviewRequest {
    private String status;     // approved or rejected
    private String reviewNote;
}
