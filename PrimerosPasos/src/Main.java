import javax.swing.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		byte edad;
		edad = 5;
		System.out.println(edad);
		edad = 56;
		System.out.println(edad);
		edad = 44;
		int bynary=Integer.bitCount(5);
		System.out.println(bynary);
		/* Declaraciones operadores */int a = 5;
		int b;
		b = 7;
		int c = b + a;
		System.out.println(c);

		String Nombre_Usuario = JOptionPane.showInputDialog("introduce Nombre");

		String Edad_Usuario = JOptionPane.showInputDialog("introduce Edad");

		int Edad = Integer.parseInt(Edad_Usuario);

		Edad++;

		System.out.println("hola " + Nombre_Usuario + ". el año que vienes tendras " + Edad + " años");

		double x = 10000.0;

		System.out.printf("%1.2f", x);

		String num1 = JOptionPane.showInputDialog("introduce numero");

		double num2 = Double.parseDouble(num1);

		System.out.print("la raiz de " + num2 + " es ");

		System.out.printf("%1.0f", Math.sqrt(num2));
		/*----------------------------------------------*/

		Scanner entrada = new Scanner(System.in);

		System.out.println("intoduce tu edad");

		int edad2 = entrada.nextInt();

		if (edad2 < 18) {

			System.out.println("eres adolecente");
		}
		else if (edad2<40) {
			System.out.println("eres joven");
		}
		else if(edad2<65) {
			System.out.println("eres maduro");
		}
		else {
			System.out.println("cuidate");
		}

	}
	
		

}
