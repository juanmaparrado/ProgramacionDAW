<%-- 
    Document   : updateCliente
    Created on : 17-may-2022, 2:30:12
    Author     : usuario
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>modificando cliente</title>
  </head>
  <body>
    
    <%
         
         request.setCharacterEncoding("UTF-8");
        


      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendamoviles","admin","admin");
      Statement s = conexion.createStatement();
      
            String update = "UPDATE pedidos SET "
                           + "fechaPed='" + request.getParameter("fechaPed")
                           + "', metodoPago='" + (request.getParameter("metodoPago"))
                           + "',  clienteID='" + Integer.valueOf(request.getParameter("clienteID"))
                           + "' WHERE pedidoID=" + Integer.valueOf(request.getParameter("pedidoID"));
            
            s.execute(update);
            response.sendRedirect("dashboard.jsp");
    
    
    
    %>
      
      
      %>
  </body>
</html>
