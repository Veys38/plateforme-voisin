<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <%@include file="/import/import.jsp" %>
</head>
<body>

  <%@include file="/layout/header.jsp" %>
  <%@include file="/layout/section.jsp" %>

  <div id="wrapper">
    <h1><%= "Plateforme Voisins!" %></h1>
    <br/>
    <c:if test="${currentUser == null}">
      <p  class="log"><a href="/register">Register is here Brudah</a></p>
      <p class="log"><a href="/login">Or Login from here</a></p>
    </c:if>
    <c:if test="${currentUser != null}">
    <form action="${pageContext.request.contextPath}/index" method="POST">
      <p  class="log"><button type="submit">Get the fuck out of here MFCKer !</button></p>
    </form>
    </c:if>
  </div>

</body>
</html>