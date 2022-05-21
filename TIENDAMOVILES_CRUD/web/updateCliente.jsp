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
      
            String update = "UPDATE cliente SET "
                           + "NomCli='" + request.getParameter("NomCli")
                           + "', ApeCli='" + (request.getParameter("ApeCli"))
                           + "',  DNI='" + request.getParameter("DNI")
                           + "' , email='" + request.getParameter("email")
                           + "' WHERE clienteID=" + Integer.valueOf(request.getParameter("clienteID"));
            
            s.execute(update);
            response.sendRedirect("dashboard.jsp");
    
    
    
    %>
      
      
      %>
  </body>
</html>
