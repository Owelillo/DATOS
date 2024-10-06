package Procesos;

public class calculadoraCutre {

	public static void main(String[] args) {
		if(args.length > 3 || args.length < 3) {
			System.out.println("Tienes que poner solamente 3 argumentos, paleto.");
		}
		else {
            try {
                double numero1 = Double.parseDouble(args[0]);
                double numero2 = Double.parseDouble(args[2]);
                double resultado = 0;
                String operador = args[1];

                switch (operador) {
                    case "+":
                        resultado = numero1 + numero2;
                        break;
                    case "-":
                        resultado = numero1 - numero2;
                        break;
                    case "*":
                        resultado = numero1 * numero2;
                        break;
                    case "/":
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Operador no válido. Usa +, -, * o /.");
                        return;
                }

                System.out.println("El resultado es: " + resultado);
            } catch (NumberFormatException e) {
                System.out.println("Error: Los primeros y terceros argumentos deben ser números.");
            }
        }
    }
}
