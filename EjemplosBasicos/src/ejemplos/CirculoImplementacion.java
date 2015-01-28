package ejemplos;

public class CirculoImplementacion {
	public static void main(String args[]){
		Circulo a;
		a = new Circulo();
		a.setX(5);
		a.setY(15);
		a.setDiametro(20);
		System.out.println("Este es el area: " + a.calcularArea());
		
		Circulo b;
		b = new Circulo(5,15,20,"Verde");
		System.out.println("Este es el area: " + b.calcularArea());
		System.out.println("Este es el area: " + Circulo.calcularArea(5,15,20));
		//EjemploCirculoFinalStatic.colorear();
	}
}
