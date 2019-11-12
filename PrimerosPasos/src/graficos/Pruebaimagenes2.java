package graficos;

import java.awt.Graphics;
import java.io.*;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.*;

public class Pruebaimagenes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPruebaImagen marco= new MarcoPruebaImagen();
	}

}


class MarcoPruebaImagen extends JFrame{
	
	public MarcoPruebaImagen() {
		
		setVisible(true);
		setTitle("marco iconito");
		setBounds(500,500,300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new LaminaPruebaImagen());
		
	}
}

class LaminaPruebaImagen extends JPanel{
	
	public LaminaPruebaImagen() {
	
		try {
			imagen= ImageIO.read(new File("icono.png"));
			}catch(IOException e) {
				System.out.println("no se encontro imagen");
			}
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		/*try {
		imagen= ImageIO.read(new File("icono.png"));
		}catch(IOException e) {
			System.out.println("no se encontro imagen");
		}*/
		int anchoImagen=imagen.getWidth(this);
		int largoImagen=imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		for(int i=0; i<300;i++) {
			for(int j=0;j<400;j++) {
				//g.copyArea(0, 0, 16, 16, i*16, 16*j);
				if(i+j>0) {
				g.copyArea(0, 0, anchoImagen, largoImagen, i*anchoImagen, largoImagen*j);
				}
			}
		}
		
	}
	
	private Image imagen;
}