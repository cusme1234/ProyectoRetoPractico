
public class Uso_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int [][] matrix=new int[4][5];
		
		//otraforma de rellenar matriz
		
		int [][] matrix= {
				{54,58,548,48,58},
				{25,258,79,25,14},
				{415,025,31,02,98},
				{300,258,17,25,99},
				{300,258,17,25,99}
		};
		
		
		//rellenado de la matriz 1
		/*matrix[0][0]=5;
		matrix[0][1]=64;
		matrix[0][2]=87;
		matrix[0][3]=56;
		matrix[0][4]=6;
		
		matrix[1][0]=21;
		matrix[1][1]=23;
		matrix[1][2]=54;
		matrix[1][3]=45;
		matrix[1][4]=98;
		
		matrix[2][0]=74;
		matrix[2][1]=85;
		matrix[2][2]=96;
		matrix[2][3]=97;
		matrix[2][4]=02;
		
		matrix[3][0]=63;
		matrix[3][1]=31;
		matrix[3][2]=025;
		matrix[3][3]=40;
		matrix[3][4]=60;*/
		
		
		
		//ejemplo bucle for 1
		/*for(int i=0;i<4;i++) {
			
			System.out.println();
			for(int j=0;j<5;j++) {
				
				System.out.print(matrix[i][j]+" ");
				
			}
			
		}*/
		
		for(int[] fila:matrix) {
			
			System.out.println();
			
			for(int z:fila) {
				System.out.print(z+" ");
			}
		}

	}

}