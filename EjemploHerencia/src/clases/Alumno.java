package clases;

public class Alumno extends Persona{
	private String cuenta;
	private Carrera carrera; //Composición
	
	public Alumno(
			String nombre, 
			String apellido, 
			String genero, 
			int edad,
			String identidad,
			String cuenta, 
			Carrera carrera){
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

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	@Override
	public String toString(){
		return super.toString() + ", " + 
					cuenta + ", " + 
					carrera.toString() + " [Desde Alumno]";
	}
}
