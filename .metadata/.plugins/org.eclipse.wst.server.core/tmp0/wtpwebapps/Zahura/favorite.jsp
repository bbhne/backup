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

	<title>zahura_favorite</title>

	<s:iterator value="favoList">
		<s:property value="itemName"/>
		<s:property value="item"/>
		<s:property value="itemTransaction"/>
	</s:iterator>

		<s:iterator value="#session.favoList">
		<s:property value="itemName"/>
		<s:property value="item"/>
		<s:property value="itemTransaction"/>
	</s:iterator>

</head>

<body>

<p>favorite</p>





</body>

</html>