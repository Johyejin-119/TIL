package com.example.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringIocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIocApplication.class, args);
        ApplicationContext context = ApplicationContextProvider.getContext();

        // class 로 불러오기
        /*
         Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
         UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);
        */

        // loc, bean 활용해서 불러오기
        /*
        Encoder encoder = context.getBean(Encoder.class);
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";
        String result = encoder.encode(url);
        System.out.println(result);
        */

        // bean 여러개 등록된 클래스 불러오기
        Encoder encoder = context.getBean("urlEncode", Encoder.class);
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";
        String result = encoder.encode(url);
        System.out.println(result);

    }
}

// Encoder.java 를 @Component 로 등록하지않고, Bean 으로 직접 등록하는 방법
// @Configuration -> 한 클래스에서 여러개 Bean 등록
@Configuration
class AppConfig{

    // Base64Encoder 를 Spring 으로부터 주입받기
    @Bean("base64Encode")
    public Encoder encoder(Base64Encoder base64Encoder) {
        return new Encoder(base64Encoder);
    }

    // UrlEncoder 를 Spring 으로부터 주입받기
    @Bean("urlEncode")
    public Encoder encoder(UrlEncoder urlEncoder) {
        return new Encoder(urlEncoder);
    }
}
