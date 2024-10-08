package ejercicioSerializableObjetos;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class escribirFichero{

	public static void main(String[] args) throws IOException {
		try {
		Peliculas pelicula;
		File fichero = new File("peliculas.dat");
		fichero.createNewFile();
		FileOutputStream fos = new FileOutputStream(fichero);
		ObjectOutputStream output = new ObjectOutputStream(fos);
		String titulos[] = { "El libro de la selva", "Lo que el viento se llevó", "Tiempos modernos" };
		String fechas[] = { "1-1-2024", "1-1-2015", "1-1-1995" };
		Double precios[] = { 6.20, 7.20, 9.20 };
		int duraciones[] = {135, 135, 87};

		for (int i = 0; i < titulos.length; i++) {
			pelicula = new Peliculas(titulos[i], fechas[i], precios[i], duraciones[i]);
			output.writeObject(pelicula);
		}
		
		output.close();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e2) {
			e2.printStackTrace();
		}

	}

}
