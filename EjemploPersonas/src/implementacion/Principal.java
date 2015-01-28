package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Persona;


public class Principal {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		int cantidadPersonas=0;
		cantidadPersonas = 
				Integer.valueOf(JOptionPane.showInputDialog(null,
						"Cuantos registros desea ingresar"));
		
		for (int i = 0; i<cantidadPersonas; i++){
			Persona persona = new Persona();
			persona.setNombre(JOptionPane.showInputDialog(null,
					"Ingrese el nombre ("+ i +")"));
			persona.setApellido(JOptionPane.showInputDialog(null,
					"Ingrese el apellido ("+ i +")"));
			persona.setEdad(Integer.valueOf(JOptionPane.showInputDialog(null,
					"Ingrese la edad ("+ i +")")));
			persona.setGenero(JOptionPane.showInputDialog(null,
					"Ingrese el genero ("+ i +")"));
			personas.add(persona);
		}
		for (int i = 0; i<personas.size(); i++){
			System.out.println(personas.get(i).toString());
		}
	}

}