package Datos;

import java.io.Serializable;

public class Cliente implements Serializable {
	private String DNI;
	private String nombre;
	private String apellidos;
	private String matriculaCoche;
	private String ciudad;

	public Cliente(String DNI, String nombre, String apellidos, String matriculaCoche, String ciudad) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.matriculaCoche = matriculaCoche;
		this.ciudad = ciudad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getMatriculaCoche() {
		return matriculaCoche;
	}

	public void setMatriculaCoche(String matriculaCoche) {
		this.matriculaCoche = matriculaCoche;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


}
