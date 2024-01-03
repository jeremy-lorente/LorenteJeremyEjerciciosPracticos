package com.mycompany.ejercicio1;

import com.mycompany.ejercicio1.modelos.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Jeremy", 18000.0, "Desarrollador");
        Empleado empleado2 = new Empleado("Jose", 20000.0, "Analista");
        Empleado empleado3 = new Empleado("Ainhoa", 17453.0, "Gerente");
        Empleado empleado4 = new Empleado("Vanesa", 334234.0, "Analista");
        Empleado empleado5 = new Empleado("Jose Luis", 22222.0, "Gerente");
        Empleado empleado6 = new Empleado("Zihao", 18453.0, "Desarrollador");

        List<Empleado> listaEmpleados = new ArrayList<Empleado>();

        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);
        listaEmpleados.add(empleado5);
        listaEmpleados.add(empleado6);

        Double salarioMayorQue = 20000.0;
        List<Empleado> empleadosFiltrados = listaEmpleados.stream()
                .filter(empleado -> empleado.getSalario() > salarioMayorQue)
                .collect(Collectors.toList());

        System.out.println("Empleados con salario mayor que: " + salarioMayorQue);
        empleadosFiltrados.forEach(System.out::println);

        Map<String, Double> salarioPromedioPorCategoria = listaEmpleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)));

        System.out.println("Salario promedio por categoria: ");
        salarioPromedioPorCategoria.forEach((categoria, salarioPromedio) -> {
            System.out.println(categoria + ": " + salarioPromedio);
        });

        Optional<Empleado> empleadoSalarioMaximo = listaEmpleados.stream()
                .max((e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario()));

        empleadoSalarioMaximo.ifPresent(empleado
                -> System.out.println("Empleado con el salario mas alto: "
                   + empleado.getNombre() + ", salario " + empleado.getSalario()));

    }

}
