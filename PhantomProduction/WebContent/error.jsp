<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
error
<s:iterator value="#session.account_id">
<s:property value="account_id"/>
</s:iterator>
<p>ログインしてるユーザー情報</p>
		<s:iterator value="#session.loginUser">
		<s:property value="userNumber"/><br>
		<s:property value="accountId"/><br>
		<s:property value="userName"/><br>
		<s:property value="userPassword"/><br>
		<s:property value="userMail"/><br>
		</s:iterator>
</body>
</html>