package poo;
import java.util.*;
public class Uso_Empleado {

	public static void main(String[] args) {
		
		//ejemplo de impresion 1
		/*Empleado empleado1= new Empleado("Paco gomez", 85000, 2005, 11, 15);
		Empleado empleado2= new Empleado("Ana Lopez", 95000, 2006, 12, 05);
		Empleado empleado3= new Empleado("Martin", 105000, 2004, 10, 12);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.err.println("nombre: "+empleado1.dameNombre()+" sueldo: "+empleado1.dameSueldo()
		+" fecha de altas: "+ empleado1.dameFechaContrato());
		
		System.out.println("nombre: "+empleado2.dameNombre()+" sueldo: "+empleado2.dameSueldo()
		+" fecha de altas: "+ empleado2.dameFechaContrato());
		
		System.err.println("nombre: "+empleado3.dameNombre()+" sueldo: "+empleado3.dameSueldo()
		+" fecha de altas: "+ empleado3.dameFechaContrato());*/
		
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006,9,25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		
		
		Empleado[] misEmpleados=new Empleado[5];
		
		misEmpleados[0]=new Empleado("paco gomez", 88000, 2000, 12, 17);
		
		misEmpleados[1]=new Empleado("ana gomez", 98000, 2004, 10, 27);
		
		misEmpleados[2]=new Empleado("pedro", 78000, 2012, 1, 6);
		
		misEmpleados[3]=jefe_RRHH; //polimorfismo en accion. principio de sustitucion 
		
		misEmpleados[4]=new Jefatura("maria", 95000, 1999, 5, 26);//principio de sustitución
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[4];
		jefa_Finanzas.estableceIncentivo(55000);
		
		System.out.println(jefa_Finanzas.tomar_Decisiones("dar mas dias de vacaciones a los empleados"));
		
		System.out.println("el jefe es: "+jefa_Finanzas.dameNombre()+" tiene un bonus de: "+jefa_Finanzas.establece_bonus(500));
			//ejemplo de instancia	
		/*Empleado director_comercial=new Jefatura("geremias", 95000, 1999, 5, 26);
		
		Comparable ejemplo=new Empleado("alberto", 95000, 1999, 5, 26);
		
		if(director_comercial instanceof Empleado) {
			
			System.out.println("es una instancia de enpleado");
		}
		
		if(ejemplo instanceof Comparable) {
			
			System.out.println("es una instancia de comparable");
		}
		*/
		
		//ejemplo de impresion 2
		/*for(int i=0;i<3;i++) {
			
			misEmpleados[i].subeSueldo(5);
			
		}
		
		for(int i=0;i<3;i++) {
			
			System.out.println("Nombre: "+misEmpleados[i].dameNombre()+" sueldo: "+ misEmpleados[i].dameSueldo()
					+" fecha alta: "+misEmpleados[i].dameFechaContrato());
		}*/
		
		//ejemplo 3
		for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5);;
		}
		
		Arrays.sort(misEmpleados);//ordenar por sueldo
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("Nombre: "+e.dameNombre()+" sueldo: "+ e.dameSueldo()
					+" fecha alta: "+e.dameFechaContrato());
			
		}
		
		
	}
	
	
}

class Empleado implements Comparable, Tabajadores{//obligatorio la interfaz comparable para ordenar por sueldo
	
	public Empleado(String nom, double sue, int ano, int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario= new GregorianCalendar(ano,mes-1,dia);
		 
		altacontrato=calendario.getTime(); 
		
		id=idSiguiente;
		idSiguiente++;
		
	}

	public double establece_bonus(double gratificacion) {
		// TODO Auto-generated method stub
		return Tabajadores.bonus_base+gratificacion;
	}
	
	public String dameNombre() {//getter
		
		return nombre+" id: "+id;
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
	
	public int compareTo(Object miObjeto) {//metodo de la interfaz debuelve -1, 0, 1
		// TODO Auto-generated method stub
		
		Empleado otroempleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroempleado.sueldo) {
			
			return -1;
		}
		
        if(this.sueldo>otroempleado.sueldo) {
			
			return 1;
		}
        
       
        return 0;
		
		
	}
	
	
	private String nombre;
	private double sueldo;
	private Date altacontrato;
	private int id;
	private static int idSiguiente=1;
	
	
	
	
}

class Jefatura extends Empleado implements jefes{
	
	
	public Jefatura(String nom, double sue, int ano, int mes, int dia ) {
		
		super(nom,sue,ano,mes,dia);
		
	}
	
	public void estableceIncentivo(double b) {//setter
		
		incentivo=b;
		
	}
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
		
	}
	
	
	
	public String tomar_Decisiones(String desicion) {
		// TODO Auto-generated method stub
		return "un miembro de la deireccion tomo la siguiente decision: "+desicion;
	}
	
	private double incentivo;

	@Override
	public double establece_bonus(double gratificacion) {
		double prina=2000;
		return Tabajadores.bonus_base+gratificacion+prina;
	}
	
}

 

