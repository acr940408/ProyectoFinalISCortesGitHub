<%-- 
    Document   : consultar
    Created on : 22/05/2024, 02:50:14 AM
    Author     : AbrahamCortes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PAPELERÍAS RVC CONSULTAS</title>
        <!-----------------------------BOOTSTRAP----------------------------->
        <!--Icono-->
        <link rel="Icon" type="img/png" href="img/logoicono.png">
        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">
        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="css/slick.css"/>
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>
        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>
        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css"/>
        <!--Ventanas emergentes-->
        <link rel="stylesheet" type="text/css" href="css/ventanas.css">
        <link rel="stylesheet" href="style.css">
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap-responsive.min.css" rel="stylesheet" media="screen">
        <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">
        <link ref="stylesheet" type="text/css" href="css/bootstrap.css">
        <link href="css/navbar.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/geolocation.css">
        <link type="text/css" rel="stylesheet" href="demobar_files/bootstrap.css">
        <script type="text/javascript" src="demobar_files/jquery-latest.min.js"></script>
        <script type="text/javascript" src="demobar_files/jquery.min.js"></script>
        <script type="text/javascript" src="demobar_files/bootstrap.js"></script>
        <script src="js/ie-emulation-modes-warning.js"></script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <!-----------------------------/BOOTSTRAP----------------------------->
    </head>
    <body style="background-color: #9966ff">
    <marquee><h1>Consulta de Vendedores Registrados en el sistema</h1></marquee>
    <center><h1>Sistema Control de Vendedores</h1></center>
    <hr>
    <!--Librerias JSP para conexion a BD -->
    <%@page import="java.sql.*" %>
    <%@page import="conexion.ConectaEscuela"%> 
    <%@page errorPage="error.jsp" %> 
    <!--LLamada a la conexion-->
    <%//scriplet esto es java
        ConectaEscuela conexion=new ConectaEscuela("jdbc:mysql://localhost/bdfiscortes", "root", "");
        String consultavendedores = "SELECT * FROM vendedores";//consulta que guarda los campos y registrs de tabla
        ResultSet rs = conexion.ejecutaSelect(consultavendedores);
        ResultSetMetaData rsmd = rs.getMetaData();
        int col = rsmd.getColumnCount();
    %>
    <div class="container">
        <div class="jumbotron">
            <center><h2>Consulta de Vendedores Sistema PAPELERÍAS RVC</h2></center>
            <hr>
            <div class="thumbnail">
                <center>
                    <!--Tabla bootstrap -->
                    <table class="table table-hover alert-danger" border="0" >
                        <thead> <!--cabecera de Tabla bootstrap -->
                            <tr>
                                <%
                                   for (int k = 1; k <= col; k++) {//inicia for 
%>

                                <th scope="col"><h3><strong><%=  rsmd.getColumnName(k)%></strong></h3></th>

                                <%
                                    }//termina for
                                %>
                            </tr>
                        </thead>
                        <tbody><!--Cuerpo de Tabla bootstrap -->
                            <tr>
                                <%
                                   while (rs.next()) {//inicia while
%>
                                <td><h4><%=  rs.getString(1)%></h4></td>
                                <td><h4><%=  rs.getString(2)%></h4></td>
                                <td><h4><%=  rs.getString(3)%></h4></td>
                                <td><h4><%=  rs.getString(4)%></h4></td>
                            </tr>
                            <%
                               }//termina while
%>
                        </tbody>
                    </table>
                    <hr>
                    
                    <hr>
                    <h3>Fecha y hora del sistema: <%= new java.util.Date()%> </h3>
                    <a href="index.jsp"><h4>Regresar a Menu Principal</h4></a>
                </center>    
            </div>
        </div>
    </div>


    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/slick.min.js"></script>
    <script src="js/nouislider.min.js"></script>
    <script src="js/jquery.zoom.min.js"></script>
    <script src="js/main.js"></script>
    <script type="js/jquery-1.8.0.min"></script>        
    <script src="js/bootstrap.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
