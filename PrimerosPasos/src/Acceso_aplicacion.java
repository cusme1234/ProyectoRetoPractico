import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String clave="jose";
		String pass="";
		
		while (clave.equals(pass)==false) {
			
		pass=JOptionPane.showInputDialog("introduce la contraseña");
		
		if(clave.equals(pass)==false) {
			
			System.out.println("contraseña incorrecta");
		}
		
		}
		
		System.out.println("contraseña correceta");
		
	}

}
