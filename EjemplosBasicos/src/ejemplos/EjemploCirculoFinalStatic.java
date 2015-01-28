package ejemplos;

public class EjemploCirculoFinalStatic {
	private int x;
	private int y;
	private int diametro;
	private String color;
	private final int MAX_VALUE = 5; //Debe tener obligatoriamente un valor
	public static int valorEstatico = 10;
	
	double calcularArea(){
		return Math.PI * Math.pow((diametro/2),2);
	}
	
	public static void colorear(){
		System.out.println("Dentro del metodo estatico colorear");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
