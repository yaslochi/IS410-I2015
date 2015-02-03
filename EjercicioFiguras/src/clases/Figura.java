package clases;

import java.awt.Graphics2D;

public abstract class Figura {
	protected String color; // r,g,b
	protected boolean relleno;
	protected int posicionX;
	protected int posicionY;
	
	public Figura(String color, 
			boolean relleno, 
			int posicionX, 
			int posicionY) {		
		this.color = color;
		this.relleno = relleno;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	
	public abstract void dibujar(Graphics2D g);

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isRelleno() {
		return relleno;
	}

	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
}
