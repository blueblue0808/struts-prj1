<%--
  Created by IntelliJ IDEA.
  User: 86135
  Date: 2023/11/3
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>注册成功</title>
</head>
<body>
<!-- 数据标签 property -->
<s:property value="loginUser.username"/>
<!-- 控制标签 if/else -->
<s:if test='loginUser.sex=="1"'>
    <s:text name="先生，"/>
</s:if>
<s:else>
    <s:text name="女士，"/>
</s:else>
您注册成功了！
<!-- 数据标签 set -->
<s:set var="user" value="loginUser" scope="session"/>
</body>
</html>

