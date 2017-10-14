<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form:form method="GET" action="/showSpecificUsers">
        <h1>Hi, Welcome to our super-puper secret page!</h1>
        <p>Next, you can see the full list of
            <select name="gender">
                <option value="FEMALE" selected>girls</option>
                <option value="MALE">boys</option>
            </select>

            and you can specify their age

            <select name="age">
                <option value="18">18</option>
                <option value="20">20</option>
            </select>

            <button type="submit">Submit</button></p>
        </p>
    </form:form>
</body>
</html>