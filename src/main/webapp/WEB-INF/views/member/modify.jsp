<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>마이페이지</title>
<!-- 		<link rel="stylesheet" href="/resources/css/member/main.css"> -->
	</head>
	<body>
		<h1>마이페이지</h1>
		<form action="/member/update.do" method="post">
			<fieldset>
					<legend>회원 상세 정보</legend>
					<ul>
						<li>
							<label for="member_Id">아이디 *</label>
							<span></span>
							<input type="text" id="member_Id" name="member_Id" value="${member.memberId }" readonly> <!-- 기능을 위한 id, 쿼리스트링 생성을 위한 name -->
						</li>
						<li>
							<label for="pass">비밀번호 *</label>
							<span></span>
							<input type="password" id="pass" name="pass" value=" value="${member.pass }">
						</li>
<!-- 						<li> -->
<!-- 							<label for="member-date">가입날짜</label> -->
<!-- 							<span></span> -->
							<input type="text" id="member-date" value="${member.memberDate }" readonly>
<!-- 						</li> -->
					</ul>
				</fieldset>
<!-- 				<div> -->
<!-- 					<button type="submit">수정하기</button> -->
<!-- 					<a href="javascript:void(0)" onclick="checkDelete();">탈퇴하기</a> -->
<%-- 					<a href="/member/delete.do?memberId=${sessionScope.memberId }">탈퇴하기</a> --%>
<!-- 					<button>탈퇴하기</button> -->
<!-- 				</div> -->
			</form>
<!-- 			<script> -->
<!-- // 				function checkDelete(){ -->
<!-- // 					if(confirm("탈퇴하시겠습니까?")){ -->
<%-- 						location.href = "/member/delete.do?memberId=${memberId}"; --%>
<!-- // 					} -->
<!-- // 				} -->
<!-- 			</script> -->
			<a href="/index.jsp">메인으로 이동</a>
			<a href="/member/update.do?memberId=${memberId }">수정하기</a>
			<a href="/member/delete.do?memberId=${memberId }">삭제하기</a>
	</body>
</html>