package ejercicioSerializableObjetos;

import java.io.Serializable;

public class Peliculas implements Serializable {

	String titulo;
	String fecha;
	Double precio;
	int duracion;
	public Peliculas(String titulo, String fecha, Double peso, int duracion) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.precio = peso;
		this.duracion = duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Double getprecio() {
		return precio;
	}
	public void setprecio(Double peso) {
		this.precio = peso;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	

}
