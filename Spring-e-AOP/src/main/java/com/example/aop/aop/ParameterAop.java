package com.example.aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

// AOP 사용 + Component 로 Spring 에서 관리
@Aspect
@Component
public class ParameterAop {

    // @Pointcut( 룰 설정 ( 적용시킬 주소 ) )
    @Pointcut("execution(* com.example.aop.controller..*.*(..))")
    private void cut(){}

    // cut()이 실행되는 지점의 @Before 에서 해당 메소드(before()) 를 실행
    //@Before("cut()")
    public void before(JoinPoint joinPoint) { // JoinPoint 지점 정보
        // method 이름(get,post) JointPoint 에서 가져오기
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println(method.getName());

        Object[] args = joinPoint.getArgs(); // method 의 매개변수의 배열
        for(Object obj : args) {
            System.out.println("type : " + obj.getClass().getSimpleName()); // method 타입
            System.out.println("value : " + obj); // method 값
        }
    }

    // cut()이라는 지점의 반환 값
    //@AfterReturning(value = "cut()", returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj) { // JoinPoint 지점 정보, Object 반환 값
        System.out.println("return obj");
        System.out.println(returnObj);
    }
}
