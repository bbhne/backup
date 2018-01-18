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

	<title>zahura_buyItemConfirm</title>
	<script type="text/javascript">
		function submitAction(url) {
			$('form').attr('action',url);
			$('form').submit();
		}
	</script>
</head>

<body>
<div id="header">
	<a href="home.jsp"><img alt="" src="./image/phanpro.png"></a>
</div>
<div id="main">
	<p>BuyItemConfirm</p>

	<s:form>
		商品名
		<s:property value="session.buyItem_name"/><br>

		値段
		<s:property value="session.total_price"/><span>円</span><br>

		購入個数
		<s:property value="session.count"/><span>個</span><br>

		支払い方法
		<s:property value="session.pay"/><br>


	<input type="button" value="戻る"
	onclick="location.href='HomeAction'"/>
	<input type="button" value="完了"
	onclick="location.href='BuyItemConfirmAction'"/>
	</s:form>
	</div>
<div id="footer">
		Copyright &copy PRODUCTION STORE All rights
</div>

</body>

</html>