package com.example.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimerAop { // Timer 동작 AOP

    // controller 하위의 method 에 제약 걸기
    @Pointcut("execution(* com.example.aop.controller..*.*(..))")
    private void cut(){}

    // annotation 패키지 하위의 Timer method 는 로깅하기  ->  실행 시간이 필요함
    @Pointcut("@annotation(com.example.aop.annotation.Timer)")
    private void enableTimer(){}

    // Before, After Method 는 Timer 를 공유할 수 없음
    // cut() 과 enableTimer() 를 같이 사용
    @Around("cut() && enableTimer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        // 실행 전
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        // joinPoint.proceed() -> 실질적인 method 실행
        Object result = joinPoint.proceed();

        // 실행 후
        stopWatch.stop();
        // 총 걸린 시간 (초단위)
        System.out.println("total time : " + stopWatch.getTotalTimeSeconds());
    }

}
