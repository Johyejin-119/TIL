package com.company.design.strategy;

// NormalStrategy 전략 객체
public class NormalStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return text;
    }
}
