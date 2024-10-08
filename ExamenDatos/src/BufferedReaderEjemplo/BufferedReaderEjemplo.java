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
			BufferedWriter ficheroPegar = new BufferedWriter(new FileWriter("copiaFichero.txt"));
			String linea;
			int numeroLinea = 0;
			String nuevaLinea = ""; 
			while ((linea = ficheroCopia.readLine()) != null) {
				while(numeroLinea < 10) {
				for (char caracter : linea.toCharArray()) {
					if (caracter == 'a') {
						caracter = 'o';
						nuevaLinea = linea + caracter;
						
					} else if (caracter == 'A') {
						caracter = 'O';
						nuevaLinea = linea + caracter;

					} else if (caracter == 'á') {
						caracter = 'ó';
						nuevaLinea = linea + caracter;

					} else if (caracter == 'Á') {
						caracter = 'Ó';
						nuevaLinea = linea + caracter;

					}
					if (caracter == 'o') {
						caracter = 'a';
						nuevaLinea = linea + caracter;

					} else if (caracter == 'O') {
						caracter = 'A';
						nuevaLinea = linea + caracter;

					} else if (caracter == 'ó') {
						caracter = 'á';
						nuevaLinea = linea + caracter;

					} else if (caracter == 'Ó') {
						caracter = 'Á';
						nuevaLinea = linea + caracter;

					}
					linea = nuevaLinea;
					ficheroPegar.write(nuevaLinea);
					numeroLinea++;
				}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
