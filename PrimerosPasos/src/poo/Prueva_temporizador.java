package poo;

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;
public class Prueva_temporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DameLaHora oyente=new DameLaHora();
		//ActionListener oyente=new DameLaHora();//forma dos de instancia por interfaz
		Timer miTemporizador=new Timer(5000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
		
		//System.exit(0);
		
	}

}


class DameLaHora implements ActionListener{


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Date ahora=new Date();
		
		System.out.println("te pongo la hora cada 5 segundos "+ ahora);
		
		}
	
	
	
	
}