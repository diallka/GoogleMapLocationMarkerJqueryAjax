<%-- 
    Document   : inscription
    Created on : 23 juil. 2016, 23:50:55
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sign up!</h1>
        <form id="form" action="sign_up">
            Name : <br/>
            <input type="text" name="name"/> <br/><br/>
            Phone: <br/>
            <input type="number" name="phone" min="10" inputmode="numeric"/><br/><br/>
            Login : <br/>
            <input type="text" name="login"/><br/><br/>
            Password : <br/>
            <input type="password" name="password"/><br/><br/>
            <input type="submit" value="send"/>
        </form>
        
      
    </body>
</html>
