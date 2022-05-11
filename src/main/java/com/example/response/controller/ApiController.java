package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// 단순하게 API 만드는 서버 작성
@RestController
@RequestMapping("/api")
public class ApiController {

    // text 내려받기
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    // JOSN 내려받기 방법 1
    // User 라는 객체를 @RequestBody 로 받아서 User 로 return
    /* 실제 동작
       request 가 오면 -> object mapper 를 통해서 -> object 로 변환 -> 아래 json method 타고
       -> object 인 User 던짐 -> 다시 object mapper 를 통해서 -> json 으로 변환 -> response 가 내려감
    */
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user; // 200 okay
    }

    // JOSN 내려받기 방법 2 (명확한 방법)
    // ResponseEntity 객체로 User 정보 내려받기
    @PutMapping("/put")
    public ResponseEntity<User> User_put(@RequestBody User user) {
        // ResponseEntity.ok() // ok 수정 200
        return ResponseEntity.status(HttpStatus.CREATED).body(user); // CREATED 생성 201 // body 에 넣어서 response
    }
}
