<%-- 
    Document   : nuevoCliente
    Created on : 17-may-2022, 3:10:55
    Author     : usuario
--%>

<%@page import="conexion.ConexionBBDD"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Nuevo cliente</title>
  </head>
  <body>
      <%
	  ConexionBBDD s = new ConexionBBDD();
      
       request.setCharacterEncoding("UTF-8");
       
       String consultaemail = "SELECT * FROM cliente WHERE email='"
                                + request.getParameter("email")+"'"; 
       
       ResultSet listadoemail = s.consultaDatos(consultaemail);
       
       if (listadoemail.getRow() != 0) {
        out.println("No se ha podido dar de alta, ya existe una registro con el email " + request.getParameter("email") );
       }else{
          String insert = "INSERT INTO cliente (NomCli, ApeCli, DNI, email , pass) VALUES ('"
                  +request.getParameter("NomCli")+"','"
                  +request.getParameter("ApeCli")+"','"
                  +request.getParameter("DNI")+"','"
                  +request.getParameter("email")+"','"
                  +request.getParameter("pass")+"')";
          s.ejecutaSQL(insert);
          response.sendRedirect("dashboard.jsp");
       }
      
      
      
      %>
  </body>
</html>
