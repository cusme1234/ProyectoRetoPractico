import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String clave="jose";
		String pass="";
		
		while (clave.equals(pass)==false) {
			
		pass=JOptionPane.showInputDialog("introduce la contraseņa");
		
		if(clave.equals(pass)==false) {
			
			System.out.println("contraseņa incorrecta");
		}
		
		}
		
		System.out.println("contraseņa correceta");
		
	}

}
