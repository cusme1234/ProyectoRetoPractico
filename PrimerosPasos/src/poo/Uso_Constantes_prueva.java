package poo;



public class Uso_Constantes_prueva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1=new Empleados("paco");
		Empleados trabajador2=new Empleados("ANA");
		
		trabajador1.cambiaSeccion("rrhh");
		
		System.out.println(trabajador1.devuelveDatos());
	
		
		System.out.println(trabajador2.devuelveDatos());
		
		
	}

}


class Empleados{
	
	public Empleados(String nom) {
		
		nombre=nom;
		
		seccion="Administracion";
		id=idSiguiente;
		idSiguiente++;
		
	}
	
	public void cambiaSeccion(String seccion) {//setter
		
		this.seccion=seccion;
	
		
		
	}
	
	
	public String devuelveDatos() {//getter
		
		return"El nombre es: "+nombre+" seccion: "+seccion+" el id es "+id;
		
	}
	
	private final String nombre;
	
	private String seccion;
	
	public  int id;
	
	private static int idSiguiente=1;
}