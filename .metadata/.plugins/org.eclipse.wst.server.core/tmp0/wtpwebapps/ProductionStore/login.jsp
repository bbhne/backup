<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <jsp:useBean id="now" class="store.action.LoginAction"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

		ログインしました。
<!-- <p>マイページは<a href="mypage.jsp">こちら</a></p> -->

		<s:form action="LoginAction">
		login_user_id:<s:property value="session.login_user_id"/><br>
		?:<s:property value="session.id"/><br>
		password:<s:property value="#session.password"/><br>
		username:<s:property value="username"/><br>
		<s:property value="#session.buyItem_name"/>
		<s:property value="#session.buyItem_price"/><br>
		password:<s:property value="#session.password"/><br>
		</s:form>
		<br>
<%= now %>

		<s:iterator value="#session.LoginDTOList">
		<s:property value="username"/>
		<s:property value="password"/>
		</s:iterator>

		<s:iterator value="#session.LoginDTO">
		<s:property value="username"/>
		<s:property value="password"/>
		</s:iterator>

<p>マイページは<a href='<s:url action="MypageAction"/>'>こちら</a></p>

		</div>

				<img alt="" src="./image/ogre2.png" height="600px">

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