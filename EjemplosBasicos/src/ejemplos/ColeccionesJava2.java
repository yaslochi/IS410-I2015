package ejemplos;

import java.awt.Image;
import java.util.HashMap;

public class ColeccionesJava2 {

	public static void main(String[] args) {
		HashMap<String, Circulo> circulos = new HashMap<String, Circulo>();
		
		Circulo a = new Circulo(4,5,5,"Azul");
		Circulo b = new Circulo(54,75,85,"Rosado");
		Circulo c = new Circulo(4,65,95,"Naranja");
		Circulo x = new Circulo(24,95,5,"Morado");
		Circulo y = new Circulo(24,95,5,"NuevoColor");
		circulos.put("circuloazul", a);
		circulos.put("circulorosado", b);
		circulos.put("circulonaranja", c);
		circulos.put("circulomorado", new Circulo(24,95,5,"Morado"));
		
		circulos.put("circulonaranja", y);
		
		System.out.println(circulos.get("circulonaranja").getColor());
	}

}
