package com.mycompany.ejercicio1.servlets;

import com.mycompany.ejercicio1.logica.ControladoraEquipo;
import com.mycompany.ejercicio1.logica.Equipo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EquipoSv")
public class EquipoSv extends HttpServlet {

    private ControladoraEquipo control = new ControladoraEquipo();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String equipoNombre=request.getParameter("nombre");
        Equipo equipo = new Equipo();
        equipo.setNombre(equipoNombre);
        
        control.crearEquipo(equipo);
        response.sendRedirect("index.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
