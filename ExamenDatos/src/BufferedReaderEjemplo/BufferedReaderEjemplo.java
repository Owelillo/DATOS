package BufferedReaderEjemplo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderEjemplo {

    public static void main(String[] args) throws IOException {
        try {
            File fichero = new File("src//Mifichero.txt");
            BufferedReader ficheroCopia = new BufferedReader(new FileReader(fichero));
            BufferedWriter ficheroPegar = new BufferedWriter(new FileWriter("src//copiaFichero.txt"));
            String linea;
            int numeroLinea = 0;

            // Primer bloque: Copiar las primeras 10 líneas con reemplazo de caracteres
            while ((linea = ficheroCopia.readLine()) != null && numeroLinea < 10) {
                String nuevaLinea = "";
                int i = 0;
                while (i < linea.length()) {
                    char caracter = linea.charAt(i);
                    // Reemplazos de caracteres
                    if (caracter == 'a') {
                        nuevaLinea += 'o';
                    } else if (caracter == 'A') {
                        nuevaLinea += 'O';
                    } else if (caracter == 'o') {
                        nuevaLinea += 'a';
                    } else if (caracter == 'O') {
                        nuevaLinea += 'A';
                    } else if (caracter == 'á') {
                        nuevaLinea += 'ó';
                    } else if (caracter == 'Á') {
                        nuevaLinea += 'Ó';
                    } else if (caracter == 'ó') {
                        nuevaLinea += 'á';
                    } else if (caracter == 'Ó') {
                        nuevaLinea += 'Á';
                    } else {
                        nuevaLinea += caracter; // Mantener el carácter original si no es relevante
                    }
                    i++;
                }
                ficheroPegar.write(nuevaLinea);
                ficheroPegar.newLine();
                numeroLinea++;
            }

            // Segundo bloque: Copiar las siguientes 10 líneas con un '&' al final
            while ((linea = ficheroCopia.readLine()) != null && numeroLinea < 20) {
                ficheroPegar.write(linea + "&"); // Añadir '&' al final de la línea
                ficheroPegar.newLine();
                numeroLinea++;
            }

            // Tercer bloque: Copiar las últimas 5 líneas introduciendo '$' cada 4 caracteres
            while ((linea = ficheroCopia.readLine()) != null && numeroLinea < 25) {
                String nuevaLinea = "";
                int count = 0; // Contador para caracteres no espacios
                for (int i = 0; i < linea.length(); i++) {
                    char caracter = linea.charAt(i);
                    if (caracter != ' ') {
                        count++;
                        nuevaLinea += caracter; // Agregar el carácter original
                        // Añadir '$' cada 4 caracteres no espacios
                        if (count % 4 == 0) {
                            nuevaLinea += '$';
                        }
                    } else {
                        nuevaLinea += caracter; // Mantener el espacio
                    }
                }
                ficheroPegar.write(nuevaLinea);
                ficheroPegar.newLine();
                numeroLinea++;
            }

            // Cerrar los archivos
            ficheroCopia.close();
            ficheroPegar.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
