package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Persona;


public class Principal2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		int indice=0;
		int opcion = 0;
		do{
			opcion = Integer.valueOf(JOptionPane.showInputDialog(null,
					"0 Salir \n"+
					"1 Agregar Persona \n"+
					"2 Eliminar \n" +
					"3 Modificar \n" +
					"4 Mostrar \n"
			));
			
			switch(opcion){
				case 0:break;	
				case 1:
					Persona persona = new Persona();
					persona.setNombre(JOptionPane.showInputDialog(null,
							"Ingrese el nombre:"));
					persona.setApellido(JOptionPane.showInputDialog(null,
							"Ingrese el apellido:"));
					persona.setEdad(Integer.valueOf(JOptionPane.showInputDialog(null,
							"Ingrese la edad:")));
					persona.setGenero(JOptionPane.showInputDialog(null,
							"Ingrese el genero:"));
					personas.add(persona);
					break;
				case 2:
					indice = Integer.valueOf(
							JOptionPane.showInputDialog(null,"Indice a elimiar"));
					personas.remove(indice);
					break;
				case 3:
					indice = Integer.valueOf(
							JOptionPane.showInputDialog(null,"Indice a modificar"));
					Persona personaModificar = new Persona();
					personaModificar.setNombre(JOptionPane.showInputDialog(null,
							"Ingrese el nombre:"));
					personaModificar.setApellido(JOptionPane.showInputDialog(null,
							"Ingrese el apellido:"));
					personaModificar.setEdad(Integer.valueOf(JOptionPane.showInputDialog(null,
							"Ingrese la edad:")));
					personaModificar.setGenero(JOptionPane.showInputDialog(null,
							"Ingrese el genero:"));
					
					personas.set(indice, personaModificar);
					
					break;
				case 4:
					for (int i = 0; i<personas.size(); i++){
						System.out.println(personas.get(i).toString());
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, 
							"Opcion invalida");
					break;
			}
		}while(opcion != 0);
		
		
	
	}

}