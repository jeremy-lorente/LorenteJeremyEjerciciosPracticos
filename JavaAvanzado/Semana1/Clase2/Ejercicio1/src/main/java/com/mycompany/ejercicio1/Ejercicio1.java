/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import com.mycompany.ejercicio1.modelos.Agente;

/**
 *
 * @author Jeremy
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Agente agente1 = new Agente("Jeremy");
        Agente agente2 = new Agente("Jose");
        
        agente1.start();
        agente2.start();

    }
}
