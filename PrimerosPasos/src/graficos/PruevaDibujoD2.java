package graficos;

import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.*;

public class PruevaDibujoD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco3 marco=new Marco3();
		
	}

}

class Marco3 extends JFrame{
	
	public Marco3() {
		
		setTitle("dibo 2d");
		setVisible(true);
		setSize(500,500);
		setLocation(300,300);
		Lamina3 milamina = new Lamina3();
		add(milamina);
	}
	
	
}
class Lamina3 extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
	 Graphics2D g2=(Graphics2D) g;
	 Rectangle2D rectangulo= new Rectangle2D.Double(100,100,200,150);
	 
	 g2.draw(rectangulo);
	 
	 Ellipse2D elipse = new Ellipse2D.Double();
	 elipse.setFrame(rectangulo);
	 g2.draw(elipse);
	 g2.draw(new Line2D.Double(100,100,300,250));
	 
	 double centroenx=rectangulo.getCenterX();
	 double centroeny=rectangulo.getCenterY();
	 double radio=150;
	 
	 Ellipse2D circulo=new Ellipse2D.Double();
	 circulo.setFrameFromCenter(centroenx, centroeny,centroenx+radio,centroeny+radio);
	 g2.draw(circulo);
	}
	
	
}