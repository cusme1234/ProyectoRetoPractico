package graficos;

import java.awt.*;

import javax.swing.*;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoFuentes marco = new MarcoFuentes();
	}

}

class MarcoFuentes extends JFrame{
	
	
	public MarcoFuentes() {
		
		Toolkit pantalla=Toolkit.getDefaultToolkit();
		Image icono=pantalla.getImage("spring.png");
		setIconImage(icono);
		setVisible(true);
		setSize(500,500);
		setLocation(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaminaFuentes lamina= new LaminaFuentes();
		add(lamina);
		lamina.setForeground(Color.blue);
		
	}
	
	
}

class LaminaFuentes extends JPanel{
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Font miFuente=new Font("Arial", Font.BOLD, 26);
		g2.setFont(miFuente);
		//g2.setColor(Color.blue);
		g2.drawString("Juan", 100, 100);
		
		g2.setFont(new Font("Arial",Font.ITALIC,22));
		//g2.setColor(new Color(128,90,50).brighter());
		g2.drawString("curso java", 300, 300);
	}
	
}