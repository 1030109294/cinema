<%--
  Created by IntelliJ IDEA.
  User: 17925
  Date: 2021/12/25
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>登录界面</title>

</head>
<body>
<form action="login.do">
            <input  type="text" placeholder="用户名" name="username" id="username"/>
            <input  type="password" placeholder="密码" name="password" id="password"/>
        <button type="submit" id="submitBtn" style="width: 350px; top: 45px;">登录</button>
</form>

<script type="text/javascript" src="js/jquery-1.11.1-min.js"></script>

</body>
</html>
