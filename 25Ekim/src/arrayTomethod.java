
public class arrayTomethod {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		
		System.out.printf("Orjinal array: ");
		
		for(int i:array) {
			System.out.printf("%d ",i);
		}
		modifyArray(array);
		System.out.printf("\nModift array: ");
		for(int i:array) {
			System.out.printf("%d ",i);
		}
		System.out.printf("\nModify eleman methodundan girmeden önce eleman= %d " ,array[3]);
		modifyEleman(array[3]);
		System.out.printf("Modify eleman methodundan ciktiktan sonra eleman= %d \n" ,array[3]);
		
		
	}
	public static void modifyArray(int[] array2) {
		for(int i=0;i<array2.length;i++) {
			array2[i]*=2;
		}
	}
		public static void modifyEleman(int eleman) {
			eleman*=2;
			System.out.printf("\nModify eleman methodundan cikmadan once eleman= %d \n",eleman);
	}

}

