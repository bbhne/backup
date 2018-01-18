<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>

	<link rel="stylesheet" type="text/css" href="./css/style.css">
	<link rel="stylesheet" type="text/css" href="./css/favorite_complete.css">
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>

<title>zahura_favoComp</title>
</head>
<body>

<p>favorite_Complete</p>

ブックマーク

<table>
	<tr>
	<th>商品名</th>
	<th>商品画像</th>
	<th>値段</th>
	</tr>
	<s:iterator value="favoriteList">
	<tr>
	<td><s:property value="itemName"/></td>
	<td><img src='<s:property value="itemImage"/>' class="resize"/></td>
	<td><s:property value="itemPrice"/>円</td>
	</tr>
	</s:iterator>
	</table>



</body>
</html>