package ejercicio1;
import java.io.*;
public class Ejercicio3 {
	public static void main(String[] args) throws IOException {
		File fichero = new File ("");
		//creo flujo de entrada hacia el fichero
		FileWriter fic = new FileWriter(fichero);
		String cadena = “Esto es una prueba con FileWriter”;
		char[] cad = cadena.toCharArray();
		for (int i=0; i<cad.length; i++)
		fic.write(cad[i]);
		fic.append(""); //se añade un * al final
		fic.close();
		}
}
