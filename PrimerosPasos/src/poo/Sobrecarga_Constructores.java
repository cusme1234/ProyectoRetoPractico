package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Sobrecarga_Constructores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleado_SobreCarga[] misEmpleados= new Empleado_SobreCarga[4];
		
		misEmpleados[0]=new Empleado_SobreCarga("antonio");
		misEmpleados[1]=new Empleado_SobreCarga("jose");
		misEmpleados[2]=new Empleado_SobreCarga("ana");
		misEmpleados[3]=new Empleado_SobreCarga("fabio");
		
		for(Empleado_SobreCarga e: misEmpleados) {
			
			e.subeSueldo(5);
		}
		
		for(Empleado_SobreCarga e: misEmpleados) {
			
			System.out.println("el nombre es: "+e.dameNombre()+" sueldo es: "+e.dameSueldo()+ " fecha ingreso: "+
			e.dameFechaContrato());
		}
		
		
		
		
	}

}


class Empleado_SobreCarga{
	
	public Empleado_SobreCarga(String nom, double sue, int ano, int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario= new GregorianCalendar(ano,mes-1,dia);
		 
		altacontrato=calendario.getTime(); 
		
	}
	//llama al otro constructor solo ingresando nom rellena los otro campos
	public Empleado_SobreCarga(String nom) {
		
		this(nom,30000,2000,01,01);
		
	}
	
	public String dameNombre() {//getter
		
		return nombre;
	}
	
	public double dameSueldo(){//getter
		
		return sueldo;
		
	}
	
	public Date dameFechaContrato() {//getter
		
		return altacontrato;
	}
	
	public void subeSueldo(double porcentaje) {//setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altacontrato;
}