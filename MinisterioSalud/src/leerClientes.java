import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileWriter;

public class leerClientes implements Serializable {

	   public static void main(String[] args) {
	        File fichero = new File("clientes.dat");
	        
	        try (RandomAccessFile file = new RandomAccessFile(fichero, "r")) {
	            int codigo, numCamas, posicion;  // Inicialmente empezamos desde el principio del archivo
	            Double presupuestos;
	            char nombre[] = new char[25], aux;
	            char direccion[] = new char[35];
	            posicion = 0;
	            try {
					while (file.getFilePointer() < file.length()) {
					    file.seek(posicion);  // Nos posicionamos en la posición correcta

					    // Leer los datos del registro
					    codigo = file.readInt();
					    for(int i = 0; i < nombre.length; i++) {
					    	aux = file.readChar();
					    	nombre[i] = aux;
					    }
					    codigo = file.readInt();
					    String nombres = new String(nombre);
					    String direcciones = new String(direccion);
					    numCamas = file.readInt();
					    presupuestos = file.readDouble();
					    
					    if(codigo > 0) {
					    	System.out.printf("Código: %s, nombre: %s,"
					    			+ " direccion: %s, Número de camas: %s,"
					    			+ " Presupuesto: %2f %n", codigo, nombres.trim(), direcciones, numCamas, presupuestos);
					    posicion = posicion+36;
					    }
					    if(file.getFilePointer() == file.length()) {
					    	break;
					    }
					  
}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        } catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	   }
}
