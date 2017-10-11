import java.util.*;
public class girisiiznitest {

	public static void main(String[] args) {
		girisizni giris1=new girisizni();
		System.out.println("sisteme giris yapabilirsin. \t "+ giris1.getGizliSayi());
		
		giris1.setGizliSayi(7); //sifre denemeleri
		System.out.println("sisteme giris yapabilirsin. \t"+ giris1.getGizliSayi());
		Scanner input=new Scanner(System.in);
		System.out.println("sifre : ");
		int sifre=input.nextInt();
		
		giris1.setGizliSayi(sifre); //sifre denemeleri
		
		giris1.setGizliSayi(55);
		System.out.println("Gizli sayimiz : \t"+ giris1.getGizliSayi());
		
	}

}
