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

	<title>zahura_buyItemComplete</title>

</head>

<body>

	<p>BuyItemComplete</p>

	<p>購入手続きが完了致しました。</p>

	<a href='<s:url action="MyPageAction"/>'>マイページ</a>から購入履歴の確認が可能です。
	<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>

</body>

</html>