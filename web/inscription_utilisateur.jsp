<%-- 
    Document   : inscription_utilisateur
    Created on : 29 juin 2016, 18:32:33
    Author     : Pro
--%>

<!--ajouter library jstl sinon $.. ne fonctionne pas-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Template Page</title>
        
    </head>
    <body>
        
            <form method="post">
                <div class="form-group">
                    <label for="exampleInputEmail1">Identifiant:</label>
                    <input name="login" type="text" placeholder="identifiant">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Mot de passe:</label>
                    <input  name="mdp" type="password"  placeholder="mot de passe">
                </div>
                <button type="submit"  class="btn btn-default">Valider</button>
            </form>
       
        </div>
    </body>
</html>

