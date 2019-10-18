import java.util.*;
public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada= new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		// se ejecuta por lo menos una vez
		do{
			intentos++;
			System.out.println("introduce numero");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				
				System.out.println("mas bajo");
			}
			else if(aleatorio>numero) {
				
				System.out.println("mas alto");
			}
			
		}while(numero!=aleatorio);
		
		System.out.println("correcto. lo has conseguido en: "+intentos+" intentos");
		 
		
		// System.out.printf("%1.0f",Math.random()*100);
		
		
		
		
	}

}
