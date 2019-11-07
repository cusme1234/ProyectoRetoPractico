package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class Fuentes_letras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fuente=JOptionPane.showInputDialog("introduce fuente");
		boolean estalafuente=false;
		
		String[] nombresDefuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombredelafuente: nombresDefuentes) {
			
			if(nombredelafuente.equalsIgnoreCase(fuente)) {
				estalafuente=true;
			}
			
		}
		if(estalafuente) {
			
			System.out.println("fuente instalada");
		} else {
			
			System.out.println("fuente no instalada");
			
		}
		
		
	}

}
