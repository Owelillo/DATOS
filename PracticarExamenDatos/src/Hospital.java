
public class Hospital {
	int codigo;
	String nombre;
	String direccion;
	int cantidadCamas;

	public Hospital(int codigo, String nombre, String direccion, int cantidadCamas, double presupuesto) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.cantidadCamas = cantidadCamas;
		this.presupuesto = presupuesto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidadCamas() {
		return cantidadCamas;
	}

	public void setCantidadCamas(int cantidadCamas) {
		this.cantidadCamas = cantidadCamas;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	double presupuesto;

	public static void main(String[] args) {

	}

}
