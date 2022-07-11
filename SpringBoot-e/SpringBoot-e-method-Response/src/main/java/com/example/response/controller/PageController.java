package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 실제 페이지를 return 하는 서버
public class PageController {

    // String return 시, Controller 가 리소스를 찾게 됨
    @RequestMapping("/main")
    public String main() {
        return "main.html"; // 서버가 자동으로 html 파일을 찾아감
    }

    // JSON 찾아가기 1
    // ApiController.java 에서 했던 ResponseEntity 방식

    // JSON 찾아가기 2
    // User 객체 return 시, Controller 가 리소스를 찾지 않고, ResponseBody 자체를 만들어서 데이터 내려 줌
    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User(); // 타입 추론 // User user = new User();
        user.setName("yeppi");
        user.setAddress("딩동댕 유치원");
        return user;
    }
}
