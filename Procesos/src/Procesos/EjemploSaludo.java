package Procesos;

public class EjemploSaludo {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("SE NECESITA UN SALUDO");
		}
			else {
				for(int i = 0; i<args.length; i++) {
					System.out.println(args[i]);
				}
			}	
	}
}
