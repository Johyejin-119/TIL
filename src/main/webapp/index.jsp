<%@page import="java.util.List"%>
<%@page import="com.ssamz.biz.board.BoardDAO"%>
<%@page import="com.ssamz.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=UTF-8"
	errorPage="errors/boardError.jsp"%>

<%@include file="../layout/header.jsp"%>

<%
// Scriptlet : 정상적인 자바 코드가 작성되는 영역
	// 1. DB 연동 처리
	BoardVO vo = new BoardVO();
	BoardDAO dao = new BoardDAO();
	List<BoardVO> boardList = dao.getBoardList(vo);
	
	// 2. 응답 화면 구성
	// HttpServletRequest
	request.setAttribute("name", "홍길동");
	// HttpSession
	session.setAttribute("name", "yeppi");
	//ServletContext
	application.setAttribute("name", "김말이");
%>

<center>
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<tr>
			<th bgcolor="orange" width="100">번호</th>
			<th bgcolor="orange" width="200">제목</th>
			<th bgcolor="orange" width="150">작성자</th>
			<th bgcolor="orange" width="150">등록일</th>
			<th bgcolor="orange" width="100">조회수</th>
		</tr>

		<%
		for (BoardVO board : boardList) {
		%>
		<tr>
			<td><%=board.getSeq()%></td>
			<td align="left"><a href="getBoard.jsp"><%=board.getTitle()%></a></td>
			<td><%=board.getWriter()%></td>
			<td><%=board.getRegDate()%></td>
			<td><%=board.getCnt()%></td>
		</tr>
		<%
		}
		%>
	</table>
</center>

<%@include file="../layout/footer.jsp"%>
