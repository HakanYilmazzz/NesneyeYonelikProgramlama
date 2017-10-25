import java.util.*;
public class soru3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] notlar=new int[20];
		int[] frekans=new int[6];
		
		System.out.printf("Siniftaki 20 ogr notunu giriniz:");
		
		for(int i=0;i<20;i++) {
			notlar[i]=input.nextInt();
		}
		
		for(int i=0;i<notlar.length;i++) {
			try {
			
				++frekans[notlar[i]];
			}
			catch(ArrayIndexOutOfBoundsException hata){
				System.out.println("lütfen 0-5 arasinda giriniz" + hata);
			}
		}
		System.out.println("\nNot   frekans ");
		System.out.println("...   ....... \n");
		for(int i=0;i<frekans.length;i++) {
			System.out.printf("%d %6d \n",i,frekans[i]);
		}
	}

}
