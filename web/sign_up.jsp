<%-- 
    Document   : inscription_utilisateur
    Created on : 29 juin 2016, 18:32:33
    Author     : Pro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Template Page</title>
    </head>
    <body>
        <h1>Sign up!</h1>
        <form method="post">
            Name : <br/>
            <input type="text" name="name"/> <br/><br/>
            Phone: <br/>
            <input type="number" name="phone" /><br/><br/>
            Login : <br/>
            <input type="text" name="login"/><br/><br/>
            Password : <br/>
            <input type="password" name="password"/><br/><br/>
            <input type="submit" value="send"/>
        </form>
    </body>
</html>

