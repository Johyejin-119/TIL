package com.ssamz.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpFilter;

@WebFilter(urlPatterns = "*.do", 
           initParams = @WebInitParam(name = "encoding", value = "UTF-8"))
public class CharacterEncodingFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;
	private String encoding;
	
//    public CharacterEncodingFilter() {
//        System.out.println("===> CharacterEncodingFilter 생성");
//    }    

	public void init(FilterConfig fConfig) throws ServletException {
		encoding = fConfig.getInitParameter("encoding");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
		chain.doFilter(request, response);
	}
}
