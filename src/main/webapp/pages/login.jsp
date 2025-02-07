
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
    <%@include file="/import/import.jsp" %>
</head>
<body>
<div id="wrapper">
    <main>
        <form action="${pageContext.request.contextPath}/login" method="POST">
        <fieldset>
            <legend>Login here : </legend>
            <div>
                <label for="email">E-mail : </label>
                <input type="text" id="email" name="email">
            </div>
            <div>
                <label for="password">Password : </label>
                <input type="password" id="password" name="password">
            </div>
            <div class="clickHere2">
                <button type="submit">Welcome Mate :)</button>
            </div>
        </fieldset>
        </form>
    </main>
</div>

</body>
</html>
