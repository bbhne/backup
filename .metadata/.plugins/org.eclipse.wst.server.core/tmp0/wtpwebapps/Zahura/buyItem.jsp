<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>





<!DOCTYPE html>
<html>
<head>

	<link rel="stylesheet" type="text/css" href="./css/style2.css">
	<link rel="stylesheet" type="text/css" href="./css/buy_item.css">
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>

	<title>zahura_buyItem</title>
<script>
function goFavoriteAction(){
	document.getElementById('form').action = 'FavoriteAction';
	}
</script>


</head>

<body>

		<div id="header">
		<a href="index.jsp"><img alt="" src="./image/phanp.png"></a>

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
<p>BuyItem</p>


	<s:if test="errorMessage!=null">
		<s:property value="errorMessage"/>
	</s:if>
	<s:form id="form" name="form" action="BuyItemAction">
	<table>
	<tr>
		<th><span>商品ID</span></th>
		<th><span>商品名</span></th>
		<th><span>商品イメージ</span></th>
		<th><span>値段</span></th>
		<th><span>購入個数</span></th>
	</tr>

	<s:iterator  value="buyItemList">
	<tr><s:property value="%{id}"/></tr>
	<s:hidden name="itemTransactionId" value="%{id}"/>
	<s:hidden name="userMasterId" value="%{userMasterId}"/>
	<tr>
		<td><s:property value="itemName"/></td>
		<s:hidden name="itemName" value="%{itemName}"/>

		<td><img src='<s:property value="itemImage"/>' class="resize" /></td>
		<s:hidden name="itemImage" value="%{itemImage}" />


		<td><s:property value="itemPrice"/><span>円</span></td>
		<s:hidden name="itemPrice" value="%{itemPrice}"/>

		<td><select name="count">
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		</select></td>

		<td><s:checkbox name="checkList" value="checked" fieldValue="%{id}"/></td>
		<s:hidden name="itemStock" value="%{itemStock}"/>
	</s:iterator>
	</table>
		<span>支払い方法</span><br>

		<input type="radio" name="pay" value="1" checked="checked">現金払い
		<input type="radio" name="pay" value="2">クレジットカード
		<s:hidden name="pay" value="%{pay}"/>
	<s:submit value="購入"/>

		<s:hidden name="userMasterId" value="%{userMasterId}"/>
	  <input type="submit" value="ブックマーク" onclick="goFavoriteAction();" />

	</s:form>


	<p>前画面へ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
	<p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
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