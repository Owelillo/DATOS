package VocalNumeroUsuario;

public class Numero {
	private Vocal vocal;
	private Usuario usuario;
	private Terminal terminal;
	public Numero(Vocal vocal, Terminal terminal) {
		this.terminal = terminal; //hacer referencia
		usuario = new Usuario(vocal, terminal); // crear
	}
	
}
