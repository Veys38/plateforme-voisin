<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Fuck You !</h1>
    <main>
        <form action="${pageContext.request.contextPath}/register" method="post">
            <fieldset>
                <legend>Register</legend>
                    <div>
                        <label for="firstname">First Name : </label>
                        <input type="text" id="firstname" name="firstname">
                    </div>
                    <div>
                        <label for="lastname">Last Name : </label>
                        <input type="text" id="lastname" name="lastname">
                    </div>
                    <div>
                        <label for="email">E-mail : </label>
                        <input type="text" id="email" name="email">
                    </div>
                    <div>
                        <label for="password">Password :</label>
                        <input type="password" id="password" name="password">
                    </div>
                    <button type="submit">Click the fucking here mate !</button>
            </fieldset>
        </form>

    </main>

</body>
</html>
