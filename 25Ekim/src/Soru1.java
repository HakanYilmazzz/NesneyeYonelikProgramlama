import java.util.Scanner;
public class Soru1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
				
		int[] a=new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.printf("bir sayi giriniz: ");
			a[i]=input.nextInt();
		}
		System.out.printf("sayi dizisindeki elemanlar:");
		
		for(int i=0;i<5;i++) {
			System.out.printf("\n %d.index: ",i);
			System.out.printf("%d ",a[i]);
		}
		
	}

}