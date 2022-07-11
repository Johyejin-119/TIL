/*
package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("---------");

        // Text JSON -> Object
        // Object -> Text JSON

        // controller req json(text) -> object
        // response object -> json(text)

        var objectMapper = new ObjectMapper();

        // object mapper 1
        // object -> text
        // object mapper 는 get method 를 활용
        var user = new User("yeppi", 10, "010-1111-2222");
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // object mapper 2
        // text -> object
        // object mapper 는 default 생성자가 필요
        var objectUser  = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);




    }

}
*/
