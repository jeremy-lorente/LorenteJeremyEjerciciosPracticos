package ejercicio1;

import ejercicio1.modelos.Auto;
import ejercicio1.modelos.Camioneta;
import ejercicio1.modelos.Moto;
import ejercicio1.modelos.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {

        Auto auto1 = new Auto(200.0, 400.0, 1, "12321Z", "Auto-Generica", "Auto sport", 2019, 30.000);
        Camioneta camioneta1 = new Camioneta(100.0, 6.7, 2, "M-1231-Y", "Camioneta-Generica", "Camioneta No Sport", 1998, 2500.0);
        Moto moto1 = new Moto(600.0, "Deportiva", 3, "980786X", "Moto-Generica", "Moto sport", 2023, 12.34);

        List<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(auto1);
        listaVehiculos.add(camioneta1);
        listaVehiculos.add(moto1);

        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo);
            System.out.println("La antiguedad de este vehiculo es de: " + vehiculo.calcularAntiguedad() + " años");
            if (vehiculo instanceof Auto) {
                Auto auto = (Auto) vehiculo;
                auto.cargarEnergia();
            } else if (vehiculo instanceof Camioneta) {
                Camioneta camioneta = (Camioneta) vehiculo;
                camioneta.recargarCombustible();
            } else if (vehiculo instanceof Moto) {
                Moto moto = (Moto) vehiculo;
                moto.recargarCombustible();
            }

        }



    }

}
