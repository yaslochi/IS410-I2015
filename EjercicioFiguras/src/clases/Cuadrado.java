package clases;

import java.awt.Color;
import java.awt.Graphics2D;

public class Cuadrado extends Rectangulo{
	public Cuadrado(String color, boolean relleno, int posicionX, int posicionY, int lado) {
		super(color, relleno, posicionX, posicionY);
		largo = lado;
		ancho = lado;
	}
	
	public void dibujar(Graphics2D g){
		String rgb[] = this.color.split(","); //Tomando en cuenta de que el color es un string r,g,b
		
		g.setColor(new Color(
					Integer.valueOf(rgb[0]),
					Integer.valueOf(rgb[1]),
					Integer.valueOf(rgb[2]))
		);
		
		if (relleno)
			g.fillRect(this.posicionX, this.posicionY, this.ancho, this.largo);
		else
			g.drawRect(this.posicionX, this.posicionY, this.ancho, this.largo);
		
	}
	
}
