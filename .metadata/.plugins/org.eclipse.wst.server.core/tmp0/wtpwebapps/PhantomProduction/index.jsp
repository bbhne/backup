<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<link rel="stylesheet" type="text/css" href="css/style.css" >
<link rel="stylesheet" type="text/css" href="css/jquery.bxslider.css" >
<title>PHANTOM PRODUCTION</title>
</head>
<body>
	<div id="header">
		<img  src="./image/phanp.png">
	<ul>
	<li><a href="">ログイン</a></li>
	<li><a href="">新規登録</a></li>
	<li><a href="">ヘルプ</a></li>
	</ul>

	<div id="pan">
	Index
	</div>

	</div>

	<div id="main">

	<div id="menu">
		<div class="menu">
		<h1>シリーズタイトルから探す</h1>
		<a href="">OrcinusBlue</a><br>
		<a href="" >ScarletCode</a><br>
		<a href="">MaximumFear</a>
		</div>

		<div class="menu">
		<h1>ジャンルから探す</h1>
		<a href="">Book</a><br>
		<a href="" >Game</a><br>
		<a href="">Sound</a>
		</div>

		<div class="menu">
		<h1></h1>
		お探しの作品名を入力してください
		<s:form action="SearchAction">
		<s:textfield name="search"/>
		<s:submit value="検索"/>
		</s:form>
		</div>



	</div>


	<div id="content">
	<div id="pick">
	<img src="./image/ao.png" >
	</div>

	<img alt="" src="./image/bor.png">
	<img alt="" src="./image/bogre.png">
	</div>

	</div>

<div id="sita">
	<ul>
		<h1>ご利用方法</h1><li>ご利用ガイド</li><li>お支払方法について</li>
	</ul>
		<ul>
		<h1>このサイトについて</h1><li></li>
		</ul>
			<ul>
			<h1>お問い合わせ</h1><li>お問い合わせはこちら</li><li>よくある質問</li>
			</ul>
</div>

	<div id="footer">
	Copyright &copy PHANTOM PRODUCTION STORE All rights
	</div>

</body>
</html>