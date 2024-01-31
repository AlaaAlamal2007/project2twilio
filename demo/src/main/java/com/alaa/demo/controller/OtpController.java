package com.alaa.demo.controller;

import com.alaa.demo.dto.OtpRequest;
import com.alaa.demo.dto.OtpResponseDto;
import com.alaa.demo.dto.OtpValidationRequest;
import com.alaa.demo.service.SmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/otp")
public class OtpController {
    private final static Logger log = LoggerFactory.getLogger(OtpRequest.class);
    private final SmsService smsService;

    public OtpController(SmsService smsService) {
        this.smsService = smsService;
    }

    @GetMapping("/process")
    public String processSMS() {
        return "SMS sent";
    }

    @PostMapping("/send-otp")
    public OtpResponseDto sendOtp(@RequestBody OtpRequest otpRequest) {
        log.info("inside sendOtp :: "+otpRequest.getUsername());
        return smsService.sendSMS(otpRequest);
    }
    @PostMapping("/validate-otp")
    public String validateOtp(@RequestBody OtpValidationRequest otpValidationRequest) {
        log.info("inside validateOtp :: "+otpValidationRequest.getUsername()+" "+otpValidationRequest.getOtpNumber());
        return smsService.validateOtp(otpValidationRequest);
    }
}
