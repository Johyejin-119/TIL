package com.ssamz.web.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout.do") // XML 설정 대신
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// 로그아웃 요청한 브라우저와 매핑된 세션 객체를 서버 메모리에서 강제로 삭제한다. 
			HttpSession session = request.getSession();
			session.invalidate(); // 브라우저에 등록된 세션 강제 삭제
			response.sendRedirect("login.html");
	}

}
