package graficos;
//package graficos;

import java.awt.*;
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
		
	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setVisible(true);
		setTitle("imagenes");
		setBounds(500, 500, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaminaImage laminaima = new LaminaImage();
		add(laminaima);
		
	}
	
}

class LaminaImage extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//Graphics2D g2=(Graphics2D) g;
	   //File miimagen= new File("src/poo/descarga.jpg");
		try {
		imagen=ImageIO.read(new File("spring.png"));
		}catch(IOException e) {
			System.out.println("no se encontro imagen");
		}
		
		g.drawImage(imagen, 5, 5, null);		
		
	}
	
	private Image imagen;
}

