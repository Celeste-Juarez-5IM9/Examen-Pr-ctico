
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="mx.edu.ipn.cecyt9.anicare.controller.ConsultaServlet" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta</title>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>

    </head>
    <body>
      

                    <h1>Consulta</h1>
                    
                        <form method="post"  action="../ConsultaServlet">
                        Ingrese el nombre<input type="text" id="consulta" name="consulta">
                        <input type="submit" value="enviar">
                        </form>
                    

</body>
</html>












