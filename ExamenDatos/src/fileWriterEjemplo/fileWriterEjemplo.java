package fileWriterEjemplo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriterEjemplo {

	public static void main(String[] args) {
		try {
			File contenido = new File("src//contenido.txt");
			String provincias[] = { "Ávila", "León", "Zamora", "Palencia" };
			FileWriter writer = new FileWriter(contenido, true);
			
			for(int i = 0; i<provincias.length; i++) {
				writer.write(provincias[i]);
				writer.append(" ");
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
