package com.leave.dto;

import lombok.Data;

@Data
public class AuthResponse {
    private String token;
    private String name;
    private String email;
    private String role; // ADMIN, MANAGER, EMPLOYEE
    private Integer id;
    private Integer managerId;

    public AuthResponse(String token, String name, String email, String role, Integer id, Integer managerId) {
        this.token = token;
        this.name = name;
        this.email = email;
        this.role = role;
        this.id = id;
        this.managerId = managerId;
    }
}
