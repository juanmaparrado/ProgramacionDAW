
<%@page import="conexion.ConexionBBDD"%>
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
                    <h3 class="fs-4 mb-3">Productos</h3>
                    <div class="col">
    <table class="table bg-white rounded shadow-sm  table-hover">
      <tr>
                                    <th scope="col" width="50">#</th>
                                    <th scope="col">Proveedor</th>
                                    <th scope="col">Modelo</th>
                                    <th scope="col">Precio</th> 
                                    <th scope="col">Stock</th> 
                                    
       </tr>
      <tr>
        <div>
            <form class="login-form text-start" action="modificaProducto.jsp">      
              <tr><td><input type="text" name="productoID" value="<%=request.getParameter("productoID") %>"></td>
              <td><input type="text" name="proveedor" value="<%=request.getParameter("proveedor") %>"></td>
              <td><input type="text" name="NomProd" value="<%=request.getParameter("NomProd") %>"></td>
              <td><input type="text" name="precio" value="<%=Integer.valueOf(request.getParameter("precio") )%>"></td>
              <td><input type="text" name="cantPro" value="<%=Integer.valueOf(request.getParameter("cantPro")) %>"></td>
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
        


       ConexionBBDD s = new ConexionBBDD();
      
            String update = "UPDATE producto SET "
                           + "proveedor='" + request.getParameter("proveedor")
                           + "', NomProd='" + (request.getParameter("NomProd"))
                           + "',  precio='" + Integer.valueOf(request.getParameter("precio"))
                           + "' , cantPro='" + Integer.valueOf(request.getParameter("cantPro"))
                           + "' WHERE productoID=" + Integer.valueOf(request.getParameter("productoID"));
            
            s.ejecutaSQL(update);
              
    
    %>
    
    
  </body>
</html>
