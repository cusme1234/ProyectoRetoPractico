package poo;
import javax.swing.*;
public class Uso_Vehiculo {

	public static void main(String[] args) {


		//Coche carro = new /*constructor*/Coche();//instanciar una clase
		
		
		/*carro.establece_color(JOptionPane.showInputDialog("introduce color"));
		System.out.println(carro.dime_datos_generales());

		System.out.println(carro.dime_color());
		
		carro.configura_asientos(JOptionPane.showInputDialog("tiene asientos de cuero"));
		
		System.out.println(carro.dime_asientos());
		
		carro.configura_climatizador(JOptionPane.showInputDialog("tiene climatizador"));
		
		System.out.println(carro.dime_climatizador());
		
		System.out.println(carro.dime_peso_coche());
		
		System.out.println("EL PRECIO FINAL DEL COCHE ES: "+carro.precio_coche()); */
		
		
		Coche micoche1=new Coche();
		
		micoche1.establece_color("rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7,580);
		
		mifurgoneta1.establece_color("azul");
		mifurgoneta1.configura_asientos("si");
		mifurgoneta1.configura_climatizador("si");
		System.out.println(micoche1.dime_datos_generales()+"\n"+micoche1.dime_color()+"\n");
		System.out.println(mifurgoneta1.dime_datos_generales()+"\n"+mifurgoneta1.dimeDatosFurgoneta());
	} 

}