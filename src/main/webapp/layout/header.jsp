
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<header>
  <ul class="bar-haut">
    <li>LOGO</li>
    <c:if test="${currentUser == null}">
      <li>Tu n'es pas connecté</li>
    </c:if>
    <c:if test="${currentUser != null}">
      <li>Tu es connecté avec : <span class="colorSpan">${currentUser}</span> </li>
    </c:if>
  </ul>
</header>
