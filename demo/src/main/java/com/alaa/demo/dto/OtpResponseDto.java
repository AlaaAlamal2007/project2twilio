package com.alaa.demo.dto;

public class OtpResponseDto {
    private OtpStatus status;
    private String message;

    public OtpStatus getStatus() {
        return status;
    }

    public void setStatus(OtpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OtpResponseDto() {
    }

    public OtpResponseDto(OtpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
