package com.company.ioc;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // 기본적인 방식
        /*
        // Base 64 encoding
        Encoder encoder = new Encoder();
        String result = encoder.encode(url);
        System.out.println(result);

        // url encoding
        UrlEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);
        System.out.println(urlResult);
        */

        // 추상화
        // new Encoder(외부에서 주입), Encoder 내부는 변경 안함
        // Base 64 encoding
        Encoder encoder = new Encoder(new Base64Encoder()); 
        String result = encoder.encode(url);
        System.out.println(result);

        // url encoding
        Encoder urlEncoder = new Encoder(new UrlEncoder());
        String result2 = urlEncoder.encode(url);
        System.out.println(result2);

    }
}