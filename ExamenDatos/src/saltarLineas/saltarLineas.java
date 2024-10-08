package saltarLineas;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class saltarLineas {

	public static void main(String[] args) throws IOException {
		try {
		File fichero = new File("src//lectura.txt");
		File escritura = new File("src//escritura.txt");
		escritura.createNewFile();
		
		BufferedReader reader = new BufferedReader(new FileReader(fichero));
		PrintWriter writer = new PrintWriter(new FileWriter(escritura));
		String linea;
		int numeroLinea = 0;

		while((linea = reader.readLine()) != null) {
			String lineaEliminada = "";
			if(numeroLinea / 2 == 0) {
				writer.println(linea);
				numeroLinea++;
			}
			else {
				if(numeroLinea == 3) {
					numeroLinea = 0;
				}
				else {
				linea = " ";
				writer.println(linea);
				numeroLinea++;
				}
			}
			
		}
		reader.close();
		writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("ARCHIVO NO ENCONTRADO");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Archivo no válido");
			return;
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
	}

}
