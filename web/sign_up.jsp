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
        <title>Siging up</title>
        <link href="label.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <script>
            function yesnoCheck(that) {
                if (that.value == "driver") {
                    //alert("check");
                    document.getElementById("ifYes").style.display = "block";
                } else {
                    document.getElementById("ifYes").style.display = "none";
                }
            }
        </script>

        <form method="post">
            <div style="overflow: hidden;" align="center">
                <a href=""><img src="images/logo.png" alt="drive commerces"></a>
            </div>
            <h2>Sign up!</h2>
            <select name="type_util" onchange="yesnoCheck(this);">
               <option value="client" >Client</option>
                <option  value="driver" >Driver</option>
            </select>
            <br/>

            <div id="ifYes" style="display: none;">
                Coordonates
                 <label for="longitude">Long</label> 
                 <input type="text" id="longitude" name="longitude" />
                 <label for="latitude">Lat</label> 
                 <input type="text" id="latitude" name="latitude" />
            </div>
            <br />
               
                <label for="name">Name</label>
                <input type="text" name="name"/> <br/><br/>
                <label for="login">Login</label>
                <input type="text" name="login"/><br/><br/>
                <label for="password">Password</label>
                <input type="password" name="password"/><br/><br/>
                <input type="submit" value="send"/>
                <div align="right"><a href="sign_in">Sign in?</a></div>

        </form>
    </body>
</html>

