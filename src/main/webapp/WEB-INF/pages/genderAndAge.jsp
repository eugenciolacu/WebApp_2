<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: eciolacu
  Date: 05-Oct-17
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>All ${gender} of age ${age}</h2>
    <c:forEach items = "${list}" var = "user">
        <p>
            Name: ${user.name} | Password: ${user.password}
        </p>
    </c:forEach>
</body>
</html>
