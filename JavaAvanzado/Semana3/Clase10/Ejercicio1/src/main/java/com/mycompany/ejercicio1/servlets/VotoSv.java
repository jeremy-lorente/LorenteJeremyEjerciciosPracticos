/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.ejercicio1.servlets;

import com.mycompany.ejercicio1.logica.Controladora;
import com.mycompany.ejercicio1.logica.Voto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VotoSv")
public class VotoSv extends HttpServlet {

    private List<Voto> listaVotos = new ArrayList<>();
    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Voto> listaVotos = control.traerVotos();

        Map<String, Long> contadorVotos = listaVotos.stream()
                .collect(Collectors.groupingBy(Voto::getPartido, Collectors.counting()));
        request.setAttribute("resultados", contadorVotos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String partido = request.getParameter("partido");
        Voto voto = new Voto();
        voto.setPartido(partido);

        control.crearVoto(voto);
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
