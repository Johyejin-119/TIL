<%@page import="com.ssamz.biz.user.UserDAO"%>
<%@page import="com.ssamz.biz.user.UserVO"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
	// 1. 사용자 입력정보 추출
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	// 2. DB 연동 처리
	UserVO vo = new UserVO();
	vo.setId(id);
	
	UserDAO dao = new UserDAO();
	UserVO user = dao.getUser(vo);
	
	// 3. 화면 이동
	if(user != null) {
		if(user.getPassword().equals(password)) {
			// 상태 정보를 세션에 저장한다. 
			session.setAttribute("user", user);
			
			// 글 목록 화면으로 이동한다.
			response.sendRedirect("/index.jsp");
		} else {
			response.sendRedirect("/index.jsp");
		}
	} else {
		response.sendRedirect("/index.jsp");
	}
%>
