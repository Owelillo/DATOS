package Datos;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class altaCoche {

    public static void main(String[] args) {
        File fichero = new File("clientes.dat");

        try (RandomAccessFile file = new RandomAccessFile(fichero, "rw")) {
            Cliente[] clientes = {
                new Cliente("71457145J", "Juan", "Salas Acebes", "5254HFR", "Sevilla"),
                new Cliente("52547854L", "Adela", "Simone Saludes", "8578FGH", "Zaragoza"),
                new Cliente("45254578J", "Cristina", "Alcoy Zaldivar", "5652DFR", "Zamora")
            };

            for (Cliente cliente : clientes) {
                file.writeUTF(cliente.getDNI());           // DNI
                file.writeUTF(cliente.getNombre());        // Nombre
                file.writeUTF(cliente.getApellidos());     // Apellidos
                file.writeUTF(cliente.getMatriculaCoche());      // Matrícula
                file.writeUTF(cliente.getCiudad());         // Ciudad
            }

            System.out.println("Datos de clientes insertados correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

