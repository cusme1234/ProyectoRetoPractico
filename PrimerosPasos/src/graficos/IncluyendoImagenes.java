package graficos;

import java.awt.*;
import java.awt.Graphics;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class IncluyendoImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoImagen marco= new MarcoImagen();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setVisible(true);
		setTitle("imagenes");
		setBounds(750, 300, 300, 200);
		
		add(new LaminaImage());
		
	}
	
}

class LaminaImage extends JPanel{
	
	public void paintComponet(Graphics g) {
		
		super.paintComponent(g);
		//Graphics2D g2=(Graphics2D) g;
	   //File miimagen= new File("src/poo/descarga.jpg");
		try {
		imagen=ImageIO.read(new File("src/yghhrh/descarga.jpg"));
		}catch(IOException e) {
			System.out.println("no se encontro imagen");
		}
		
		g.drawImage(imagen, 5, 5, null);
		
	}
	
	private Image imagen;
}