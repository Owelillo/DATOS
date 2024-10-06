package VocalNumeroUsuario;
import java.util.Random;
public class Vocal {
	private Terminal terminal;
	private Numero numero;
	char vocalAleatoria;

	public Vocal() {
		terminal = new Terminal();
		numero = new Numero(this, terminal);
	}
	
	
	public char pasarCadena() {
		String cadena = "";
		this.pasarCadena(cadena);
	}
		private void pasarCadena(String cad) {
			cadena=cad;
			
			char vocal=getVocalAleatoria();
			
			cadena = cadena + vocal;
			
			terminal.mostrarCadena();

	}
	}
