package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class Prueba_color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marcoconcolor mimarco =new Marcoconcolor();
		
	}

}

class Marcoconcolor extends JFrame{
	
	public Marcoconcolor()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(200,300);
		setTitle("marco con color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaminaColor milamina= new LaminaColor();
		add(milamina);
		//milamina.setBackground(Color.darkGray);
		milamina.setBackground(SystemColor.window);
	}
}

class LaminaColor extends JPanel{
	
	
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D  g2 =(Graphics2D) g;
		
		Rectangle2D rectangulo =new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.blue);
		g2.draw(rectangulo);
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		//g2.draw(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		//g2.setPaint(Color.BLUE);
		//new Color(56,02,79).brighter().brighter().brighter().brighter()//darle brillo
		//new Color(56,02,79).darker().darker().darker()//mas oscuro
		Color micolor = new Color(02,2,5);
		//g2.setPaint(new Color(56,02,79));
		g2.setPaint(micolor);
		g2.fill(elipse);
		//g2.draw(elipse);
	}
	
}