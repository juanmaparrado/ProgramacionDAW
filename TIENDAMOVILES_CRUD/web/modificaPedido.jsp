
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!--css bootsrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" />
     <!--box icons iconos pagina-->
    <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
 
    
    <title>Interfaz CRUD</title>
    <link rel="shortcut icon" href="./img/favicon-96x96.png" type="image/x-icon">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@300&display=swap" rel="stylesheet">
  </head>
  
  <body>
 
    <!-- FORMULARIO  QUE MODIFICA -->
     <div class="row my-5">
                    <h3 class="fs-4 mb-3">Pedidos</h3>
                    <div class="col">
    <table class="table bg-white rounded shadow-sm  table-hover">
      <tr>
                                    <th scope="col" width="50">#</th>
                                    <th scope="col">Fecha</th>
                                    <th scope="col">Metodo Pago</th>
                                    <th scope="col">ClienteID</th> 
                                   
                                    
       </tr>
      <tr>
        <div>
            <form class="login-form text-start" action="modificaProducto.jsp">      
              <tr><td><input type="text" name="pedidoID" value="<%=request.getParameter("pedidoID") %>"></td>
              <td><input type="text" name="fechaPed" value="<%=request.getParameter("fechaPed") %>"></td>
              <td><input type="text" name="metodoPago" value="<%=request.getParameter("metodoPago") %>"></td>
              <td><input type="text" name="clienteID" value="<%=Integer.valueOf(request.getParameter("clienteID") )%>"></td>
              </tr>

              <td> <a class="btn btn-danger" href="dashboard.jsp">Cancelar</a><td>
              
              <td><button type="submit" class = "bx bxs-edit-alt fs-3 text-success" ></button></td>
              

             </form>
        </div>
      </tr>      
        </table>
                    </div>
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
    
    
  </body>
</html>
