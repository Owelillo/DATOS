import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjercicioAltoYBajo {

	public static void main(String[] args) throws IOException {
		try {

			File fichero = new File(args[0]);
			File dir = new File("Ejercicio2");
			dir.mkdir();
			File ficherocopia = new File(dir, "salida.txt");
			ficherocopia.createNewFile();

			BufferedReader reader = new BufferedReader(new FileReader(fichero));
			PrintWriter writer = new PrintWriter(new FileWriter(ficherocopia, true));
			String linea;

			while ((linea = reader.readLine()) != null) {
				String nuevaLinea = "";
				String[] palabras = linea.split("\\s+");
				for (String palabrina : palabras) {
					if (palabrina.equals("alto")) {
						palabrina = " ";
					}
					if (palabrina.equals("bajo")) {
						palabrina = " ";
					}
					nuevaLinea = nuevaLinea + palabrina + " ";
				}
				writer.println(nuevaLinea);

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
