<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

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
    <link rel="stylesheet" href="./styles/style.css" />
    <title>Interfaz CRUD</title>
    <link rel="shortcut icon" href="./img/favicon-96x96.png" type="image/x-icon">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@300&display=swap" rel="stylesheet">
</head>

<body>
  <%
      
	  Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaCRUD","admin","admin");
      Statement s = conexion.createStatement();
      request.setCharacterEncoding("UTF-8");
      ResultSet listado = s.executeQuery ("SELECT * FROM producto");
    %>
  
  
    <div class="d-flex" id="wrapper">
        <!-- Sidebar -->

        <div class="bg-white" id="sidebar-wrapper">
            <div class="sidebar-heading text-center py-4 primary-text fs-3 pe-3 fw-bold text-uppercase border-bottom"><i
                    class="bx bx-meteor me-2"></i>JuanmaParrado</div>
            <div class="list-group list-group-flush my-3">

                <a href="#" class="list-group-item list-group-item-action bg-transparent second-text active"><i
                        class="bx bx-tachometer fs-4 me-2"></i>Dashboard</a>

                <a href="#" class="list-group-item list-group-item-action bg-transparent second-text fw-bold"><i
                        class="bx bx-network-chart me-2"></i>Projects</a>

                <a href="#" class="list-group-item list-group-item-action bg-transparent second-text fw-bold"><i
                        class="bx bx-package me-2"></i>Products</a>

                <a href="#" class="list-group-item list-group-item-action bg-transparent second-text fw-bold"><i
                        class="bx bx-paperclip me-2"></i>Reports</a>

                <a href="#" class="list-group-item list-group-item-action bg-transparent second-text fw-bold"><i
                        class="bx bx-paper-plane me-2"></i>Shipments</a>

                <a href="#" class="list-group-item list-group-item-action bg-transparent second-text fw-bold"><i
                        class="bx bx-conversation me-2"></i>Chat</a>

                <a href="#" class="list-group-item list-group-item-action bg-transparent second-text fw-bold"><i
                        class="bx bx-map-alt me-2"></i>Outlet</a>

                <a href="#" class="list-group-item list-group-item-action bg-transparent text-danger fw-bold"><i
                        class="bx bx-power-off me-2"></i>Logout</a>
            </div>
        </div>

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
                                <li><a class="dropdown-item" href="#" onclick="confirm('Estás seguro de que quieres SALIR?')">Logout</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
            
            
            <!--TABLA-->
            <div class="container-fluid px-5">
                <div class="row my-5">
                    <h3 class="fs-4 mb-3">Articulos Almacen</h3>
                    <div class="col">
                        <table class="table bg-white rounded shadow-sm  table-hover">
                            <thead>
                                <tr>
                                    <th scope="col" width="50">#</th>
                                    <th scope="col">Productos</th>
                                    <th scope="col">Proveedor</th>
                                    <th scope="col">Precio</th> 
                                    <th scope="col">Cantidad</th> 
                                </tr>
                            </thead>
                            <tbody>
                              <% while(listado.next()){
                                
                              %>
                                <tr>
                                  <th scope="row"><%=listado.getString("productoID") %> </th>
                                    <td><%=listado.getString("nombre") %></td>
                                    <td><%=listado.getString("proveedor") %></td>
                                    <td><%=listado.getString("precio") %></td>
                                    <<td><%=listado.getString("cantidad") %></td>
                                    <td><a href="./update.html" target="_blank"><i class='bx bxs-edit-alt fs-3 text-success'></i></a></td>
                                    <td><i class="bx bxs-trash text-danger fs-3" onclick="confirm('Estás seguro de que quieres BORRAR este producto?')"></i></td>

                                </tr>
                               <% } %>
                            </tbody>
                        </table>
                    </div>
                </div>

            </div>
            <!-- BOTON Nuevo PEDIDO-->
        <button type="button" class="btn btn-success" 
        data-bs-toggle="modal" data-bs-target="#formularioProducto">NUEVO PEDIDO</button>
        <!-- modal-->

        <div class="modal fade" id="formularioProducto" tabindex="-1" aria-labelledby="formularioInsertar" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="formularioInsertar">Pedido nuevo</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
              </div>

              <div class="modal-body">
                <form method="post" action="" class="border border-primary p-4">
                  <!-- introducción de nombre con efecto placeholder -->
                  <div class="form-floating mb-3">
                      <input type="text" class="form-control" id="nombre" name="nombre" 
                      placeholder="Dame tu nombre" required>
                      <label for="nombreHelp" class="form-label">Name *</label>
                  </div>

                  <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="tlf" name="tlf" 
                    placeholder="Dame tu tlf" required>
                    <label for="tlfHelp" class="form-label">Phone Number *</label>
                </div>

                  <div class=" mb-3">
                      <label for="producto" class="form-label">Producto *:</label>
                      <input type="number" min="1" max="12" class="form-control" id="producto" name="producto" aria-describedby="productoHelp" required> 
                     
                  </div>
                  
                  <div class="mb-3">
                      <label for="provincia" class="form-label">Proveedor *:</label>
                      <select class="form-select" aria-label="Selecciona proveedor"
                       id="proveedor" name="proveedor">
                          <option>--Selecciona proveedor</option>
                          <option value="lg">LG</option>
                          <option value="eaelectric">EA Electric</option>
                          <option value="apple">Apple</option>
                          <option value="bosch">Bosch</option>
                          <option value="planeta">Planeta</option>
                          <option value="Nothre">Nothre</option>
                          <option value="gucci">Gucci</option>
                          <option value="dior">Dior</option>
                          <option value="zara">Zara</option>
                          <option value="burgerking">Burger King</option>
                      </select>
                  </div>
                    <div class="mb-3 form-check">
                        <label class="form-check-label" for="envio">Envio urgente</label>
                        <input type="checkbox" class="form-check-input" id="envio" name="envio">
                    </div>
                  <button type="submit" class="btn btn-primary">Enviar</button>
              </form>
              </div>                
              </div>
            </div>
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
