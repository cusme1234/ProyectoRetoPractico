import javax.swing.*;
public class Uso_Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] paises=new String[8];
		
	  /*paises[0]="Espa�a";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";*/
		
		
		//declaracion 2
		//String [] paises= {"Espa�a","Mexico","Colombia","Peru","Chile","Argentina","Ecuador","Venezuela"};
		
		//primer ejemplo
		/*for(int i=0;i<paises.length;i++) {
			
			System.out.println("pais "+(i+1)+" "+paises[i]);
		}*/
		
		/*for(int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("introduce pais "+(i+1));
			
		}
		
		for(String elemento:paises) {
			
			System.out.println("Pais: "+elemento);
			
		}*/
		
		//segundo jemplo
		
		int [] matriz_aleatorios=new  int[150];
		
		for(int i=0; i<matriz_aleatorios.length;i++) {
			
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		int i=0;
		for(int numeros:matriz_aleatorios) {
			
			i+=1;
			System.out.print(i+"-"+numeros+" ");
		}
		
	}

}
