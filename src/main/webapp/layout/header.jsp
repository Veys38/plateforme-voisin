<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<header>
  <ul class="bar-haut">
    <li>LOGO</li>
    <c:if test="${currentUser == null}">
      <li>Tu n'es pas connecté</li>
    </c:if>
    <c:if test="${currentUser != null}">
      <li>Tu es connecté avec : <span class="colorSpan">${currentUser}</span> </li>
    </c:if>
  </ul>
</header>--%>
<header>

    <div class="header-container">
        <div class="header-sous-container">
            <div class="header-left">
                <div class="three-box">
                    <a href="#index.html" title="Retour à la page d'accueil">
                        <img class="index-img" src="../assets/index-1.png" alt="index"></a>
                    <div class="entre-deux">
                        <p></p>
                    </div>
                    <a href="" class="text-version">Plateforme Voisin, c'est quoi<img class="image-version"
                                                                                      src="../assets/point-1.png"
                                                                                      alt=""></a>

                </div>
            </div>
            <div class="header-right">
                <ul class="reminders">
                    <li>
                        <a href="#" class="messages-link">
                            <div class="icon-container">
                                <img class="messages-icone" src="../assets/messages-1.png" alt="">
                                <span class="messages-badge">7</span>
                            </div>
                            <span>Messages</span>
                        </a>
                    </li>
                    <li>
                        <a href="#" class="notifications-link">
                            <div class="icon-container">
                                <img class="notifications-icone" src="../assets/notifications-1.png" alt="">
                                <span class="notifications-badge">15</span>
                            </div>
                            <span>Notifications</span>
                        </a>
                    </li>
                    <li>
                        <a href="#" class="login-link">
                            <span class="login-img"><img src="../assets/profil-1.png" alt=""></span>
                            <span>Mon Profil</span>
                        </a>
                    </li>
                    <li><a href="#" class="language-link">NL</a></li>
                </ul>
            </div>
        </div>
    </div>
</header>



