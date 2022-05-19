package com.ssamz.web.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssamz.biz.user.UserDAO;
import com.ssamz.biz.user.UserVO;

@WebServlet("/login.do") // XML 설정 대신
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		//1. 사용자 입력정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 2. DB 연동 처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);
		
		// 3. 응답화면 구성		
		if(user != null) { // 아이디를 이용한 검색 결과가 있는 경우
			if(user.getPassword().equals(vo.getPassword())) { // 비밀번호도 체크
				// 로그인에 성공한 경우, 회원 정보를 세션에 저장하여 브라우저로 전송한다.
				HttpSession session = request.getSession();
				session.setMaxInactiveInterval(60 * 60 * 3); // 브라우저와 서버가 3시간 동안 상호작용이 없으면, 세션 사라짐
				session.setAttribute("user", user); // user 객체 통채로 저장
				
				// 리디렉트 사용
				// response.sendRedirect("getBoardList.do");
				
				// 포워딩 사용
				RequestDispatcher dispatcher = request.getRequestDispatcher("getBoardList.do");
				dispatcher.forward(request, response);

			} else { // 아이디는 맞는데, 비밀번호 틀린 경우
				response.sendRedirect("login.html");
			}
			
		} else { // 아이디에 해당하는 회원이 없는 경우
			response.sendRedirect("login.html");
		}
		
	}

}
