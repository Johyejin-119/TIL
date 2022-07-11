package com.example.springioc;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Spring 에 객체로 관리해달라는 요청/권한 넘김 -> Bean 으로 만들어서 관리
@Component
public class UrlEncoder implements IEncoder{

    public String encode(String message) {
        try {
            return URLEncoder.encode(message, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
