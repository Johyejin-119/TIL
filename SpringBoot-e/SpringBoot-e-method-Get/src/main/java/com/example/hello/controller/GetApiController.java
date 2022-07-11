package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    // GetMapping 방식1 : 명시적으로 주소 설정
    @GetMapping(path = "/hello") // http://locathost:9090/api/get/hello
    public String hello() {
        return "hello";
    }

    // GetMapping 방식2 : @RequestMapping 으로 주소 설정(예전 방식)
    // "/hi" 라고만 설정할 경우 -> get post put delete 모든 방식 동작
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get 방식만 동작 http://localhost:9090/api/get/hi
    public String hi() {
        return "hi";
    }

    // http://local:9090/api/get/path-variable/{name}   -> name은 계속 변화하는(variable) 값
    // 주의 : @GetMapping 의 변수 {name}와, 매개변수로 받는 변수 이름 name은 동일해야 함
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName) {
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    // http://local:9090/api/get/query-param?user=yeppi&email=yeppi@gmail.com&age=77
    // query parameter 받는 방법 1 : Map
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");
            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    // query parameter 받는 방법 2 : 명시적
    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name + " " + email + " " + age;
    }

    // http://local:9090/api/get/query-param?user=yeppi&email=yeppi@gmail.com&age=77
    // query parameter 받는 방법 3
    // dto 패키지에
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}