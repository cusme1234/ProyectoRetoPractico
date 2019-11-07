package graficos;

import java.awt.Dimension;
import java.awt.*;

import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCentrado mimarco=new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}


class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		
		Dimension tamanopantalla=mipantalla.getScreenSize();
		
		int alturaPantalla=tamanopantalla.height;
		int anchoPantalla=tamanopantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		setTitle("marco centrado");
		
		Image miIcono=mipantalla.getImage("spring.png");
		
		setIconImage(miIcono);
	}
	
}