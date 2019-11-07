package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
public class Pueva_Temporizador_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Reloj2 mireloj=new Reloj2();
	
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "pulsa aceptar");
		
		System.exit(0);
	}

}

class Reloj2{
	
	/*public Reloj2(int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		this.sonido=sonido;
		
		
	}*/
	
	public void enMarcha(int intervalo, final boolean sonido) {
	 class DameLaHora3 implements ActionListener{

			
			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				
				Date ahora=new Date();
				
				System.out.println("te pongo la hora cada 3 sg " + ahora);
				
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				} 
				
			}
		}
		ActionListener oyente = new DameLaHora3();
		
		Timer mitemporizador= new Timer(intervalo, oyente);
		mitemporizador.start();
	}

	
}