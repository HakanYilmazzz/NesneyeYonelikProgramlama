
public class tekboyutludizi {
	public static void diziGoster(int[] myDizi) {
		for(int i=0;i<myDizi.length;i++) {
			System.out.println(i+"\t "+ myDizi[i]);
		}
		System.out.println("\n--------------");
	}
	public static void modifyDizi(int[] dizi) { //referans yollaniyor
		for(int i=0;i<dizi.length;i++) {
			dizi[i]=dizi[i]*3;
		}
		
	}
	public static void modifyEleman(int eleman) {//value yollaniyor
		eleman=eleman*3;
	}
	public static void main(String[] args) {
		int[] dizi1=new int[10];
		int[] dizi2; //decralere bildirim
		dizi2=new int[4]; //create
		String[] dizi3= new String[3];
		int[] dizi4= {2,3,6,7,0};
		System.out.println("dizi boyut: "+ dizi4.length);
		System.out.println("dizi boyut: "+ dizi3.length);
		System.out.println("\nindex\tdeger");
		System.out.println("dizi 3. indexteki eleman "+ dizi4[3]);
		diziGoster(dizi1);
		diziGoster(dizi2);
	//	diziGoster(dizi3);
		System.out.println("\n Original dizi ");
		diziGoster(dizi4);
		System.out.println("\n pass by reference ");
		modifyDizi(dizi4);
		diziGoster(dizi4);
		System.out.println("\n pass by value ");
		modifyEleman(dizi4[2]);
		diziGoster(dizi4);
	

}
}
