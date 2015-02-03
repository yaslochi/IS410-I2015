package clases;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangulo extends Figura{
	protected int largo;
	protected int ancho;
	
	public Rectangulo(String color, 
			boolean relleno, 
			int posicionX, 
			int posicionY, 
			int ancho, 
			int largo) {
		super(color, relleno, posicionX, posicionY);
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public Rectangulo(String color, boolean relleno, int posicionX, int posicionY) {
		super(color, relleno, posicionX, posicionY);
	}
	
	public void dibujar(Graphics2D g){
		String rgb[] = this.color.split(","); //Tomando en cuenta de que el color es un string r,g,b
		
		g.setColor(new Color(
					Integer.valueOf(rgb[0]),
					Integer.valueOf(rgb[1]),
					Integer.valueOf(rgb[2]))
		);
		
		if (relleno)
			g.fillRect(this.posicionX, this.posicionY, largo, ancho);
		else
			g.drawRect(this.posicionX, this.posicionY, largo, ancho);
		
	}
	
	//Gets y Sets
	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
}
