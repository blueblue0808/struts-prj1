<%--
  Created by IntelliJ IDEA.
  User: 86135
  Date: 2023/11/3
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <s:head theme="xhtml"/>
</head>
<body>
<s:form action="register" method="post">
<%--使用method方法--%>
<%--<s:form action="userAction" method="post">--%>
<%--        使用DMI方法--%>
<%--<s:form action="userAction!register" method="post">--%>
<%--使用通配符方法--%>
<%--<s:form action="registerAction" method="post">--%>
    <s:textfield name="loginUser.username" label="请输入用户名"/>
    <s:password name="loginUser.password" label="请输入密码"/>
    <s:password name="loginUser.repassword" label="请确认密码"/>
    <s:textfield name="loginUser.name" label="请输入真实姓名"/>
    <s:radio name="loginUser.sex" list="#{1 : '男', 0 : '女'}" label
            ="请输入性别"/>
    <s:textfield name="loginUser.birthday" label="请输入生日
(yyyy-MM-dd)">
        <s:param name="value">
            <s:date name="loginUser.birthday" format="yyyy-MM-dd"/>
        </s:param>
    </s:textfield>
    <s:textfield name="loginUser.address" label="请输入联系地址"/>
    <s:textfield name="loginUser.phone" label="请输入联系电话"/>
    <s:textfield name="loginUser.email" label="请输入电子邮箱"/>
<%--    <s:textarea name="description" label="个性签名" rows="5" cols="30" />--%>
<%--    <s:select name="gender" label="充会员" list="#{'Y':'会员','N':'非会员'}" />--%>
<%--    <s:file name="fileUpload" label="上传文件" />--%>
    <s:submit value="注册"/>
<%--    method方法--%>
<%--    <s:submit value="注册" method="register"/>--%>
    <s:reset value="重置"/>
</s:form>
</body>
</html>

