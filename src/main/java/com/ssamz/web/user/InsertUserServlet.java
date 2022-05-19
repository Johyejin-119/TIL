package com.ssamz.web.user;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssamz.biz.user.UserDAO;
import com.ssamz.biz.user.UserVO;

@WebServlet(urlPatterns = "/insertUser.do", 
			initParams = @WebInitParam(name = "encoding", value = "UTF-8")) // XML 설정 대신
public class InsertUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 사용자 입력 정보 추출
		String id = request.getParameter("id"); // "id" 은  html 의 파라미터와 일치해야함
		String password = request.getParameter("password"); 
		String name = request.getParameter("name"); 
		String role = request.getParameter("role"); 
		
		// 2. DB 연동 처리(추출한 회원 정보를 USERS 테이블에 등록하는 코드를 완성하시오)
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setRole(role);
		
		UserDAO userDAO = new UserDAO();
		userDAO.insertUser(vo);
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		System.out.println("회원이름 : " + name);
		System.out.println("권한 : " + role);
		
		// 3. 화면 이동
		response.sendRedirect("login.html");
		
		
	}

}
