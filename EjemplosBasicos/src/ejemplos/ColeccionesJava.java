package ejemplos;

import java.util.ArrayList;

public class ColeccionesJava {
	public static void main(String args[]){
		ArrayList<Circulo> circulos;
		circulos = new ArrayList<Circulo>();
		
		Circulo a = new Circulo(4,5,5,"Azul"); //Crear instancias
		Circulo b = new Circulo(54,75,85,"Rosado");
		Circulo c = new Circulo(4,65,95,"Naranja");
		Circulo x = new Circulo(24,95,5,"Morado");
		
		circulos.add(a); //0
		circulos.add(b); //1
		circulos.add(c); //2
		circulos.add(new Circulo(44,45,15,"Verde"));
		
		circulos.set(2,x);
		circulos.remove(0);
	
		for(int i =0; i<circulos.size();i++){
			System.out.println(circulos.get(i).getColor());
		}
		
		//raw type -> Receptaculo
	}
}
