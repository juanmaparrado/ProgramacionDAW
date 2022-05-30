<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="conexion.ConexionBBDD"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!--css bootsrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" />
     <!--box icons iconos pagina-->
    <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
     <!--hoja estilo-->
    
    <title>Interfaz CRUD</title>
    <link rel="shortcut icon" href="./img/favicon-96x96.png" type="image/x-icon">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@300&display=swap" rel="stylesheet">

    <style>
      *{
  font-family: 'Ubuntu';
}

  .primary-text {
    color:  #009d63;
    }
  
  .second-text {
    color:  #bbbec5;
  }
  
  
  .rounded-full {
    border-radius: 100%;
  }
  
  #wrapper {
    overflow-x: hidden;
   
  }
  
  #sidebar-wrapper {
    min-height: 100vh;
    margin-left: -15rem;
    -webkit-transition: margin 0.25s ease-out;
    -moz-transition: margin 0.25s ease-out;
    -o-transition: margin 0.25s ease-out;
    transition: margin 0.25s ease-out;
  }
  
  #sidebar-wrapper .sidebar-heading {
    padding: 0.875rem 1.25rem;
    font-size: 1.2rem;
  }
  
  #sidebar-wrapper .list-group {
    width: 15rem;
  }
  
  #page-content-wrapper {
    min-width: 100vw;
  }
  
  #wrapper.toggled #sidebar-wrapper {
    margin-left: 0;
  }
  
  #menu-toggle {
    cursor: pointer;
  }
  
  .list-group-item {
    border: none;
    padding: 20px 30px;
  }
  
  .list-group-item.active {
    background-color: transparent;
    color:  #009d63;
    font-weight: bold;
    border: none;
  }
  
  .btn{
    border: none ;
    outline: none;
    height: 50px;
    border-radius: 4px;
    font-weight: bold ;
}
.btn:hover{
    background-color: white;
    border: black 1px solid;
    color: black;
   ;
}
  
  @media (min-width: 768px) {
    #sidebar-wrapper {
      margin-left: 0;
    }
  
    #page-content-wrapper {
      min-width: 0;
      width: 100%;
    }
  
    #wrapper.toggled #sidebar-wrapper {
      margin-left: -18rem;
   
    }
    



}
    </style>
</head>

<body>
  
  
  
 
    <div class="d-flex" id="wrapper">
         
           <%   
       /*conexion base de datos*/
       
     ConexionBBDD s = new ConexionBBDD();
     ConexionBBDD u = new ConexionBBDD();
     ConexionBBDD p = new ConexionBBDD();
           
      request.setCharacterEncoding("UTF-8");
      
      
      ResultSet clientes = s.consultaDatos ("SELECT * FROM cliente");
      ResultSet productos = u.consultaDatos("SELECT * FROM producto");
      ResultSet pedido = p.consultaDatos("SELECT * FROM pedidos");
      
      
    %>


        <!-- Contenido Central  -->
        <div id="page-content-wrapper">
            <!--BARRA NAVEGACION-->
            <nav class="navbar navbar-expand-lg navbar-light bg-transparent py-4 px-4">
                <div class="d-flex align-items-center">
                    <i class="bx bx-align-left primary-text fs-2 me-3" id="menu-toggle"></i>
                    <h2 class="fs-2 m-0">Dashboard</h2>
                </div>

                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <!--USUARIO DERECHA-->
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle second-text fw-bold" href="#" id="navbarDropdown"
                                role="button" data-bs-toggle="dropdown"  aria-expanded="false">
                                <i class="bx bxs-user fs-3 me-2"></i>
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="#">Profile</a></li>
                                <li><a class="dropdown-item" href="#">Settings</a></li>
                                <li><a class="dropdown-item" href="index.jsp" onclick="confirm('Estás seguro de que quieres SALIR?')">Logout</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
            
            
            <!--TABLA clientes-->
            <div class="container-fluid px-5">
              
                <div class="row my-5">
                    <h3 class="fs-4 mb-3">Clientes</h3>
                    <div class="col">
                        <table class="table bg-white rounded shadow-sm  table-hover">
                            <thead>
                                <tr>
                                    <th scope="col" width="50">#</th>
                                    <th scope="col">Nombre</th>
                                    <th scope="col">Apellidos</th>
                                    <th scope="col">DNI</th> 
                                    <th scope="col">E-mail</th>
                                    <th scope="col">Password</th>
                                    
                                    
                                </tr>
                            </thead>
                            <tbody>
                              
                              <% 
                                
                                while(clientes.next()){
                                
                              %>
                                <tr>
                                  <th scope="row"><%=clientes.getString("clienteID") %> </th>
                                    <td><%=clientes.getString("NomCli") %></td>
                                    <td><%=clientes.getString("ApeCli") %></td>
                                    <td><%=clientes.getString("DNI") %></td>
                                    <td><%=clientes.getString("email") %></td>
                                    <td><%=clientes.getString("pass") %></td>
                                 
                                    
                                    <!-- MODIFICAR CLIENTE -->
                                    <td>
                                      <form action="modificaCliente.jsp">      
                                          <input type="hidden" name="clienteID" value="<%=clientes.getString("clienteID") %>">
                                          <input type="hidden" name="NomCli" value="<%=clientes.getString("NomCli") %>">
                                          <input type="hidden" name="ApeCli" value="<%=clientes.getString("ApeCli") %>">
                                          <input type="hidden" name="DNI" value="<%=clientes.getString("DNI") %>">
                                          <input type="hidden" name="email" value="<%=clientes.getString("email") %>">
                                          <input type="hidden" name="pass" value="<%=clientes.getString("pass") %>">
                                          
                                      
                                          <button type="submit" class = "bx bxs-edit-alt fs-3 text-success" ></button>
                                      
                                      </form>
                                    </td>
                                    
                                    <td>
                                      <form method="get" action="borraCliente.jsp">
                                        
                                        <input type="hidden" name="clienteID" value="<%= clientes.getString("clienteID")%>"/>
                                        <button type="submit" class="btn "><span class="bx bxs-trash text-danger  fs-3"></span></button>
                                        
                                       </form>
                                    </td>

                                </tr>
                           
                                
                               <% } 
                              
                               %>
                               
                                <tr>
                                    <th scope="col" width="50">Nombre</th>
                                    <th scope="col">Apellidos</th>
                                    <th scope="col">DNI</th>
                                    <th scope="col">E-mail</th> 
                                    <th scope="col">Password</th> 
                                </tr>
                               <tr>
                                  <div>
                                    <form method="get" action="nuevoCliente.jsp">
                                 
                                        <tr><td><input type="text" name="NomCli" ></td>
                                          <td><input type="text" name="ApeCli" ></td>
                                          <td><input type="text" name="DNI" size="9" ></td>
                                          <td><input type="text" name="email"></td>
                                          <td><input type="text" name="pass"  ></td></tr>
                                 
                                        <td><button type="submit" class="btn btn-success"  >NUEVO cliente</button></td>
                                      </form>
                                    </div>
                                </tr>
                               
                            </tbody>
                        </table>
                    </div>
                </div>
                               
                            
                             
                            
                            
                    

            </div>
      
       
            <!-- TABLA PRODUCTOS -->
           <div class="container-fluid px-5">
              
                <div class="row my-5">
                    <h3 class="fs-4 mb-3">Productos</h3>
                    <div class="col">
                        <table class="table bg-white rounded shadow-sm  table-hover">
                            <thead>
                                <tr>
                                    <th scope="col" width="50">#</th>
                                    <th scope="col">Proveedor</th>
                                    <th scope="col">Modelo</th>
                                    <th scope="col">Precio</th> 
                                    <th scope="col">Stock</th> 
                                </tr>
                            </thead>
                            <tbody>
                              
                              <% 
                                
                                while(productos.next()){
                                
                              %>
                              
                                <tr>
                                  <th scope="row"><%=productos.getString("productoID") %> </th>
                                    <td><%=productos.getString("proveedor") %></td>
                                    <td><%=productos.getString("NomProd") %></td>
                                    <td><%=productos.getString("precio") %></td>
                                    <td><%=productos.getString("cantPro") %></td>
                                     <td>
                                        <form action="modificaProducto.jsp">      
                                            <input type="hidden" name="productoID" value="<%=productos.getString("productoID") %>">
                                            <input type="hidden" name="proveedor" value="<%=productos.getString("proveedor") %>">
                                            <input type="hidden" name="NomProd" value="<%=productos.getString("NomProd") %>">
                                            <input type="hidden" name="precio" value="<%=productos.getString("precio") %>">
                                            <input type="hidden" name="cantPro" value="<%=productos.getString("cantPro") %>">

                                          <button type="submit" class = "btn "><span class='bx bxs-edit-alt fs-3 text-success'></span></button>

                                        </form>
                                    </td>
                                    <td>
                               
                                      <form method="get" action="borraProducto.jsp">
                                        
                                        <input type="hidden" name="productoID" value="<%= productos.getString("productoID")%>"/>
                                        <button type="submit" class="btn "><span class="bx bxs-trash text-danger  fs-3"></span></button>
                                        
                                       </form>
                                      
                                    </tr>
                                    

                           
                                
                               <% } %>
                               
                               
                            </tbody>
                        </table>
                    </div>
                </div>
                               <table class="table bg-white rounded shadow-sm  table-hover">
                                  <tr>
                                    <th scope="col" width="50">Proveedor</th>
                                    <th scope="col">Modelo</th>
                                    <th scope="col">Precio</th>
                                    <th scope="col">Stock</th> 
                                </tr>
                                <tr>
                                  <div>
                                    <form method="get" action="nuevoProducto.jsp" >
                                 
                                        <tr><td><input type="text" name="proveedor" ></td>
                                          <td><input type="text" name="NomProd" ></td>
                                          <td><input type="text" name="precio"></td>
                                          <td><input type="text" name="cantPro"></td></tr>
                                 
                                        <td><button type="submit" class="btn btn-success"  >NUEVO Producto</button></td>
                                      </form>
                                    </div>
                                </tr>
                               </table>
                               
            
            </div> 
                               
              <!-- TABLA pedidos -->
                       <div class="container-fluid px-5">
              
                <div class="row my-5">
                    <h3 class="fs-4 mb-3">Pedidos</h3>
                    <div class="col">
                        <table class="table bg-white rounded shadow-sm  table-hover">
                            <thead>
                                <tr>
                                    <th scope="col" width="50">#</th>
                                    <th scope="col">Fecha</th>
                                    <th scope="col">Metodo Pago</th>
                                    <th scope="col">ClienteID</th> 
                                     
                                </tr>
                            </thead>
                            <tbody>
                              
                              <% 
                                
                                while(pedido.next()){
                                
                              %>
                                <tr>
                                  <th scope="row"><%=pedido.getString("pedidoID") %> </th>
                                    <td><%=pedido.getString("fechaPed") %></td>
                                    <td><%=pedido.getString("metodoPago") %></td>
                                    <td><%=pedido.getString("clienteID") %></td>
                                    
                                    
                                    
                                    <td>
                                      <form action="modificaPedido.jsp">      
                                          <input type="hidden" name="pedidoID" value="<%=pedido.getString("pedidoID") %>">
                                          <input type="hidden" name="fechaPed" value="<%=pedido.getString("fechaPed") %>">
                                          <input type="hidden" name="metodoPago" value="<%=pedido.getString("metodoPago") %>">
                                          <input type="hidden" name="clienteID" value="<%=pedido.getString("clienteID") %>">
                                          
                                      
                                        <button type="submit" class = "btn"><span class='bx bxs-edit-alt fs-3 text-success'></span></button>
                                      
                                      </form>
                                    </td>
                                    
                                    <td>
                                      <form method="get" action="borraPedido.jsp">
                                        
                                        <input type="hidden" name="clienteID" value="<%= pedido.getString("pedidoID")%>"/>
                                        <button type="submit" class="btn "><span class="bx bxs-trash text-danger  fs-3"></span></button>
                                        
                                       </form>
                                    </td>

                                </tr>
                           
                                
                               <% } 
                              
                               %>
                               
                                <tr>
                                    <th scope="col" >Fecha</th>
                                    <th scope="col">Metodo Pago</th>
                                    <th scope="col">ClienteID</th>
                                    
                                </tr>
                               <tr>
                                  <div>
                                    <form method="get" action="nuevoPedido.jsp">
                                 
                                        <tr><td><input type="text" name="fechaPed" ></td>
                                          <td><input type="text" name="metodoPago" ></td>
                                          <td><input type="text" name="clienteID" ></td></tr>
                                 
                                        <td><button type="submit" class="btn btn-success"  >NUEVO pedido</button></td>
                                      </form>
                                    </div>
                                </tr>
                               
                            </tbody>
                        </table>
                    </div>
                </div>
                               
                            
                             
                            
                            
                    

            </div>   
        
                               
                               
                               
        </div>
    </div>
   
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        var el = document.getElementById("wrapper");
        var toggleButton = document.getElementById("menu-toggle");

        toggleButton.onclick = function () {
            el.classList.toggle("toggled");
        };
    </script>
</body>

</html>