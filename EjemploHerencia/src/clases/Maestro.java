package clases;

public class Maestro extends Persona {
	
	private String codigoEmpleado;
	private double sueldo;
	
	public Maestro(String nombre, 
			String apellido, 
			String genero, 
			int edad,
			String identidad, 
			String codigoEmpleado, 
			double sueldo) {
		super(nombre, apellido, genero, edad, identidad);
		this.codigoEmpleado = codigoEmpleado;
		this.sueldo = sueldo;
	}

	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString(){
		return super.toString() + ", " +
				codigoEmpleado + ", " +
				sueldo;
	}
}
