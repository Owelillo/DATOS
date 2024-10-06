package Procesos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class guardarProcessBuilder {
    public static void main(String[] args) {
        // Definir el comando a ejecutar
        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "tasklist /svc /fi \"imagename eq svchost.exe\"");
        
        try {
            // Iniciar el proceso
            Process process = processBuilder.start();
            
            // Leer la salida del proceso (la lista de servicios)
            InputStream input = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            FileWriter writer = new FileWriter();
            String linea;
            
            // Crear o abrir el archivo SVCHOST.TXT para escribir
            
            // Leer cada línea de la salida del proceso y escribirla en el archivo
            while ((linea = reader.readLine()) != null) {
            	System.out.println(linea);
            	reader.close();
            }
            
            
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar o crear el archivo.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al ejecutar el comando.");
            e.printStackTrace();
        }
    }
}
