<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Omicrown
  Date: 04.06.2015
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Добро пожаловать</title>
</head>
<body>
<h4> Добро пожаловать! </h4>
Поздравляем, вы <b>${visitorCount}</b> посетитель и можете выиграть поездку в столицу Java - Джакарту <br/>

<a href="http://clck.yandex.ru/redir/dtype=stred/pid=7/cid=1228/*http://pogoda.yandex.ru/jakarta">
    <img src="http://info.weather.yandex.net/jakarta/2.ru.png" border="0" alt=""/>
    <img width="1" height="1"
         src="http://clck.yandex.ru/click/dtype=stred/pid=7/cid=1227/*http://img.yandex.ru/i/pix.gif" alt=""
         border="0"/></a>
<br>
<a href="<c:url value="/users.html"/>">Показать пользователей</a>
</body>
</html>