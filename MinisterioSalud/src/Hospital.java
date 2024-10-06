
public class Hospital {
		private int codigo;
		private String nombre;
		private String direccion;
		private int numCamas;
		private double presupuesto;

		public Hospital(int codigo, String nombre, String direccion, int numCamas, double presupuesto) {
			this.codigo = codigo;
			this.nombre = nombre;
			this.direccion = direccion;
			this.numCamas = numCamas;
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
		public int getNumCamas() {
			return numCamas;
		}
		public void setNumCamas(int numCamas) {
			this.numCamas = numCamas;
		}
		public double getPresupuesto() {
			return presupuesto;
		}
		public void setPresupuesto(int presupuesto) {
			this.presupuesto = presupuesto;
		}

}
