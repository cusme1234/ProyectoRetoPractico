import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String clave="jose";
		String pass="";
		
		while (clave.equals(pass)==false) {
			
		pass=JOptionPane.showInputDialog("introduce la contrase�a");
		
		if(clave.equals(pass)==false) {
			
			System.out.println("contrase�a incorrecta");
		}
		
		}
		
		System.out.println("contrase�a correceta");
		
	}

}
