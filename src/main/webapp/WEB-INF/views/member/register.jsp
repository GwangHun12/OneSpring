<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 가입 폼</title>
	</head>
	<body>
		<form action="/member/register.do" method="post">
			<fieldset>
				<legend>회원가입</legend>
				<ul>
					<li>
						<label>아이디 *</label>
						<input type="text" name="memberId">
					</li>
					<li>
					<label>비밀번호 *</label>
					<input type="password" name="pass" placeholder="비밀번호를 입력하세요">
					</li>
					<li>
					<label>비밀번호 재확인 *</label>
					<input type="password" name="repass" placeholder="비밀번호를 다시 입력해주세요">
					</li>
				</ul>
			</fieldset>
			<div>
				<input type="submit" value="가입">
			</div>
		</form>
		
	</body>
</html>