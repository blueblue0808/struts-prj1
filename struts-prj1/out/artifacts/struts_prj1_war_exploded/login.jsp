<%--
  Created by IntelliJ IDEA.
  User: 86135
  Date: 2023/11/3
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>登录</title>
</head>
<body>
<s:fielderror/>
<form action="login" method="post">
<%--使用method方法--%>
<%--<form action="userAction" method="post">--%>
<%--    使用DMI方法--%>
<%--<form action="userAction!login" method="post">--%>
<%--使用通配符方法--%>
<%--<form action="loginAction" method="post">--%>
    请输入用户名：<input name="loginUser.username" type="text"><BR>
    请输入密码：<input name="loginUser.password" type="password">
    <input type="submit" value="登录">
<%--    <s:submit value="登录" method="login"/>--%>
</form>
<s:actionerror/>
</body>
</html>

