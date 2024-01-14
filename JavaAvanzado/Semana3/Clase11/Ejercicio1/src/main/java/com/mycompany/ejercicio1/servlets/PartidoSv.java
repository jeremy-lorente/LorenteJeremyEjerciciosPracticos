package com.mycompany.ejercicio1.servlets;

import com.mycompany.ejercicio1.logica.ControladoraEquipo;
import com.mycompany.ejercicio1.logica.ControladoraPartido;
import com.mycompany.ejercicio1.logica.Equipo;
import com.mycompany.ejercicio1.logica.Partido;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PartidoSv")
public class PartidoSv extends HttpServlet {

    ControladoraEquipo controladoraEquipo = new ControladoraEquipo();
    ControladoraPartido controladoraPartido = new ControladoraPartido();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Partido> partidos = controladoraPartido.traerPartidos();
        request.setAttribute("partidos", partidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        try {

            int idEquipoLocal = Integer.parseInt(request.getParameter("equipoLocal"));
            int idEquipoVisitante = Integer.parseInt(request.getParameter("equipoVisitante"));
            LocalDate fecha = LocalDate.parse(request.getParameter("fecha"));
            int puntuacionLocal = Integer.parseInt(request.getParameter("puntuacionEquipoLocal"));
            int puntuacionVisitante = Integer.parseInt(request.getParameter("puntuacionEquipoVisitante"));

            Partido partido = new Partido();

            partido.setFecha(fecha);
            partido.setPuntuacionEquipoLocal(puntuacionLocal);
            partido.setPuntuacionEquipoVisitante(puntuacionVisitante);

            Equipo equipoLocal = controladoraEquipo.traerEquipoPorId(idEquipoLocal);
            Equipo equipoVisitante = controladoraEquipo.traerEquipoPorId(idEquipoVisitante);

            partido.setEquipoLocal(equipoLocal);
            partido.setEquipoVisitante(equipoVisitante);

            controladoraPartido.crearPartido(partido);
            response.sendRedirect("index.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
