package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
	
	public static void main(String[] args) {
		
	Persona[] personas=new Persona[2];
	
	personas[0]= new Empleado2("luis", 50000, 2003, 5, 15);
	personas[1]= new Alumno("jose ", "Biologicas");
	
	
	for(Persona p: personas) {
		
		System.out.println(p.dameNombre()+" "+p.dameDescripcion());
		}
		
	}
	
}

abstract class Persona{
	
	
	
	public Persona(String nom) {
		
		nombre=nom;
		
	}
	
	public String dameNombre() {
		
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
	
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int ano, int mes, int dia) {
		
		super(nom);
		
		sueldo=sue;
		
		GregorianCalendar calendario= new GregorianCalendar(ano,mes-1,dia);
		 
		altacontrato=calendario.getTime(); 
		
		id=idSiguiente;
		idSiguiente++;
		
	}
	
	public String dameDescripcion() {
		
		return "este empleado tiene un id= "+id+" con un sueldo = "+sueldo;
		
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
	

	private double sueldo;
	private Date altacontrato;
	private int id;
	private static int idSiguiente=1;
}


class Alumno extends Persona{
	
	public Alumno(String nom, String car) {
		
		super(nom);
		carrera=car;
	}
	
	public String dameDescripcion() {
		
		return "este alumno esta estudiando la carrera: "+carrera;
	}
	
	private String carrera;
}