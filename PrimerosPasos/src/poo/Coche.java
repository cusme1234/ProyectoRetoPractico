package poo;

public class Coche {

	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int  motor;
	
	private  int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	
public Coche() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
		
	}

   //metodo getter

  public String dime_datos_generales() {
	  
	  return "la plata forma del vehiculo tiene " +ruedas+ " ruedas "+ 
	           ". mide "+largo/1000+" metros con un ancho de "+ancho+" cm y un peso de plataforma de "+
			  peso_plataforma+" kg"; 
  }
  
  //metodo setter
  
  public void establece_color(String color_coche) {
	  
	  color=color_coche;
	  
  }
  
  public String dime_color() {
	  
	  return "el color del coche es "+ color;
	  
  }
  
  public void configura_asientos(String asientos_cuero) {
	  
	  if(asientos_cuero.equalsIgnoreCase("si")) {
	  this.asientos_cuero=true;
	  } else {
		  this.asientos_cuero=false;
	  }
  }
  
  public String dime_asientos() {
	  //if(asientos_cuero==true) no es necesario el true si preguntas por una afirmacion
	  if(asientos_cuero) {
		  return "el coche tiene asientos de cuero";
		  
	  }else {
		  return "el coche tiene asientos de serie";
	  }
	  
  }
  
  public void configura_climatizador(String climatizador) {
	  
	  if(climatizador.equalsIgnoreCase("si")) {
		  
		  this.climatizador=true;
	  }else {
		  this.climatizador=false;
		  
	  }
  }
  
  public String dime_climatizador() {
	  //if(climatizador==true) no es recomendable
	  if(climatizador) {
		  
		  return "el coche incorpora climatizador";
	  }else {
		  
		return  "el coche lleva aire acondicionado";
	  
  }
  }
  
  public String dime_peso_coche() { //setter + getter //no recomendado en el mismo metodo 
	  
	  int peso_carroseria=500;
	  
	  peso_total=peso_plataforma+peso_carroseria;
	  //if(asientos_cuero==true) no recomendable
	  if(asientos_cuero) {
		  peso_total=peso_total+50;
	  }
	  //if(climatizador==true)no recomendable
	  if(climatizador) {
		  peso_total=peso_total+20;
	  }
	  
	  return "el peso del coche es "+peso_total;
  }

  public int precio_coche() {
	  
	  int precio_final=10000;
	  //if(asientos_cuero==true)no recomendable
	  if(asientos_cuero) {
		  
		  precio_final+=2000;
	  }
	  //if(climatizador==true)no recomendable
	  if(climatizador) {
		  
		  precio_final+=1500;
	  }
	  
	  return precio_final;
	  
  }
  
// arrancar la aplicacion sin necesidad de una clase main 

 // public static void main(String args[]) {
	  
//	  Coche carro = new /*constructor*/Coche();//instanciar una clase

	//	System.out.println("este coche tiene "+carro.largo+" ruedas.");
 // }

	
}
