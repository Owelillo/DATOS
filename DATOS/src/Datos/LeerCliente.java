package Datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class LeerCliente implements Serializable{

	public static void main(String[] args) throws FileNotFoundException{
		File fichero = new File("altacoche.java");
		RandomAccessFile file = new RandomAccessFile(fichero, "rw");
		RandomAccessFile fileread = new RandomAccessFile(fichero, "r");
		String dnis[] = {
				"71457145J", "52547854L", "45254578J"
		};
		String nombres[] = {
				"Juan", "Adela", "Cristina"
		};
		String apellidos[] = {
				"Salas Acebes", "Simone Saludes", "Alcoy Zaldivar"
		};
		String matriculas[] = {
				"5254HFR", "8578FGH", "5652DFR"
		};
		String ciudades[] = {
				"Sevilla", "Zaragoza", "Zamora"
		};
		int posicion = 90;
		char apellido[] = new char[13], aux;
		
		for(;;) {
			try {
				file.seek(posicion);
				for(int i = 0; i<apellido.length; i++) {
					aux = file.readChar();
					apellido[i] = aux;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
