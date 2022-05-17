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
      
            String update = "UPDATE producto SET "
                           + "proveedor='" + request.getParameter("proveedor")
                           + "', NomProd='" + (request.getParameter("NomProd"))
                           + "',  precio='" + Integer.valueOf(request.getParameter("precio"))
                           + "' , cantPro='" + Integer.valueOf(request.getParameter("cantPro"))
                           + "' WHERE productoID=" + Integer.valueOf(request.getParameter("productoID"));
            
            s.execute(update);
            response.sendRedirect("dashboard.jsp");
    
    
    
    %>
      
      
      %>
  </body>
</html>
