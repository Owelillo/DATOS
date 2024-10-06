import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class consultaCoche {

    public static void main(String[] args) {
        File fichero = new File("clientes.dat");

        try (RandomAccessFile file = new RandomAccessFile(fichero, "r")) {
            // Calcular la posición del tercer cliente (índice 2)
            int tamañoRegistro = 2 * (10 + 5 + 15 + 7 + 10); // Aproximadamente el tamaño en bytes del registro
            long posicionTercerCliente = 2 * tamañoRegistro;  // Para el tercer cliente

            // Mover el puntero a la posición del tercer cliente
            file.seek(posicionTercerCliente);

            // Leer los datos del tercer cliente
            String dni = file.readUTF();
            String nombre = file.readUTF();
            String apellidos = file.readUTF();
            String matricula = file.readUTF();
            String ciudad = file.readUTF();

            // Crear un objeto Cliente
            Cliente cliente = new Cliente(dni, nombre, apellidos, matricula, ciudad);

            // Mostrar los datos del tercer cliente
            System.out.println("DNI: " + cliente.getDNI());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Apellidos: " + cliente.getApellidos());
            System.out.println("Matrícula: " + cliente.getMatriculaCoche());
            System.out.println("Ciudad: " + cliente.getCiudad());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
