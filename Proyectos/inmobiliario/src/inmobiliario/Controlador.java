package inmobiliario;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
	private Vista vista;
	Scanner scanner = new Scanner(System.in);
	private ArrayList<Casa> listaCasas;
	public Controlador() {
		vista = new Vista(this);
		iniciar();
		vista.mensajeInicial();
		listaCasas = new ArrayList<>();
	}

	private void iniciar() {
		int seleccion;
		seleccion = vista.menuPrincipal();
		
		switch (seleccion) {
		case 0:
			System.exit(0);
			break;
		case 1:
			nuevaCasa();
		case 2:
			mostrarCasas();
			break;
		case 3:
			eliminarCasa();
			break;
		case 4:
			filtrarCasa();
			break;
		}
	}

	private void filtrarCasa() {
		// TODO Auto-generated method stub
		
	}

	private void eliminarCasa() {
		// TODO Auto-generated method stub
		
	}

	private void mostrarCasas() {
		// TODO Auto-generated method stub
	}

	private void nuevaCasa() {
			int numeroMetros = vista.pedirMetros();
			int numeroPrecio = vista.pedirPrecio();
			int numeroPlanta = vista.pedirPlanta();
			boolean isGaraje = vista.pedirGaraje();
			boolean isAscensor = vista.pedirAscensor();
			int numeroId = vista.pedirId();
		Casa casa = new Casa(numeroMetros, numeroPrecio, numeroPlanta, isGaraje, isAscensor, numeroId);
		listaCasas.add(casa);
		}
	}
}
