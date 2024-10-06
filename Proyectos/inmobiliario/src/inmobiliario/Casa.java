package inmobiliario;

import java.util.ArrayList;

public class Casa {
	private int metros;
	private float precio;
	private int planta;
	private boolean garaje;
	private int identificador;
	public static int contador=0;
	private boolean ascensor;
	private ArrayList<Casa> listaCasas;
	
	public Casa(int metros, float precio, int planta, boolean garaje, boolean ascensor, int identificador) {
		this.metros = metros;
		this.precio = precio;
		this.planta = planta;
		this.garaje = garaje;
		this.identificador = identificador;
		this.ascensor = ascensor;
		contador= contador++;
		listaCasas = new ArrayList<>();
	}
	
	public int getMetros() {
		return metros;
	}
	public float getPrecio() {
		return precio;
	}
	public int getPlanta() {
		return planta;
	}
	public boolean isGaraje() {
		return garaje;
	}
	public int getID() {
		return identificador;
	}
	
	public void setMetros(int nuevoMetro) {
		this.metros = nuevoMetro;
	}
	public void setPrecio(int nuevoPrecio) {
		this.precio= nuevoPrecio ;
	}
	public void setPlanta(int nuevaPlanta) {
		this.planta= nuevaPlanta ;
	}
	public void setGaraje(boolean nuevogaraje) {
		this.garaje = nuevogaraje;
	}
	public void getID(int nuevoid) {
		this.identificador = nuevoid;
	}
}
