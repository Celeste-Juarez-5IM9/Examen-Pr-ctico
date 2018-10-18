
package mx.edu.ipn.cecyt9.anicare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.ipn.cecyt9.anicare.model.Registro;
import mx.edu.ipn.cecyt9.anicare.utils.Conexion;

/**
 *
 * @author Alumno
 */
public class ConsultaServlet extends HttpServlet {

   private Connection conex;
   private ResultSet res = null;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        Conexion con = new Conexion();
        con.conecta();
        conex = con.getConnection();
      
        
        String consulta = request.getParameter("consulta");
        
        final String sel = "select * from registro where nombre = '"+consulta+"'; ";

        try {
            con.query(sel);
            
            if (res.next()) {
               
                String nom = res.getNString("nombre");
                String ape = res.getNString("apellido");
                String ape2 = res.getString("apellido_2");
                
               String esc=  res.getString("escuela");
               String mat=  res.getString("materia");
               String dep = ("deporte");
                 
                out.println("<html>");
                out.println("<head>");
                out.println("<title>");
                out.println("</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("Nombre: " + nom);
                out.println("Apellido paterno: " + ape);
                out.println("Apellido materno: " + ape2);
                out.println("Escuela: " + esc);
                out.println("Materia favorita: " + mat);
                out.println("Deporte favorito: " + dep);
                out.println("</body>");
                out.println("</html>");
               
            }
            conex.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
       
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
