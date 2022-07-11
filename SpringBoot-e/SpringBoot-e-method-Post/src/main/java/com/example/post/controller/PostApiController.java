package com.example.post.controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    // POST 방식 1 : Map 사용
    @PostMapping ("/post")
    public void post(@RequestBody Map<String, Object> requestData) {
        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("key : " + value);
        });

        /*
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key : " + stringObjectEntry.getKey());
            System.out.println("key : " + stringObjectEntry.getValue());
        });
        * 여기에서 alt + enter 로 자동 replace
        * */
    }

    // POST 방식 2 : DTO 사용
    @PostMapping ("/post2")
    public void post2(@RequestBody PostRequestDto requestData) {
        System.out.println(requestData);

        // 이런 방식으로 데이터 가져와서 처리
        // requestData.getAccount();
    }
}
