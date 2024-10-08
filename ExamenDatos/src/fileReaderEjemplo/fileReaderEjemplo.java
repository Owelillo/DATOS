package fileReaderEjemplo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReaderEjemplo {

	public static void main(String[] args) throws IOException {
		try {
			File contenido = new File("src//contenido.txt");
			FileReader leerContenido = new FileReader(contenido);
			int caracter;
			
			while((caracter = leerContenido.read()) != -1) {
				System.out.println((char) caracter);
			}
			leerContenido.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ARCHIVO NO ENCONTRADO");
		}
	}

}
