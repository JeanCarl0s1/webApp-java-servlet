<%-- 
    Document   : index
    Created on : 8/01/2024, 10:18:02 a. m.
    Author     : JEAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario | Registro</title>
        <link rel="stylesheet" type="text/css" href="css/form/styles.css">
    </head>
    <body>
        <h1>REGISTRAR LOS DATOS DE EMPLEADOS</h1>
        <form action="SvEmpleado" method="POST">
            <label for="dniIn">Identificación</label>
            <input type="text" id="dniIn" name="dniInput" placeholder="Identificación">
            <label for="nameIn">Nombre completo</label>
            <input type="text" id="nameIn" name="nameInput" placeholder="Nombre">
            <label for="chargeIn">Rol/Cargo</label>
            <input type="text" id="chargeIn" name="chargeInput" placeholder="Rol o Cargo">
            <input type="submit" id="btnSubmit"  value="Registrar">
        </form>
        <form action="SvEmpleado" method="GET">
            <input type="submit" value="Ver Empleados Registrados">  
        </form>
    </body>
</html>
