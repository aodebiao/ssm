<%--
  Created by IntelliJ IDEA.
  User: 呱呱呱
  Date: 2019/5/21
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>查询成功了耶</h1>
    <c:forEach items="${list}" var="account">
        ${account.toString()}<br>
    </c:forEach>

</body>
</html>
