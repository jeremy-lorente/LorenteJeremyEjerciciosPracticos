
package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.modelo.Empleado;


public class Ejercicio2 {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jeremy");
        Empleado empleado2 = new Empleado("Jose");
        Empleado empleado3 = new Empleado("Maria");
        Empleado empleado4 = new Empleado("Goku");
        
        
        empleado1.start();
        empleado2.start();
        empleado3.start();
        empleado4.start();
        
    }
}
