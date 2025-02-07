<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Register</title>
    <%@include file="/import/import.jsp" %>
</head>
<body>
<div id="wrapper">
    <h1>Registration Form</h1>
    <main>
        <form action="${pageContext.request.contextPath}/register" method="POST">
            <fieldset>
                <legend>Your details</legend>
                <div>
                    <label for="firstname">First Name : </label>
                    <input autofocus type="text" id="firstname" name="firstName">
                </div>
                <div>
                    <label for="lastname">Last Name : </label>
                    <input type="text" id="lastname" name="lastName">
                </div>
                <div>
                    <label for="email">E-mail : </label>
                    <input type="text" id="email" name="email">
                </div>
                <div>
                    <label for="password">Password :</label>
                    <input type="password" id="password" name="password">
                </div>
                <div>
                    <label for="phonebumber">Phone Number :</label>
                    <input type="text" id="phonebumber" name="phoneNumber">
                </div>
                <fieldset>
                    <legend>Addess</legend>
                    <div>
                        <input placeholder="Street" type="text" name="street">
                    </div>
                    <div>
                        <input placeholder="Number" type="text" name="number">
                    </div>
                    <div>
                        <input placeholder="Mailbox" type="text" name="mailbox">
                    </div>
                    <div>
                        <input placeholder="City" type="text" name="city">
                    </div>
                    <div>
                        <input placeholder="State" type="text" name="state">
                    </div>
                    <div>
                        <input class="dit" placeholder="Zip" type="text" name="zip">
                    </div>
                </fieldset>
                <div class="clickHere2">
                    <button type="submit">Click the fucking here mate !</button>
                </div>

            </fieldset>
        </form>

    </main>
</div>


</body>
</html>
