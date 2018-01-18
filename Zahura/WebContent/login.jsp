<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>

	<link rel="stylesheet" type="text/css" href="./css/style.css">

	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>

	<title>zahura_login</title>

</head>

<body>
<div id="header">
	<a href="home.jsp"><img alt="" src="./image/phanpro.png"></a>
</div>
<div id="main">
商品を購入する際はログインをお願いします。<br>
phantom225
<s:form action="LoginAction">
	<s:textfield name="loginUserId"/>
	<s:password name="loginPassword"/>
	<s:submit value="ログイン"/>
</s:form>

<p>新規ユーザー登録は<a href='<s:url action="UserCreateAction"/>'>こちら</a></p>
<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
</div>
	<div id="footer">
		Copyright &copy PRODUCTION STORE All rights
	</div>
</body>

</html>