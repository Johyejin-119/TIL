package com.example.validation.controller;

import com.example.validation.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ApiController {

    /*
    @PostMapping("/user")
    public Object user(@Valid @RequestBody User user) {
        System.out.println(user);

        // 옛날식 코드  =>  개수가 증가하면 관리 힘듦
        if(user.getAge() >= 90 *//*user.getPhoneNumber() == "xxx-xxxx-xxxx"*//*) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
        }
        return ResponseEntity.ok(user);
    }*/

    // 에러 메시지 출력
    @PostMapping("/user")
    public ResponseEntity user(@Valid @RequestBody User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            bindingResult.getAllErrors().forEach(objectError -> {
                FieldError field = (FieldError) objectError;
                String message = objectError.getDefaultMessage();

                System.out.println("filed : " + field.getField());
                System.out.println(message);

                // JSON body에 친절한 에러 메시지 전달
                sb.append("field : " + field.getField());
                sb.append(("message : " + message));

            });
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
        }

        // 실질적인 logic 실행

        System.out.println(user);
        return ResponseEntity.ok(user);

    }
}
