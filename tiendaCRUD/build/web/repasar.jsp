<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   	<link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    
	<title>Crud Juanma</title>
</head>
<body>
	 <%
      
	  Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaCRUD","admin","admin");
      Statement s = conexion.createStatement();
      request.setCharacterEncoding("UTF-8");
      ResultSet listado = s.executeQuery ("SELECT * FROM producto");
    %>
    
     <div class="container">
      <div class="row"></div>
      <div class="row s12 m12 l12">
        
          <h3 class="center">ALMACEN MOVILES</h3>
          
            <thead><th>Código</th><th>Nombre</th><th>Proveedor</th><th>Precio</th><th>Cantidad</th></thead>
            <%
              while (listado.next()) {
            %>
                <tr>
                  <td><%=listado.getString("productoID") %></td>
                  <td><%=listado.getString("nombre") %></td>
                  <td><%=listado.getString("proveedor") %></td>
                  <td><%=listado.getString("precio") %></td>
                  <td><%=listado.getString("cantidad") %></td>
                  
                   <form method="post" action="modificaArticulo.jsp">
                    <input type="hidden" name="productoID" value="<%=listado.getString("productoID") %>">
                    <input type="hidden" name="nombre" value="<%=listado.getString("nombre") %>">
                    <input type="hidden" name="proveedor" value="<%=listado.getString("proveedor") %>">
                    <input type="hidden" name="precio" value="<%=listado.getString("precio") %>">
                    <input type="hidden" name="cantidad" value="<%=listado.getString("cantidad") %>">
                    <td>
                    <button class="btn waves-effect waves-light  blue" type="submit" name="editar" title="Modificar artículo">
                      <i class="fa fa-pencil"></i>
                    </button>
                    </td>
                  </form>
                  <form method="post" action="borraArticulo.jsp">
                    <input type="hidden" name="productoID" value="<%=listado.getString("productoID") %>">
                    <td>
                    <button class="btn waves-effect waves-light  red" type="submit" name="borrar" title="Borrar artículo">
                      <i class="fa fa-times"></i>
                    </button>
                    </td>
                  </form>
                  
                </tr>
            <%
              }
            %>
            <form method="post" action="altaArticulo.jsp">
              <tr>
                <td>
                  <div class="input-field">
                    <input type="number" name="productoID" id="productoID" required>
                    <label for="productoID">ProductoID</label>
                  </div>
                </td>
                <td>
                  <div class="input-field">
                    <input type="text" name="nombre" id="nombre">
                    <label for="nombre">nombre</label>
                  </div>
                </td>
                 <td>
                  <div class="input-field">
                    <input type="text" name="proveedor" id="proveedor">
                    <label for="proveedor">proveedor</label>
                  </div>
                </td>
                <td>
                  <div class="input-field">
                    <input type="number" min="0" step="0.01" name="precio" id="precio">
                    <label for="precio">precio</label>
                  </div>
                </td>
                <td>
                  <div class="input-field">
                    <input type="number" min="0" name="cantidad" id="cantidad">
                    <label for="cantidad">stock</label>
                  </div>
                </td>
                <td>
                  <button class="btn waves-effect waves-light center" type="submit" name="aceptar" title="Añadir artículo">
                    <i class="fa fa-plus"></i>
                  </button>
                </td>
              </tr>
            </form>
            
        
      </div>
    </div>


</body>
</html>