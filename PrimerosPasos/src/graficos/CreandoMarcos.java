package graficos;

import java.awt.Frame;

import javax.swing.*;
public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco marco1=new miMarco();
		
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa al cerrarce la ventana 
		 //marco1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//no finaliza el programa al cerrarce la ventana solo se minimiza la ventana 
		
	}

}
 class miMarco extends JFrame{
	 
	 public miMarco() {
		 
		 //setSize(500, 300);//ancho largo del marco
		 //setLocation(500,300);//posicion del marco en la pantalla
		 setBounds(500,300,550,250);//integra el tamaño y la posicion, primero tamaño y despues posicion
		 //setResizable(false);//para impedir que el marco se pueda redimencionar
	     //setExtendedState(Frame.MAXIMIZED_BOTH);//para abrir el marco a pantalla completa, como argumento se lepuede pasar el valor de la constnte Frame.MAXIMIZED_BOTH que es 6 ya que recibe un entero
		 setTitle("mi ventana");
		 
		 
	 }
	 
	 
	 
	 
	 
 }

