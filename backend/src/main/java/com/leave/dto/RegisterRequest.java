package com.leave.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private Integer managerId; // null means admin or manager, value means employee
}
