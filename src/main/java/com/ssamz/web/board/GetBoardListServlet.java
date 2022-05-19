package com.ssamz.web.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssamz.biz.board.BoardDAO;
import com.ssamz.biz.board.BoardVO;
import com.ssamz.biz.user.UserVO;

@WebServlet("/getBoardList.do")
public class GetBoardListServlet extends HttpServlet {
	// 분산 네크워크에서 직렬화, 역직렬화 했을 때 확인 용도 -> 실행에는 아무 문제 없음
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 0. 상태 정보 체크
		HttpSession session = request.getSession(); // 브라우저의 정보 + 시간 정보 => unique 한 세션 ID 생성
		UserVO user = (UserVO) session.getAttribute("user");

		// 1. DB 연동 처리
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);

		// 2. 응답 화면 구성
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");

		out.println("<title>글 목록</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");

		out.println("<h1>게시글 목록</h1>");
		out.println("<h3><font color='green'>" + user.getName() + "</font>님 로그인 환영합니다......");
		out.println("<a href='logout.do'>Log-out</a></h3>");

		out.println("<table border='1' cellpadding='0' cellspacing='0' width='700'>");
		out.println("<tr>");
		out.println("<th bgcolor='orange' width='100'>번호</th>");
		out.println("<th bgcolor='orange' width='200'>제목</th>");
		out.println("<th bgcolor='orange' width='150'>작성자</th>");
		out.println("<th bgcolor='orange' width='150'>등록일</th>");
		out.println("<th bgcolor='orange' width='100'>조회수</th>");
		out.println("</tr>");

		for (BoardVO board : boardList) {
			out.println("<tr>");
			out.println("<td align='center'>" + board.getSeq() + "</td>");
			out.println("<td><a href='getBoard.do?seq=" + board.getSeq() + "'>" + board.getTitle() + "</a></td>");
			out.println("<td align='center'>" + board.getWriter() + "</td>");
			out.println("<td align='center'>" + board.getRegDate() + "</td>");
			out.println("<td align='center'>" + board.getCnt() + "</td>");
			out.println("</tr>");
		}

		out.println("</table>");
		out.println("<br>");
		out.println("<a href='insertBoard.html'>새글 등록</a>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

		out.close();

	}

}
