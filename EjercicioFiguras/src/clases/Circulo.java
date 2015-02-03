package clases;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circulo extends Figura{
	private int radio;
	
	public Circulo(String color, 
			boolean relleno, 
			int posicionX, 
			int posicionY, 
			int radio) {
		super(color, relleno, posicionX, posicionY);
		this.radio = radio;
	}
	
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	//
	@Override
	public void dibujar(Graphics2D g){
		String rgb[] = this.color.split(","); //Tomando en cuenta de que el color es un string r,g,b
		
		g.setColor(new Color(
					Integer.valueOf(rgb[0]),
					Integer.valueOf(rgb[1]),
					Integer.valueOf(rgb[2]))
		);

		if (relleno)
			g.fillOval(this.posicionX, this.posicionY, (radio * 2), (radio * 2));
		else
			g.drawOval(this.posicionX, this.posicionY, (radio * 2), (radio * 2));
		
	}
}
