package binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binarios {

	public static void main(String[] args) throws IOException {
	try {
		String nombres[] = { "Bea", "Manuel", "Alfonso", "Julio”", "Ana", "Marta" };
		int edades[] = { 19, 16, 12, 16, 14, 18 };

		File menores = new File("menores.dat");

		File mayores = new File("mayores.dat");

		FileOutputStream fis = new FileOutputStream(menores);
		DataOutputStream data = new DataOutputStream(fis);

		FileOutputStream fisMayores = new FileOutputStream(mayores);
		DataOutputStream dataMayores = new DataOutputStream(fisMayores);

		for (int i = 0; i < edades.length; i++) {
			if (edades[i] > 18) {
				dataMayores.writeUTF(nombres[i]);
				dataMayores.writeInt(edades[i]);
			} else {
				data.writeUTF(nombres[i]);
				data.writeInt(edades[i]);
			}
		}
		fis.close();
		data.close();
		fisMayores.close();
		dataMayores.close();
	} catch(FileNotFoundException e) {
		System.out.println("ARCHIVO NO ENCONTRADO");
	}
	}
	

}
