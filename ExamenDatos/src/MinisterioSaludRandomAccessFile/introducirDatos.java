package MinisterioSaludRandomAccessFile;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class introducirDatos {
    public static void main(String[] args) {
        File fichero = new File("hospitales.dat");

        int[] codigo = {210, 315, 250};
        String[] nombre = {"Gregorio Marañón", "HM Hospital Universitario", "12 de Octubre"};
        String[] direccion = {"C. Dr. Esquerdo, 46", "Pl. del Conde del Valle de Súchil, 16", "Av. de Córdoba, s/n"};
        int[] numCamas = {1671, 1312, 1296};
        double[] presupuesto = {2252257.54, 3253254.78, 52542547.87};

        try {
            RandomAccessFile file = new RandomAccessFile(fichero, "rw");
            for (int i = 0; i < codigo.length; i++) {
                file.writeInt(codigo[i]);

                // Escribir nombre con longitud de 25
                StringBuffer buffer = new StringBuffer(nombre[i]);
                buffer.setLength(25);
                file.writeChars(buffer.toString());

                // Escribir dirección con longitud de 35
                buffer = new StringBuffer(direccion[i]);
                buffer.setLength(35);
                file.writeChars(buffer.toString());

                file.writeInt(numCamas[i]);
                file.writeDouble(presupuesto[i]);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
