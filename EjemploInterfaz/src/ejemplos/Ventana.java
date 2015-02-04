package ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana implements ActionListener{
	
	public Ventana(){
		JFrame ventana = new JFrame();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(500,500);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(null);
		
		JButton boton = new JButton("Click aqui");
		boton.setBounds(10,10,100,30);
		boton.addActionListener(this);
		
		ventana.add(boton);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new Ventana();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Hola mundo");
	}
}
