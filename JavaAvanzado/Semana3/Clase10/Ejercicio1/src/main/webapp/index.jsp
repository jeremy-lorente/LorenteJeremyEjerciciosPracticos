

<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.ejercicio1.logica.Voto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votacion de alumnado</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <form action="VotoSv" method="post">
            <label>Elija su voto:</label>
            <br>
            <input type ="radio" name="partido" value="PartidoA"> Partido A<br>
            <input type ="radio" name="partido" value="PartidoB"> Partido B<br>
            <input type ="radio" name="partido" value="PartidoC"> Partido C<br>
            <br>
            <input type="submit" value="Votar">
        </form>
        <form action="VotoSv" method="get">
            <input type="submit" value="Mostrar resultados">
        </form>

        <br>
        <br>
        <div class="results-table">
            <% if (request.getAttribute("resultados") != null) {
                    Map<String, Long> resultados = (Map<String, Long>) request.getAttribute("resultados");
            %>
            <h3>Resultados:</h3>
            <table class ="table">
                <thead>   <tr>
                        <th>Partido</th>
                        <th>Num votos</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Map.Entry<String, Long> entry : resultados.entrySet()) {%>
                    <tr>
                        <td><%= entry.getKey()%></td>
                        <td><%= entry.getValue()%></td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
            <% }%>
        </div>

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
