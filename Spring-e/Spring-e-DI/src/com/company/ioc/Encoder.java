package com.company.ioc;

import java.util.Base64;

public class Encoder {
    private IEncoder iEncoder; // 의존성이 있는 객체
    public Encoder(IEncoder iEncoder) { // 의존성이 있는 객체를 주입 받아서 처리(DI)
        // this.iEncoder = new Base64Encoder();
        // this.iEncoder = new UrlEncoder();

        // DI
        this.iEncoder = iEncoder;
    }
    public String encode(String message) {
        return iEncoder.encode(message);
    }
}
