<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<title>Логин</title>
</head>
<body>
<h1>Добро пожаловать</h1>
<h3>Для начала работы войдите в систему под своим паролем</h3>
<section class="loginform cf">  
<form name="login" action="login" method="get" accept-charset="utf-8">  
    <ul>  
        <li><label for="email">Логин</label>  
        <input type="email" name="usermail" placeholder="yourname@email.com" required></li>  
        <li><label for="password">Пароль</label>  
        <input type="password" name="password" placeholder="password" required></li>  
        <li>  
        <input type="submit" value="Войти"></li>  
    </ul>  
</form>  
</section>
</body>
</html>