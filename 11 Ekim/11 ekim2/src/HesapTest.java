import java.util.Scanner;

public class HesapTest {

	public static void main(String[] args) {
		Hesap hesap1=new Hesap();  //bos hesap
		Hesap hesap2=new Hesap(50.00); // para yatıralarak acılan hesap
		Hesap hesap3=new Hesap(-3.00);
		
		System.out.printf("hesap1 bakiyesi:\t %.2f ",hesap1.getBakiye());  
		System.out.printf(" \nhesap1 bakiyesi: \t %.2f",hesap2.getBakiye());  
		System.out.printf("\nhesap1 bakiyesi: \t %.2f",hesap3.getBakiye());  
		
		Scanner input=new Scanner(System.in);
		System.out.println(" \nHesap1 icin yatirilicak miktar: ");
		double para=input.nextDouble(); //musteri para miktari girer.
		
		hesap1.paraekle(para);
		System.out.printf("hesap1 bakiyesi:\t %.2f ",hesap1.getBakiye());  
		
		hesap2.paraekle(7.00);
		System.out.printf("\nhesap1 bakiyesi:\t %.2f ",hesap2.getBakiye()); 
		
		hesap3.paraekle(10.00);
		System.out.printf("\nhesap1 bakiyesi:\t %.2f ",hesap3.getBakiye());  
		
		

	}

}
