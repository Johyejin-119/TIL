package com.company.design.strategy;

// Append(ABCD 추가하는) 전략 객체
public class AppendStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return "ABCD" + text;
    }
}
