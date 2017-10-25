
public class dowhiletest {

	public static void main(String[] args) {
		int sayac=1, toplam=0;
//		for (sayac=1;sayac<=10;sayac++) {
//			System.out.printf("%d", sayac);
//			toplam=toplam+sayac;
//		}
//		while(sayac<=10) {
//			System.out.printf("%d", sayac);
//			toplam=toplam+sayac;
//			++sayac;
//		}
		do {
			System.out.printf("%2d ", sayac);
			toplam=toplam+sayac;
			++sayac;
			
		}while(sayac<=10);
		
		System.out.printf(" \nToplam= %d",toplam);
	}

}
