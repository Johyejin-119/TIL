package com.example.springioc;

import org.springframework.stereotype.Component;

import java.util.Base64;

// Spring 에 객체로 관리해달라는 요청/권한 넘김 -> Bean 으로 만들어서 관리
@Component("base74Encoder")
public class Base64Encoder implements IEncoder{

    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
