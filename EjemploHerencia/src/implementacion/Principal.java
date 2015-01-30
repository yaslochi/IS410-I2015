package implementacion;

import clases.Alumno;
import clases.Maestro;

public class Principal {

	public static void main(String[] args) {
		Alumno a = new Alumno("Pedro",
				"Gomez","M",30,"08011999999",
				"20061007081","Ing Sistemas");
		Maestro b = new Maestro("Maria",
				"Reyes","F",30,"08011999999",
				"45645464",5.5);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
