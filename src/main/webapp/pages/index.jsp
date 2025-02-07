<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <%@include file="/import/import.jsp" %>
</head>
<body>
<div id="wrapper">
  <h1><%= "Plateforme Voisins!" %></h1>
  <br/>
  <p  class="log"><a href="/register">Register is here Brudah</a></p>
  <p class="log"><a href="/login">Or Login from here</a></p>
  <p class="log"><a  href="/logout">Get the fuck out of here MFCKer !</a></p>
</div>

</body>
</html>