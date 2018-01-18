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

	<title>zahura_userCreate</title>

</head>

<body>

	<div id="header">

	</div>
<div id="main">
	<s:if test="errorMessage != ''">
		<s:property value="errorMessage" escape="false"/>
	</s:if>

	<s:form action="UserCreateConfirmAction">

		<label>ログインID</label><br>
		<input type="text" name="loginUserId" value=""/><br>

		<label>ログインPASS</label><br>
		<input type="text" name="loginPassword" value=""/><br>

		<label>ユーザー名</label><br>
		<input type="text" name="userName" value=""/><br>

		<s:submit value="登録"/>

	</s:form>

	<span>前画面に戻る場合は</span><a href='<s:url action="HomeAction"/>'>こちら</a>
	</div>
	<div id="footer">
		Copyright &copy PRODUCTION STORE All rights
	</div>

</body>

</html>