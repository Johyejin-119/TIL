package com.example.aop.aop;

import com.example.aop.dto.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Aspect
@Component
public class DecodeAop {

    // controller 하위의 method 에 제약 걸기
    @Pointcut("execution(* com.example.aop.controller..*.*(..))")
    private void cut(){}

    // annotation 패키지 하위의 Timer method 는 로깅하기  ->  실행 시간이 필요함
    @Pointcut("@annotation(com.example.aop.annotation.Decode)")
    private void enabledecode(){}

    // Before 는 Encode
    @Before("cut() && enabledecode()")
    public void before(JoinPoint joinPoint) throws UnsupportedEncodingException {
        Object[] args = joinPoint.getArgs(); // method 의 파라미터(args) 값 중에 원하는 값 뽑기
        for (Object arg : args) {
            if(arg instanceof User) { // 그 중 '원하는 객체 User' 를 찾았을 때만 값 변경
                User user = User.class.cast(arg); // User 클래스로 형변환
                String base64Email = user.getEmail(); // 기존 encoding 되어있던 email 꺼내기
                String email = new String(Base64.getDecoder().decode(base64Email), "UTF-8"); // base64Email 반환형 byte -> new String 으로 decoding
                user.setEmail(email);
            }
        }
    }

    // After 는 Decode
    @AfterReturning(value = "cut() && enabledecode()", returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj) {
        if(returnObj instanceof User) {
            User user = User.class.cast(returnObj); // decoding
            String email = user.getEmail();
            String base64Email = Base64.getEncoder().encodeToString(email.getBytes()); // encoding
            user.setEmail(base64Email);
        }
    }
}
