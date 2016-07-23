<%-- 
    Document   : Connexion
    Created on : 24 juil. 2016, 00:35:14
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
        <h1>Sign in to your account!</h1>
        <form action="sign_in" name="form" id="form">
            Login : <br/>
            <input type="text" name="login" id="login"/> <br/><br/>
            Password : <br/>
            <input type="password" name="password" id="password"/> <br/><br/>
            <input type="submit" value="Sign in" /> <br/><br/>
       </form>
        <a href="sign_up">Create an account?</a> 
        <script src="js/jquery-2.1.4.js">
            $.ajax({
                    type: 'POST',
                    url: $(this).attr("action"),
                    data: $(this).serialize(),
                    dataType: 'html',
                    success: function (data) {
                        iw.setContent(data);
                        iw.open(map, marker);
                    }
                });
        </script>
    </body>
</html>
