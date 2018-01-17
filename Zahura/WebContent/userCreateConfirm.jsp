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

	<title>zahura_userCreateConfirm</title>

</head>

<body>

	<p>UserCreateConfirm</p>

	登録する内容は以下でよろしいですか。

	<s:form action="UserCreateCompleteAction">
		<label>ログインID</label><br>
			<s:property value="loginUserId" escape="false"/><br>

		<label>ログインPASS</label><br>
			<s:property value="loginPassword" escape="false"/><br>

		<label>ユーザー名</label><br>
			<s:property value="userName" escape="false"/><br>

			<s:submit value="完了"/>

	</s:form>

</body>

</html>