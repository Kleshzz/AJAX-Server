package com.example.server.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AjaxRequest {

    @NotBlank(message = "Action field is required")
    private String action;

    @NotBlank(message = "Payload data is required")
    @Size(min = 3, message = "Data must be at least 3 characters long")
    private String data;

    // Default constructor (required for JSON deserialization)
    public AjaxRequest() {}

    // Getters and Setters
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AjaxRequest{action='" + action + "', data='" + data + "'}";
    }
}