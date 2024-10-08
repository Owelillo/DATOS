import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class leerDatos {
    public static void main(String[] args) {
        try {
            File fichero = new File("Hospital.dat");
            File info = new File("hospitales.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(info));

            RandomAccessFile random = new RandomAccessFile(fichero, "r");
            info.createNewFile();

            int codigo, numCama;
            double presupuesto;
            char[] nombre = new char[25];
            char[] direccion = new char[35];

            while (true) {
                try {
                    codigo = random.readInt();

                    // Leer nombre
                    for (int i = 0; i < nombre.length; i++) {
                        nombre[i] = random.readChar();
                    }
                    String nombres = new String(nombre).trim();

                    // Leer dirección
                    for (int i = 0; i < direccion.length; i++) {
                        direccion[i] = random.readChar();
                    }
                    String dir = new String(direccion).trim();

                    numCama = random.readInt();
                    presupuesto = random.readDouble();

                    writer.write(String.format(
                            "CÓDIGO: %d, NOMBRE: %s, DIRECCIÓN: %s, NÚMERO DE CAMAS: %d, PRESUPUESTO: %.2f",
                            codigo, nombres, dir, numCama, presupuesto));
                    writer.newLine(); // Añadir salto de línea

                } catch (EOFException e) {
                    System.out.println("FIN DEL ARCHIVO");
                    break;
                }
            }

            writer.close();
            random.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
