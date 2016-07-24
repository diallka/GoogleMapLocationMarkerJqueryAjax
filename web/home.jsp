<%-- 
    Document   : index
    Created on : 16 juil. 2016, 22:17:07
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Geolocation</title>
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
        <meta charset="utf-8">
        <style>
            html, body {
                height: 100%;
                margin: 0;
                padding: 0;
            }
            #map {
                height: 70%;
            }
        </style>
    </head>
    <body>
        <div id="map">
            <form action="home_page" id="form">
                <input type="hidden" name="i"/>
            </form>
        </div>
        <br/>
        <div> 
                <form action="${pageContext.request.contextPath}/logout" method="post">
                    <input type="submit" name="logout" value="logout">
                </form>
                    <sup>Welcome </sup> ... 
        </div>
        <script src="js/app.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBKxpaAK3n4b5EiiF3m5zcg-pmLpaBuIX8&callback=initMap" async defer></script>
    </body>
</html