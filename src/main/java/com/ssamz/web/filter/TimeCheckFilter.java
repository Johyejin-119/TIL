package com.ssamz.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "*.do")
public class TimeCheckFilter extends HttpFilter implements Filter {

	public TimeCheckFilter() {
		System.out.println("===> TimeCheckFilter 생성");

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI(); // URI 정보 추출 가능
		
		long beforeTime = System.currentTimeMillis(); // System.currentTimeMillis()가 호출될 때의 시간 정보를 return
		
		chain.doFilter(request, response); // Servlet 호출
		
		long afterTime = System.currentTimeMillis(); // System.currentTimeMillis()가 호출한 후의 시간 정보를 return

		System.out.println(uri + " 요청 처리에 소요된 시간 : " + (afterTime - beforeTime) + "(ms)초");
		

	}

}
