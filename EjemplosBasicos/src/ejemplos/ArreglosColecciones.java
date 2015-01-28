package ejemplos;

public class ArreglosColecciones {
	public static void main(String args[]){
		int a[]={1,1,1};
		int b[]= new int[3];
		
		a[0] = 4;
		a[1] = 5;
		a[2] = 7;
		
		Circulo arregloCirculos[];
		arregloCirculos = new Circulo[3];// Dar tamaño al arreglo 
		
		arregloCirculos[0] = new Circulo(); //Crear instancias
		arregloCirculos[1] = new Circulo(4,5,5,"Azul");
		arregloCirculos[2] = new Circulo();
		
		System.out.println(arregloCirculos[1].calcularArea());
		
		
	}
}
