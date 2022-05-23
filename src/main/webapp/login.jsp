<%@ page contentType="text/html; charset=UTF-8"%>

<%@ include file="../layout/header.jsp"%>


<center>
	<h1>회원 로그인</h1>
	<hr>
	<br>
	<form action="login_proc.jsp" method="post">
		<table border='1' cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="orange">아이디</td>
				<td><input type="text" name="id" size="20" /></td>
			</tr>
			<tr>
				<td bgcolor="orange">비밀번호</td>
				<td><input type="password" name="password" size="20" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="로그인" /></td>
			</tr>
		</table>
	</form>
	<br>
	<a href = "insertUser.html">회원가입</a>
	<hr>
</center>
