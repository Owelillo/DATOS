import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LecturaPB {

    public static void main(String[] args) {

        BufferedReader buffer = null;
        String linea;

        InputStreamReader input = new InputStreamReader(System.in); // Como las variables scanner

        try {
            buffer = new BufferedReader(input);
            System.out.println("Introduce una cadena de texto: ");
            linea = buffer.readLine();
            System.out.println("La línea es: " + linea);
            buffer.close();
        } catch (Exception e) {
            System.out.println("Error en: ");
            e.printStackTrace();
        }
    }
}
