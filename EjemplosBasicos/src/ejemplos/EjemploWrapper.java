package ejemplos;

import javax.swing.JOptionPane;

public class EjemploWrapper {

	public static void main(String[] args) {
		int a = Integer.valueOf(
				JOptionPane.showInputDialog(null, "Ingrese un entero")
				);
		
		JOptionPane.showMessageDialog(null, "Valor ingresado" + a);
		
	}

}
