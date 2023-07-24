package com.example.springioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*@Component*/
public class Encoder {
    private IEncoder iEncoder; // 의존성이 있는 객체
    public Encoder(/*@Qualifier("base74Encoder")*/ IEncoder iEncoder) { // 의존성이 있는 객체를 주입 받아서 처리(DI)
        // DI
        this.iEncoder = iEncoder;
    }

    // Spring 을 주입 받을 수 있는 장소 -> 변수 생성자, setMethod
    public void setIEncoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }


   public String encode(String message) {
        return iEncoder.encode(message);
    }
}
