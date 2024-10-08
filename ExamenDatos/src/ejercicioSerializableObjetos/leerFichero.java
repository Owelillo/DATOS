package ejercicioSerializableObjetos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class leerFichero {

	public static void main(String[] args) throws IOException {
		try {
		Peliculas pelicula;
		File fichero = new File("fichero.dat");
		FileInputStream fis = new FileInputStream(fichero);
		ObjectInputStream ois = new ObjectInputStream(fis);
		while(true) {
			pelicula = (Peliculas) ois.readObject();
			System.out.printf("titulos: %s, fechas: %s, precios: %d, duraciones: %d", 
					pelicula.getTitulo(), pelicula.getFecha(), pelicula.getprecio(), pelicula.getDuracion());
		}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(EOFException e) {
			System.out.println("FIN DEL ARCHIVO");
		}
	}

}
