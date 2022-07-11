package com.example.aop.controller;

import com.example.aop.annotation.Decode;
import com.example.aop.annotation.Timer;
import com.example.aop.dto.User;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {
    // 서비스 로직에만 집중하도록 작성
    // 반복되는 기능(현. StopWatch)들은 AOP로 처리

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name) {
        return id + " " + name; // input 들어올 때, 값 찍히면 return
    }

    @PostMapping("/post")
    public User post(@RequestBody User user) {
        return user; // 값 반환할 때, 값 찍히면 return
    }

    // 직접 만든 annotation @Timer
    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
        // db logic
        Thread.sleep(1000 * 2); // 2초 후에 종료
    }

    @Decode
    @PutMapping("/put")
    public User put(@RequestBody User user) {
        System.out.println("put");
        System.out.println(user);
        return user; // 값 반환할 때, 값 찍히면 return
    }
}
