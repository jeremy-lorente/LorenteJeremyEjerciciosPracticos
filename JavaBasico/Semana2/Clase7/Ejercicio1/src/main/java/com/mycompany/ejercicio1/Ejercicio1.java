package com.mycompany.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String password = "";

        Scanner sc = new Scanner(System.in);

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, password);

            while (true) {
                System.out.println("Selecciona una opcion (inserta un Entero)");
                System.out.println("1.- Crear estudiante");
                System.out.println("2.- Leer estudiantes");
                System.out.println("3.- Salir");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        crearEstudiante(conexion, sc);
                        break;
                    case 2:
                        leerEstudiante(conexion);
                        break;
                    case 3:
                        System.out.println("Cerrando programa");
                        conexion.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion no valida, introduce un valor valido");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void crearEstudiante(Connection conexion, Scanner sc) throws Exception {
        String insert = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(insert)) {
            
            System.out.println("Introduce el nombre(String)");
            sc.nextLine();
            String nombre = sc.nextLine();
            
            System.out.println("Introduce la edad(Integer)");
            int edad = sc.nextInt();
            
            System.out.println("Introduce la calificacion(Double)");
            double calificacion = sc.nextDouble();

            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, edad);
            preparedStatement.setDouble(3, calificacion);
            preparedStatement.executeUpdate();

            System.out.println("Estudiante creado correctamente.\n");

        }
    }

    private static void leerEstudiante(Connection conexion) throws SQLException {
        
        Statement statement = conexion.createStatement();
        String selectAll = "SELECT * FROM estudiantes";

        ResultSet resultado = statement.executeQuery(selectAll);
        while (resultado.next()) {

            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            int edad = resultado.getInt("edad");
            Double calificacion = resultado.getDouble("calificacion");
            System.out.println("ID: " + id + " ,Nombre: " + nombre + " ,Edad: " + edad
                    + " ,Calificacion: " + calificacion);
        }
        System.out.println("");

        resultado.close();
        statement.close();
    }
}
