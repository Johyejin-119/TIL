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
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssamz.biz.user.UserVO;

@WebFilter(urlPatterns = {"/", "/getBoard.jsp", "/deleteBoard_proc.jsp"})
public class AuthenticationFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;

//	public AuthenticationFilter() {
//        System.out.println("===> AuthenticationFilter 생성");
//  }    

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 세션 체크
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		UserVO user = (UserVO) session.getAttribute("user");
		if(user == null) {
			res.sendRedirect("/");
		} else {		
			chain.doFilter(request, response);
		}
	}
}
