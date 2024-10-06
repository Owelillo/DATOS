package Procesos;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio1 {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		String comando = "CMD /C DIR", linea="";
		
		Process p;
		
		try {
			p = r.exec(comando);
			InputStream salidaComando = p.getInputStream();
			BufferedReader buffer = new BufferedReader(new InputStreamReader(salidaComando));
			linea = buffer.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}
			buffer.close();
		}
		catch(Exception e){
			System.out.println("Error en " + comando);
			e.printStackTrace();
		}
	}

}
