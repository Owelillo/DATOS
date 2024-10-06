package ejercicio1;
import java.io.*;

public class BufferedWritter {
    public static void main(String[] args) {
        try {
            BufferedReader fichero = new BufferedReader(new FileReader("src//ejercicio1//Mifichero.txt"));
            BufferedWriter writer = new File("src//ejercicio1//CopiaMiFichero.txt");
            String linea;
            int lineCount = 0;
            
            // Leer línea por línea del archivo
            while ((linea = fichero.readLine()) != null) {
                lineCount++;  // Incrementamos el contador de líneas
                String nuevaLinea = "";  // Resetear nuevaLinea para cada nueva línea

                // Si estamos en las primeras 15 líneas
                if (lineCount <= 15) {
                    // Procesar la línea carácter por carácter
                    for (int i = 0; i < linea.length(); i++) {
                        char c = linea.charAt(i);

                        // Cambiar 'a' por 'o', 'A' por 'O'
                        if (c == 'a') {
                            c = 'o';
                        } else if (c == 'A') {
                            c = 'O';
                        }
                        // Cambiar 'á' por 'ó', 'Á' por 'Ó'
                        else if (c == 'á') {
                            c = 'ó';
                        } else if (c == 'Á') {
                            c = 'Ó';
                        }
                        // Cambiar 'o' por 'a', 'O' por 'A'
                        else if (c == 'o') {
                            c = 'a';
                        } else if (c == 'O') {
                            c = 'A';
                        }
                        // Cambiar 'ó' por 'á', 'Ó' por 'Á'
                        else if (c == 'ó') {
                            c = 'á';
                        } else if (c == 'Ó') {
                            c = 'Á';
                        }

                        // Concatenar el carácter modificado a nuevaLinea
                        nuevaLinea = nuevaLinea + c;
                    }
                } else {
                    // Si no es una de las primeras 15 líneas, dejar la línea como está
                    nuevaLinea = linea;
                }

                // Escribir la línea modificada o no modificada en el nuevo archivo
                writer.write(nuevaLinea);
                writer.newLine();  // Escribir un salto de línea después de cada línea
            }

            // Cerrar los archivos
            fichero.close();
            writer.close();

            System.out.println("Archivo procesado y guardado correctamente.");

        } catch (FileNotFoundException fn) {
            System.out.println("No se encuentra el fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
