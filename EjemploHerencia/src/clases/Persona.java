package clases;

public abstract class Persona{
	protected String nombre;
	protected String apellido;
	protected String genero;
	protected int edad;
	protected String identidad;
	
	
	public Persona(String nombre, 
			String apellido, 
			String genero, 
			int edad,
			String identidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
		this.identidad = identidad;
	}
	public Persona(){}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getIdentidad() {
		return identidad;
	}
	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}
	
	public abstract String calcularCumpleanios();
	
	public String toString(){
		return nombre + ", " + apellido + ", " + 
					edad + ", " + genero + ", " + identidad;
	}
	
}
