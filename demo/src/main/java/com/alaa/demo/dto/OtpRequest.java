package com.alaa.demo.dto;

public class OtpRequest {
    private String username;
    private String phoneNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public OtpRequest() {
    }

    public OtpRequest(String username, String phoneNumber) {
        this.username = username;
        this.phoneNumber = phoneNumber;
    }
}
