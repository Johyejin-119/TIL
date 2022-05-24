package com.ssamz.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

//@WebFilter(urlPatterns = "*.do")
public class TimeCheckFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;

	public TimeCheckFilter() {
    	System.out.println("===> TimeCheckFilter 생성");
    }
        
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;		
		String uri = req.getRequestURI();
		
		long beforeTime = System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		long afterTime = System.currentTimeMillis();
		
		System.out.println(uri + " 요청 처리에 소요된 시간 : " + 
				(afterTime - beforeTime) + "(ms)초");
	}

}
