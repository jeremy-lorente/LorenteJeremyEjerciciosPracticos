

<%@page import="com.mycompany.ejercicio1.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.ejercicio1.logica.Equipo"%>
<%@page import="com.mycompany.ejercicio1.logica.ControladoraEquipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Torneito</title>
        <style>
            body {
                font-family: 'Arial', sans-serif;
                background-color: #f0f0f0;
                margin: 20px;
            }

            form {
                margin-bottom: 20px;
            }

            .registrar-equipo, .registrar-partido, .partidos-resultados {
                background-color: #fff;
                border: 1px solid #ddd;
                padding: 15px;
                margin-bottom: 20px;
            }

            table {
                width: 100%;
                border-collapse: collapse;
            }

            th, td {
                padding: 10px;
                text-align: left;
            }

            th {
                background-color: #4CAF50;
                color: #fff;
            }
        </style>
    </head>
    <body>
        <div class="registrar-equipo">
            <h2>Registrar Equipo</h2>
            <form action="EquipoSv" method="POST">
                <label for="nombre">Nombre del Equipo:</label>
                <input type="text" name="nombre" required>
                <br>
                <input type="submit" value="Registrar equipo">
            </form>
        </div>

        <div class="registrar-partido">
            <h2>Registrar Partido</h2>
            <form action="PartidoSv" method="POST">
                <label for="equipoLocal">Equipo Local:</label>
                <select name="equipoLocal" id="equipoLocal">
                    <%
                        ControladoraEquipo controladoraEquipo = new ControladoraEquipo();
                        List<Equipo> equipos = controladoraEquipo.traerEquipos();

                        for (Equipo equipo : equipos) {
                    %>
                    <option value="<%=equipo.getId()%>"><%=equipo.getNombre()%></option>
                    <%
                        }
                    %>
                </select>
                <br>

                <label for="equipoVisitante">Equipo Visitante:</label>
                <select name="equipoVisitante" id="equipoVisitante">
                    <%
                        for (Equipo equipo : equipos) {
                    %>
                    <option value="<%=equipo.getId()%>"><%=equipo.getNombre()%></option>
                    <%
                        }
                    %>
                </select>
                <br>

                <label for="fecha">Fecha del partido:</label>
                <input type="date" name="fecha" required>
                <br>

                <label for="puntuacionEquipoLocal">Puntuacion Equipo Local:</label>
                <input type="number" name="puntuacionEquipoLocal" required>
                <br>

                <label for="puntuacionEquipoVisitante">Puntuacion Equipo Visitante:</label>
                <input type="number" name="puntuacionEquipoVisitante" required>
                <br>

                <input type="submit" value="Registrar partido">
            </form>
        </div>
        <br>   
        <div class="partidos-resultados">
            <h2>Resultados de los partidos</h2>
            <form action ="PartidoSv" method="GET">
                <button type="submit">MostrarPartidos </button>            
            </form>
            <% if (request.getAttribute("partidos") != null) { %>
            <table border ="1">
                <thead>
                    <tr>
                        <th>Fecha</th>
                        <th>Equipo Local</th>
                        <th>Equipo Visitante</th>
                        <th>Puntuación Local</th>
                        <th>Puntuación Visitante</th>
                    </tr>
                </thead>  
                <tbody>
                    <% for (Partido partido : (List<Partido>) request.getAttribute("partidos")) {%>
                    <tr>
                        <td><%= partido.getFecha()%></td>
                        <td><%= partido.getEquipoLocal().getNombre()%></td>
                        <td><%= partido.getEquipoVisitante().getNombre()%></td>
                        <td><%= partido.getPuntuacionEquipoLocal()%></td>
                        <td><%= partido.getPuntuacionEquipoVisitante()%></td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
            <% }%>
        </div>
    </body>
</html>
