package com.company.design.strategy;

import java.util.Base64;

// Base64Strategy 전략 객체
public class Base64Strategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
