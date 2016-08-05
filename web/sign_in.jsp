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
        <link href="label.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        
        <form method="post">
            <div style="overflow: hidden;" align="center">
            <a href=""><img src="images/logo.png" alt="drive commerces"></a>
            </div>
            <h2>Sign in to your account</h2>
            <label for="login">Login</label>
            <input type="text" name="login" id="login"/> <br/><br/>
            <label for="pass">Password</label>
            <input type="password" name="password" id="password"/> <br/><br/>
            <input type="submit" value="Sign in" /> <br/><br/>
            <div align="right"><a href="sign_up">Create an account?</a></div>
        </form>
        
         
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
