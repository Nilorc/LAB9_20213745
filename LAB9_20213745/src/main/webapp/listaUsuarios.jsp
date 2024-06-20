

<%@page import="java.util.ArrayList"%>
<%@page import="com.example.lab9_20213745.servlets.daos.DaoUsuarios"%>
<%@page import="com.example.lab9_20213745.servlets.dtos.usuariosDTO"%>
<%@page import="java.text.NumberFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<usuariosDTO> lista = (ArrayList) request.getAttribute("listaUsuarios");
    NumberFormat formatter = NumberFormat.getInstance();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
    </head>
    <body>

        <h1>Lista de Usuarios</h1>




        <table border="1">
            <tr>

                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Tipo de Licencia</th>
                <th>Fecha de emision</th>
                <th>Fecha de caducidad</th>
                <th>Pais</th>


            </tr>
            <%
                for (usuariosDTO user : lista) {
            %>


        </table>

        <a href="listaPeliculas?action=crear" style="display: inline-block; padding: 10px 20px; background-color: #007bff; color: #fff; text-decoration: none; border: none; border-radius: 5px;">Crear Pelicula</a>

    </body>
</html>
