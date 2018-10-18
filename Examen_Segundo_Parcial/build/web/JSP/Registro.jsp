

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PreExamen - Registro</title>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>

       
    </head>
    <body>
        

           
                    <h1>Registro</h1>
                      <form method="POST" action="../RegistroServlet">
                                    
                          <label for="Nombre" class="active">Nombre:</label> <input type="text" name="nombre" id="nombre" class="validate"> <BR><BR>
                            
                                   
                          <label for="apellido" class="active">Apellido paterno:</label> <input type="text" name="apellido" id="apellido" class="validate"><BR><BR>
                                    
                                   
                          <label for="ape_mat" class="active"> Apellido materno</label>  <input type="text" name="ape_mat" id="ape_mat" class="validate"><BR><BR>
                                    
                                    
                          <label for="escuela" class="active"> Escuela</label> <input type="text" name="escuela" id="escuela" class="validate"><BR><BR>
                                    
                                   
                          <label for="materia" class="active"> Materia Favorita</label>  <input type="text" name="materia" id="materia" class="validate"><BR><BR>
                                    
                                   
                          <label for="deporte" class="active"> Deporte</label>  <input type="text" name="deporte" id="deporte" class="validate"><BR><BR>
                                    
                                    <input type="submit" value="ENVIAR">
                      </form>
                            
</body>
</html>












