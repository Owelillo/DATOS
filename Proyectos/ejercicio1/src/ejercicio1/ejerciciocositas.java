package ejercicio1;
import java.io.*;
public class ejerciciocositas {
	public static void main(String[] args) throws IOException {
		File fichero = new File ("src//ejercicio1//ejercicio1.txt");
		//creo flujo de entrada hacia el fichero
		FileReader fic = new FileReader(fichero);
		int i;
		while ((i = fic.read()) != -1) //lee un carácter
		System.out.println((char) i);
		fic.close(); }
}