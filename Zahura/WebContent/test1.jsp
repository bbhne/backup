<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>test</title>

</head>
<body>
db-itiran-hyouji
<br>

<table>
<tbody>
<tr>
	<th>id</th>
	<th>item_name</th>
	<th>item_price</th>
</tr>
<s:iterator value="TestList">
<tr>
<s:property value="id"/>
<td><s:property value="itemName"/></td>
<td><s:property value="itemPrice"/></td>
</tr>
</s:iterator>
<s:iterator value="#session.TestList">
<tr>
<s:property value="id"/>
<td><s:property value="itemName"/></td>
<td><s:property value="itemPrice"/></td>
</tr>
</s:iterator>
</tbody>
</table>

</body>
</html>