



public class Uso_Onstantes_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabjador1= new Empleados("pepito");
		Empleados trabjador2= new Empleados("ana");
		Empleados trabjador3= new Empleados("sol");
		trabjador1.cambiaSeccion("rrhh");
		//salto de linea 
		System.out.println(trabjador1.devuelveDatos()+"\n"+trabjador2.devuelveDatos()+
				"\n"+trabjador3.devuelveDatos());		
		System.out.println(Empleados.dameIdSiguiente());
		
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
	
	public static String dameIdSiguiente() {
		
		return "el id siguiente es: "+idSiguiente;
		
	}
	
	public String devuelveDatos() {//getter
		
		return"El nombre es: "+nombre+" seccion: "+seccion+" el id es "+id;
		
	}
	
	private final String nombre;
	
	private String seccion;
	
	public  int id;
	
	private static int idSiguiente=1;
}
