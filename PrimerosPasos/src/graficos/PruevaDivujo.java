package graficos;
import java.awt.*;
import javax.swing.*;
public class PruevaDivujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MarcoDibujos marcoDibujo=new MarcoDibujos();
		
		
	}

}


class MarcoDibujos extends JFrame{
	
	public MarcoDibujos() {
		
		setTitle("prueba de dibujo");
		
		setSize(400,400);
	   setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   LaminaFiguras milamina= new LaminaFiguras();
	   
	  add(milamina);
	}
	
}


class LaminaFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//g.drawRect(50, 50, 200, 200);
		//g.drawLine(100, 100, 300, 200);
		g.drawArc(50, 100, 100, 200, 150, 130);
		}
}