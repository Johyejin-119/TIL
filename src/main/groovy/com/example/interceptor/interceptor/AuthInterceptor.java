package com.example.interceptor.interceptor;

import com.example.interceptor.annotation.Auth;
import com.example.interceptor.exception.AuthException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;
import org.springframework.web.util.UriComponentsBuilder;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;

@Slf4j
@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();

        // 세션이나 쿠기대신 아래에서 검사할 데이터 넣기
        URI uri = UriComponentsBuilder.fromUriString(request.getRequestURI())
                .query(request.getQueryString())
                .build()
                .toUri();

        log.info("request url : {}", url);
        boolean hasAnnotation = checkAnnotation(handler, Auth.class);
        log.info("has annotation : {}", hasAnnotation); // private true, public false

        // 나의 서버는 모두 public으로 동작을 하는데
        // 단, Auth 권한을 가진 요청에 대해서는 세션, 쿠키 등을 검사
        if(hasAnnotation) {
            // 권한 체크
            String query = uri.getQuery();
            log.info("query = {}", query);
            if(query.equals("name=yeppi")) { // 이름이 yeppi 일때만 통과
                return true;
            }

            // 권한이 없다면
            throw new AuthException();
        }

       return true;
        // return false; // 동작 안함
    }

    private boolean checkAnnotation(Object handler, Class clazz) {
        // resource javascript, html 등
        if(handler instanceof ResourceHttpRequestHandler) {
            return true;
        }

        // annotation check
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        if(null != handlerMethod.getMethodAnnotation(clazz) || null != handlerMethod.getBeanType().getAnnotation(clazz)) {
            // Auth annoation 이 있을 때
            return true;
        }

        return false;

    }
}
