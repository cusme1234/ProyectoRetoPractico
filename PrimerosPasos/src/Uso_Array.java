
public class Uso_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//otra forma de declararla
		//int mi_matriz[]= new int[5];
		
		//declaracion e iniciacion de matriz 1
		/*int [] mi_matriz= new int[5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=55;
		mi_matriz[2]=47;
		mi_matriz[3]=7;
		mi_matriz[4]=9;*/
		
		//declaracion e iniciacion de matriz 2 (declaracion implicita)
		int [] mi_matriz= {5,6,7,8,1,5,4,8,36,68,898,98,9,456,564,654,64};
		
		for(int i=0;i<mi_matriz.length;i++) {
			
			System.out.println("valor de indece "+i+" es "+mi_matriz[i]);
		}
		

	}

}
