package poo;
import java.util.*;
public class Uso_Tallas {
	
	
	//enum Talla {mini,mediano,grande,muy_grande}; 
	
	enum Talla{
		
		
		MINI("s"),MEDIANO("m"),GRANDE("l"),MUY_GRANDE("xl");
		
		private Talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
		}
		
		public String dameAbreviatura() {
			return abreviatura;
			
		}
		
		private String abreviatura;
	}

	public static void main(String[] args) {
		
		/*Talla s=Talla.mini;
		
		Talla m=Talla.mediano;
		Talla l=Talla.grande;
		Talla xl=Talla.muy_grande;*/
 		
		Scanner scaner = new Scanner(System.in);
		
		System.out.println("escribe una talla");
		
		String entrada=scaner.next().toUpperCase();
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada);
		
		System.out.println("Talla= "+ la_talla);
		System.out.println("abreviatura=  "+ la_talla.dameAbreviatura());
	}
	
	
}
