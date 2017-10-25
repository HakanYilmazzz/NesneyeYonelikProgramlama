
public class ikiMatrisToplami {

	public static void main(String[] args) {
		
			int[][] array1= {{1,2,3},{4,5,6},{1,1,1}};
			int[][] array2= {{7,8,9},{2,2,2},{3,3,3}};
			int[][] sum= new int[3][3];
			
			System.out.printf("Array1 \n");
			outputarray(array1);
			System.out.printf("Array2 \n");
			outputarray(array2);
			
			for(int r=0;r<3;r++) {
				
				for(int c=0;c<3;c++) {
					sum[r][c]=array1[r][c]+array2[r][c];
				}
			}
			System.out.printf("Toplam \n");
			outputarray(sum);
	}
			public static void outputarray(int[][] array) {
				for(int row=0;row<array.length;row++) {
					for(int col=0;col<array[row].length;col++) {
						System.out.printf("%d ",array[row][col]);
					}
					System.out.println("");
				}
			}
}
