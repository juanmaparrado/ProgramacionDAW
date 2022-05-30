

<%@page import="conexion.ConexionBBDD"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
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
	  ConexionBBDD s = new ConexionBBDD();
      
      String delete = "DELETE FROM producto WHERE productoID = '"
                                    + Integer.valueOf(request.getParameter("productoID"))+"'";
      s.ejecutaSQL(delete);
      response.sendRedirect("dashboard.jsp");
      
      %>
  </body>
</html>
