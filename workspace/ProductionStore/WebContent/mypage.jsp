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

マイページ
		<s:form action="LoginAction">
		login_user_id:<s:property value="session.login_user_id"/><br>
		password:<s:property value="password"/><br>
		username:<s:property value="username"/><br>
		</s:form>

<div class="ico"><img alt="" src="./image/ogre2.png" height="300px"></div>

<div class="myp_jiko">a</div>

	<s:if test="myPageList == null">
		<h4>購入情報はありません。</h4>
	</s:if>

	<s:elseif test="message == null">
	<h4>購入情報はいかになります。</h4>
		<table border="1">
		<!--
		<tr>
		<th>商品名</th>
		<th>商品画像</th>
		<th>値段</th>
		<th>購入個数</th>
		<th>支払い方法</th>
		<th>購入日</th>
		</tr>
		 -->
		<s:iterator value="myPageList">
		<tr>
		<!-- <td><s:property value="itemName"/></td> -->
		<td>
		<s:property value="itemName"/><br>
		<img src='<s:property value="itemImage"/>'/>

		</td>
		<td><s:property value="totalPrice"/></td>
		<td><s:property value="totalCount"/></td>
		<td><s:property value="payment"/></td>
		<td><s:property value="insert_date"/></td>
		<!--
		<td><s:property value="userName"/></td>
		<td><s:property value="user_account"/></td>
		<td><s:property value="buyItem"/></td>
		 -->
		</tr>
		</s:iterator>
		</table>

		<s:form action="MypageAction">
			<input type="hidden" name="deleteFlg" value="1">
			<s:submit value="削除" method="delete"/>
		</s:form>
	</s:elseif>

	<s:if test="message != null">
		<h4><s:property value="message"/></h4>
	</s:if>
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