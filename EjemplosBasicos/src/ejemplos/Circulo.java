package ejemplos;

public class Circulo{
	private int x;
	private int y;
	private int diametro;
	private String color;
	private double area;
	private int arreglo[];
	
	public Circulo(){}
	
	public Circulo(int x, int y, int diametro, String color){
		this.x = x;
		this.y = y;
		this.diametro = diametro;
		this.color = color;
		area  = Math.PI * Math.pow((diametro/2),2);
		arreglo = new int[6];
		calcularArea(x,y,diametro);		
	}
	
	public Circulo(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double calcularArea(){
		return area;
	}
	
	public static double calcularArea(int x, int y, int diametro){
		return Math.PI * Math.pow((diametro/2),2);
	}
	
	public void metodo1(int a){

	}
	public void metodo1(String a){

	}
	
	void colorear(){		
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
