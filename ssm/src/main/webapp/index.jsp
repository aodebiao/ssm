<%--
  Created by IntelliJ IDEA.
  User: 呱呱呱
  Date: 2019/5/19
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/testFindAll">测试查询</a>
<h1>测试保存</h1>
<form action="account/testSaveAccount" method="post">
    uid:<input type="number" name="uid"/><br>
    money:<input type="number" name="money"/><br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
