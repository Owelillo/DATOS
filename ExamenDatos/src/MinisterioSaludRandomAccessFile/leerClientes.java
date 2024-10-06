package MinisterioSaludRandomAccessFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileWriter;

public class leerClientes {

    public static void main(String[] args) {
        File fichero = new File("clientes.dat");
        File output = new File("hospitales.txt");
        try { 
        	RandomAccessFile file = new RandomAccessFile(fichero, "r");
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));

            int codigo, numCamas; // Inicialmente empezamos desde el principio del archivo
            Double presupuestos;
            char nombre[] = new char[25], aux;
            char direccion[] = new char[35];

            while (file.getFilePointer() < file.length()) {
                try {
                    // Leer los datos del registro
                    codigo = file.readInt();
                    for (int i = 0; i < nombre.length; i++) {
                        aux = file.readChar();
                        nombre[i] = aux;
                    }
                    for (int i = 0; i < direccion.length; i++) {
                        aux = file.readChar();
                        direccion[i] = aux;
                    }
                    String nombres = new String(nombre).trim();
                    String direcciones = new String(direccion).trim();
                    numCamas = file.readInt();
                    presupuestos = file.readDouble();

                    if (codigo > 0) {
                        writer.write(String.format(
                                "Código: %s, nombre: %s," + " direccion: %s, Número de camas: %s,"
                                        + " Presupuesto: %2f %n",
                                codigo, nombres.trim(), direcciones, numCamas, presupuestos));
                        writer.newLine();
                    }
                } catch (EOFException e) {
                    break; // Salir del bucle al alcanzar el final del archivo
                }
            }
            writer.close(); // Asegúrate de cerrar el writer aquí

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
