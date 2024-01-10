<%-- 
    Document   : MostrarEmpleados
    Created on : 9/01/2024, 1:38:39 p. m.
    Author     : JEAN
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="datos.Empleados"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Empleados | Registrados</title>
        <link rel="stylesheet" type="text/css" href="css/table/styles.css">
    </head>
    <body>
        <h1>Empleados Registrados</h1>
        <table>
            <thead>
                <td>ID</td>
                <td>Identificación</td>
                <td>Nombre</td>
                <td>Rol/Cargo</td>
            </thead>
            <tbody>
        <%
            List<Empleados> listEmp = (List) request.getSession().getAttribute("listaEmpleados");
            int cont = 1;
            for (Empleados emp : listEmp) {
        %>
            <tr>
                <td><%=cont%></td>
                <td><%=emp.getDni()%></td>
                <td><%=emp.getName()%></td>
                <td><%=emp.getCharge()%></td>
            </tr>
            <% cont = cont + 1;%>
        <%}%>
            </tbody>
        </table>
    </body>
</html>
