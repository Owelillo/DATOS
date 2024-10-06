package Procesos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class guardarSVCHOST {
	public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
        String comando = "tasklist /svc /fi \"imagename eq svchost.exe\"";
        String linea;
	    Process p;
        p = r.exec(comando);


		 try (FileOutputStream fos = new FileOutputStream(args[0]);
	             PrintWriter pw = new PrintWriter(fos)) {
	            try {
	                InputStream salidaComando = p.getInputStream();
	                BufferedReader buffer = new BufferedReader(new InputStreamReader(salidaComando));

	                while ((linea = buffer.readLine()) != null) {
	                    System.out.println("INSERTO EN " + args[0] + " > " + linea);
	                    pw.println(linea); 
	                }

	                buffer.close();

	            } catch (IOException e) {
	                System.out.println("Error en " + comando);
	                e.printStackTrace();
	            }

	            int exitVal;
	            try {
	                exitVal = p.waitFor();
	                System.out.println("Valor de Salida: " + exitVal);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	        } catch (FileNotFoundException e) {
	            System.out.println("No se pudo encontrar o crear el archivo: " + args[0]);
	            e.printStackTrace();
	        } catch (IOException e) {
	            System.out.println("Error al cerrar el archivo.");
	            e.printStackTrace();
	        }
	    }
	}