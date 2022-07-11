package com.example.put;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    /*
    // 받은 데이터 출력
    @PutMapping("/put")
    public void put(@RequestBody PostRequestDto requestDto) {
        System.out.println(requestDto);
    }
    */

    // echo 처럼 동작 -> 내가 받았던 데이터를 그대로 return
    @PutMapping("/put")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto) {
        System.out.println(requestDto);
        return requestDto;
    }


    // @PathVariable
    // {userId} 과 변수 id의 이름 일치시키기
    @PutMapping("/put2/{userId}")
    public PostRequestDto put2(@RequestBody PostRequestDto requestDto, @PathVariable(name = "userId") Long id) {
        System.out.println(id);
        return requestDto;
    }
}
