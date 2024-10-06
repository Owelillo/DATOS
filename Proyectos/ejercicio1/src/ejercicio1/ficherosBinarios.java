package ejercicio1;
import java.io.*;
public class ficherosBinarios {

	public static void main(String[] args) {
		String nombres[] = {"Bea", "Manuel", "Alfonso", "Julio", "Ana", "María"};
		int edades[] = {19, 16, 12, 16, 14, 18};
		
		File fichero = new File("menores.dat");
		File fichero1 = new File("mayores.dat");
		
		try {
			FileOutputStream fileout = new FileOutputStream(fichero);
			DataOutputStream dataOS = new DataOutputStream(fileout);
            FileOutputStream fileOutMenores = new FileOutputStream(fichero);
            DataOutputStream dataOutMenores = new DataOutputStream(fileOutMenores);

            FileOutputStream fileOutMayores = new FileOutputStream(fichero1);
            DataOutputStream dataOutMayores = new DataOutputStream(fileOutMayores);
		
    		for(int i = 0; i<nombres.length; i++) {
    			if(edades[i] < 18) {
    				dataOutMenores.writeUTF(nombres[i]);
    				dataOutMenores.writeInt(edades[i]);
    			}
    			else {
    				dataOutMayores.writeUTF(nombres[i]);
    				dataOutMayores.writeInt(edades[i]);
    			}
    		}
		dataOS.close();
		dataOutMenores.close();
		dataOutMayores.close();
		
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
