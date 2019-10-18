import javax.swing.*;
public class Comprueba_Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arroa=0;
		boolean punto=false;
		String mail=JOptionPane.showInputDialog("introduce mail");
		
		for(int i=0; i<mail.length();i++) {
			
			if(mail.charAt(i)=='@') {
				arroa++;
			}
			
			if(mail.charAt(i)=='.') {
				punto=true;
			}
			
		}
		if(arroa==1 && punto==true) {
			System.out.println("es correcto");
		}
		else {
			System.out.println("no es correcto");
		}
		
	}

}
