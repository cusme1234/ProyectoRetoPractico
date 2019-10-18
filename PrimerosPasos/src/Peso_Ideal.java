import javax.swing.*;

public class Peso_Ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("ingrese genero (H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("m")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce altura en cm"));
		
		int pesoideal=0;
		if(genero.equalsIgnoreCase("h")) {
			
			pesoideal=altura-110;
		}
		else if(genero.equalsIgnoreCase("m")) {
			pesoideal=altura-120;
		}
		
		System.out.println("tu peso ideal es "+ pesoideal+ " kg");
		
	}

}
