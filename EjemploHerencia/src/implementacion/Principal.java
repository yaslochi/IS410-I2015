package implementacion;

import java.util.ArrayList;

import clases.Alumno;
import clases.Carrera;
import clases.Maestro;
import clases.Persona;

public class Principal {

	public static void main(String[] args) {
		Carrera ingSistemas = new Carrera(504,"Ingenieria en sistemas");
		
		Persona x = new Persona("Pedro",
				"Gomez","M",30,"08011999999");
		Alumno a = new Alumno("Pedro",
				"Gomez","M",30,"08011999999",
				"20061007081",ingSistemas);
		Maestro b = new Maestro("Maria",
				"Reyes","F",30,"08011999999",
				"45645464",5.5);
		
		Persona y = new Alumno("Pedro",
				"Gomez","M",30,"08011999999",
				"20061007081",ingSistemas);
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(y);
		personas.add(a);
		personas.add(b);
		
		for(int i = 0; i< personas.size(); i++){
			System.out.println(personas.get(i).toString());
			//Verificar el tipo de instancia usando instance off
			if (personas.get(i) instanceof Alumno){
				System.out.println("Es del tipo alumno");	
			} else if (personas.get(i) instanceof Maestro){
				System.out.println("Es del tipo maestro");	
			} else if (personas.get(i) instanceof Persona){
				System.out.println("Es del tipo persona");	
			}
			
			//Verificar el tipo de instancia usando get Class
			System.out.println(personas.get(i).getClass());
		}
	}
}
