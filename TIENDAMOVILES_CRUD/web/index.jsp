

<%@page import="conexion.ConexionBBDD"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<html lang="en">
    
<head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" />
        <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
        <link rel="stylesheet" href="./styles/style1.css" />
        <title>LOGIN Interfaz CRUD</title>
        <link rel="shortcut icon" href="./favicon-96x96.png" type="image/x-icon">
        
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@300&display=swap" rel="stylesheet">
</head>


<body id="bg-secondary">
  <%

                         if ("logout".equals(request.getParameter("accion"))) {
                           
                           session.invalidate();
                           session = request.getSession();
                         }

                         String email = (String)session.getAttribute("email");
                         if (email==null) {
                           email = request.getParameter("email");

                           if (email!=null) {
                             request.setCharacterEncoding("UTF-8");
                             ConexionBBDD s = new ConexionBBDD();

                             String consulta="SELECT * FROM cliente WHERE email='";
                             consulta += email+"' AND pass='";
                             consulta += request.getParameter("pass")+"'";

                             ResultSet consultaLogin = s.consultaDatos(consulta);

                             if (consultaLogin.next()){
                               session.setAttribute("email",email);
                               response.sendRedirect("dashboard.jsp");
                             } else {
                               email=null;
                             }
                           }
                         }

                         if (email==null) {
                          
                           %>
  <div id="wrapper" class="container bg-light p-5">
            <div class="row no-glutters">
                <div class="col-lg-5 p-0">
                    <img src="./login.jpg" class="img-fluid" alt="">
                </div>

                <div class="col-lg-6 px-5 pt-5">
                  
                  
                  
                   
                    <form action="#" method="post" >
                        <h1 class="py-3 ">ALMACEN TEMPHOUSE</h1>
                       <!-- <h6>Inicie sesion</h6> -->
                        <div class="form-floating mb-3">
                            <div class="col-lg-6">
                                <input type="text" id="email" name="email" placeholder="alguien@example.com" class="form-control my-3 p-4" >
                            </div>
                        </div>
                        <div class="form-floating mb-3">
                            <div class="col-lg-6">
                                <input type="password" id="pass" name="pass" placeholder="*******" class="form-control my-3 p-4">
                            </div>
                        </div>
                      
                        <div class="form-row">
                            <div class="col-lg-7">
                              <input type="submit" name="login"  value="LOGIN">                       
                            </div>
                        </div>
                    </form>
                           
                </div>
            </div>
        </div>
        <%
                                out.close();
                                response.sendRedirect("index.jsp");
                              }
 
                        %>
  
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>

</html>