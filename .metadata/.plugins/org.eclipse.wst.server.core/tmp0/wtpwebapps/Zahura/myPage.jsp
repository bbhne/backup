<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>

	<link rel="stylesheet" type="text/css" href="./css/style2.css">

	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>

	<title>zahura_myPage</title>

</head>

<body>
<div id="header">
	<a href="home.jsp"><img alt="" src="./image/phanp.png"></a>
</div>
<div id="main">
	<p>マイページ</p>

		<form method="post" enctype="multipart/form-date" action="">
			プロフィール画像変更:<input type="file" name="file"><br>
			<input type="submit" value="完了">
		</form>



	user_id:<s:property value="#session.login_user_id"/><br>
	user_name:<s:property value="#session.username"/><br>
	<s:if test="myPageList == null">
		購入情報はありません。
	</s:if>

	<s:elseif test="message == null">
		購入情報は以下になります。

		<s:iterator value="myPageList">
			<s:property value="itemName"/>
			<s:property value="itemImage"/>
			<s:property value="totalPrice"/><span>円</span>
			<s:property value="totalCount"/><span>個</span>
			<s:property value="payment"/>
			<s:property value="insert_date"/>
		</s:iterator>

		<s:form action="MyPageAction">
			<input type="hidden" name="deleteFlg" value="1">
			<s:submit value="削除" method="delete"/>
		</s:form>
	</s:elseif>

	<s:if test="message != null">
		<s:property value="message"/>
	</s:if>

	<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
	<p>ログアウトする場合は<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
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