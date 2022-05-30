<%-- 
    Document   : loginç
    Created on : 15-may-2022, 21:46:26
    Author     : usuario
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <%
              
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendamoviles","admin","admin");
                    Statement st = conexion.createStatement();
                    request.setCharacterEncoding("UTF-8");     
                    
                    String consulta = "SELECT COUNT(*) FROM cliente WHERE email='"
              +request.getParameter("email")
              +"'AND pass='"
              +request.getParameter("pass")
              +"'";
      
      ResultSet rs = st.executeQuery(consulta);
      rs.next();
      
      if (rs.getInt(1) == 0){
        out.println("accesso denegado");
      }else {
        response.sendRedirect("dashboard.jsp");
      }
           %>
  </body>
</html>
