<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css">
<title>login</title>

</head>
<body>
	<div id="header">
		<a href="index.jsp"><img alt="" src="./image/phanpro.png" height="60px"></a>
			<ul>
			<li><a href="welcome.jsp">ログイン/新規登録</a></li>
			<br>
				<li><a href="">	</a></li>
			</ul>
	</div>
				<div id="menubar">
				<ul><li><a href="">CART</a></li></ul>
				</div>

		<div id="main">
			<s:form action="LoginAction">
			<s:textfield name="username" label="ユーザー名"/>
			<s:password name="password" label="パスワード"/>
			<s:submit value="送信"/>
			</s:form>

			<br>
		<a href="test.jsp">新規ユーザー登録</a>
		</div>


	<div id="sita">
		<ul>
			<h1>ご利用方法</h1><li></li><li></li>
		</ul>
			<ul>
				<h1>このサイトについて</h1><li></li><li></li>
			</ul>
				<ul>
					<h1>お問い合わせ</h1><li></li><li></li>
				</ul>
	</div>

	<div id="footer">
	Copyright &copy PRODUCTION STORE All rights
	</div>
</body>
</html>