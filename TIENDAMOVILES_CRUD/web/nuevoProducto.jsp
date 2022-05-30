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
	  
       request.setCharacterEncoding("UTF-8");
       ConexionBBDD s = new ConexionBBDD();
       
       String consultamodelo = "SELECT * FROM producto WHERE NomProd='"
                                + request.getParameter("NomProd")+"'"; 
       
       ResultSet modelo = s.consultaDatos(consultamodelo);
       
       if (modelo.getRow() != 0) {
        out.println("No se ha podido dar de alta, ya existe una registro con el email " + request.getParameter("email") );
       }else{
          String insert = "INSERT INTO producto (proveedor, NomProd, precio, cantPro) VALUES ('"
                  +request.getParameter("proveedor")+"','"
                  +request.getParameter("NomProd")+"','"
                  +Integer.valueOf(request.getParameter("precio"))+"','"
                  +Integer.valueOf(request.getParameter("cantPro"))+"')";
          s.ejecutaSQL(insert);
          response.sendRedirect("dashboard.jsp");
       }
      
      
      
      %>
  </body>
</html>
