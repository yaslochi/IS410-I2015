package implementacion;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;

import clases.Circulo;
import clases.Cuadrado;
import clases.Figura;
import clases.Rectangulo;

public class Principal extends Canvas{
	ArrayList<Figura> figuras; 
	
	public Principal(){
		JFrame ventana; //Declaracion de una ventana grafica
		ventana = new JFrame(); //Instanciacion de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Si el usuario da click sobre la X de la ventana el programa finaliza.
		ventana.setSize(600, 600); //Establecer las dimensiones ANCHO, ALTO
		ventana.setLocationRelativeTo(null); //Centrar la ventana
		ventana.setTitle("Ejemplo Figuras"); //Establecer el titulo
		
		
		//Inicializar algunas figuras de prueba:
		Circulo circulo1 = new Circulo("12,45,35", true, 30, 34, 50);
		Rectangulo rectangulo1 = new Rectangulo("45,78,98", false, 200, 200, 150, 50);
		Cuadrado cuadrado1 = new Cuadrado("0,255,255", true, 80, 300, 100);
		figuras = new ArrayList<Figura>();
		figuras.add(circulo1);
		figuras.add(rectangulo1);
		figuras.add(cuadrado1);
		
		ventana.setVisible(true); //Mostrar la ventana		
		ventana.add(this);		//Agregar la clase Implementacion a la ventana,
								//recuerde que esta clase se convirtio en un canvas al utilizar extends
		
	}

	
	/*
	 * El metodo paint es llamado al momento de dibujar la ventana.
	 * utiliza un objeto del tipo Graphics el cual es utilizado para dibujar sobre una superficie.
	 * No es necesario crear una instancia de la clase Graphics.
	 * 
	 */
	public void paint(Graphics g){
		Graphics2D g2D = (Graphics2D)g; //Se recibe un objeto del tipo Graphics, se hace un cast o conversion a la clase Graphics2D
		for (int i = 0; i < figuras.size(); i++){
			/*Figura a = figuras.get(i);
			a.dibujar(g2D);*/			
			figuras.get(i).dibujar(g2D);
		}	
	}


	public static void main(String[] args){
		new Principal();

	}
}