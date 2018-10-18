package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>PreExamen - Registro</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("           \n");
      out.write("                    <h1>Registro</h1>\n");
      out.write("                      <form method=\"POST\" action=\"../RegistroServlet\">\n");
      out.write("                                    \n");
      out.write("                          <label for=\"Nombre\" class=\"active\">Nombre:</label> <input type=\"text\" name=\"nombre\" id=\"nombre\" class=\"validate\"> <BR><BR>\n");
      out.write("                            \n");
      out.write("                                   \n");
      out.write("                          <label for=\"apellido\" class=\"active\">Apellido paterno:</label> <input type=\"text\" name=\"apellido\" id=\"apellido\" class=\"validate\"><BR><BR>\n");
      out.write("                                    \n");
      out.write("                                   \n");
      out.write("                          <label for=\"ape_mat\" class=\"active\"> Apellido materno</label>  <input type=\"text\" name=\"ape_mat\" id=\"ape_mat\" class=\"validate\"><BR><BR>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                          <label for=\"escuela\" class=\"active\"> Escuela</label> <input type=\"text\" name=\"escuela\" id=\"escuela\" class=\"validate\"><BR><BR>\n");
      out.write("                                    \n");
      out.write("                                   \n");
      out.write("                          <label for=\"materia\" class=\"active\"> Materia Favorita</label>  <input type=\"text\" name=\"materia\" id=\"materia\" class=\"validate\"><BR><BR>\n");
      out.write("                                    \n");
      out.write("                                   \n");
      out.write("                          <label for=\"deporte\" class=\"active\"> Deporte</label>  <input type=\"text\" name=\"deporte\" id=\"deporte\" class=\"validate\"><BR><BR>\n");
      out.write("                                    \n");
      out.write("                                    <input type=\"submit\" value=\"ENVIAR\">\n");
      out.write("                      </form>\n");
      out.write("                            \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
