<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 정보</title>
		<link rel="stylesheet" href="../resources/css/main.css">
	</head>
	<body>
		<h1>회원정보</h1>
			<fieldset>
				<legend>회원정보</legend>	
				<ul>
					<li>
						<label>아이디 *</label>
						<span>${member.memberId }</span>			
					</li>
					<li>
						<label>비밀번호 *</label>
						<span>${member.pass }</span>			
					</li>
				</ul>	
			</fieldset>
			<a href="/index.jsp">메인으로 이동</a>
			<a href="/member/update.do?memberId=${member.memberId }">수정하기</a>
			<a href="/member/delete.do?memberId=${member.memberId }">삭제하기</a>
	</body>
</html>