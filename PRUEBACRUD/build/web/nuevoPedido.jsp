<%-- 
    Document   : nuevoCliente
    Created on : 17-may-2022, 3:10:55
    Author     : usuario
--%>

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
	  Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendamoviles","admin","admin");
      Statement s = conexion.createStatement();
      
       request.setCharacterEncoding("UTF-8");
       
          String insert = "INSERT INTO pedidos (fechaPed, metodoPago, clienteID) VALUES ('"
                  +request.getParameter("fechaPed")+"','"
                  +request.getParameter("metodoPago")+"','"
                  +request.getParameter("clienteID")+"')";
          s.execute(insert);
          response.sendRedirect("dashboard.jsp");
       }
      
      
      
      %>
  </body>
</html>
