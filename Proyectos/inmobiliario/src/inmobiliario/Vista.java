package inmobiliario;
import java.util.Scanner;
public class Vista {
	private Controlador ctr;
	private Scanner scanner = new Scanner(System.in);
	int select;
	public Vista(Controlador ctrOriginal) {
		this.ctr = ctrOriginal;
		
	}
	public void mensajeInicial() {
		System.out.println("Bienvenido a mi vista");
		System.out.println("------ ---- --------- ---------");
	}
	int menuPrincipal() {
		while(true) {
			System.out.println("Hola,  elige una acción a llevar a cabo");
			System.out.println("1) Introducir nueva casa");
			System.out.println("2) Mostrar todas las casas");
			System.out.println("3) Eliminar una casa");
			System.out.println("4) Filtrar casas");
			System.out.println("0) Salir de la app");
			
			if(scanner.hasNextInt()) {
				select = scanner.nextInt();
				if(select >= 0 || select <= 4) {
					break;
				}
				else {
					System.out.println("Por favor, seleccione una opción válida");
				}
			}
			else {
				System.out.println("Por favor, selecciona un número válido");
					
			}
			
		}
	return select;
	}
	public int pedirMetros() {
		System.out.println("Introduce los m2 de la casa");
		while(!scanner.hasNextInt()) {
			System.out.println("Por favor, indique un número válido");
			scanner.next();
		}
		int respuesta = scanner.nextInt();
		return respuesta;
	}
	public int pedirPrecio() {
		
		System.out.println("Introduce el precio de la casa");
		while(!scanner.hasNextInt()) {
			System.out.println("Por favor, indique un número válido");
			scanner.next();
		}
		int respuesta = scanner.nextInt();
		return respuesta;	}
	
	public boolean pedirAscensor() {
		String respuesta = scanner.next().trim().toUpperCase();
		System.out.println("Introduce si tiene ascensor o no");
		while(!respuesta.equals("S") && !respuesta.equals("N")){
			System.out.println("Respuesta no válida");
			scanner.next();
		}
		if(respuesta.equals("S")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public int pedirPlanta() {
		
		return 0;
	}
}
	

