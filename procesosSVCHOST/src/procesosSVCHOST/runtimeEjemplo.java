package procesosSVCHOST;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class runtimeEjemplo {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		String comando = "tasklist /svc /fi \"imagename eq svchost.exe\"";
		
		Process p = null;
		
		if(args.length < 1) {
			System.out.println("SE NECESITA UN NOMBRE DE FICHERO...");
			System.exit(1);
		}
			FileOutputStream fos;
			try {
				fos = new FileOutputStream(args[0]);
				PrintWriter pw = new PrintWriter(fos);
				p = r.exec(comando);
				InputStream is = p.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				String linea;
				
				while((linea = br.readLine()) != null) {
					System.out.println("INSERTO EN " + args[0] + " > " + linea);
					pw.println(linea);
				}
				br.close();
				pw.close();
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(Exception e1){
				e1.printStackTrace();
			}
			int exitVal;
			try {
				exitVal = p.waitFor();
				System.out.println("Valor de salida: " + exitVal);
			} catch(InterruptedException e2) {
				e2.printStackTrace();
			}

			



}
}
