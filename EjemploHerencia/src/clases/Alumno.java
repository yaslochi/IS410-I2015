package clases;

public class Alumno extends Persona{
	private String cuenta;
	private String carrera;
	
	public Alumno(
			String nombre, 
			String apellido, 
			String genero, 
			int edad,
			String identidad,
			String cuenta, 
			String carrera){
		super(nombre, apellido, genero, edad, identidad);
		this.cuenta = cuenta;
		this.carrera = carrera;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	@Override
	public String toString(){
		return super.toString() + ", " + 
					cuenta + ", " + 
					carrera + " [Desde Alumno]";
	}

	@Override
	public String calcularCumpleanios(){
		return null;
	}
}
