
public class cokboyutludizi {
public static void diziGoster(int[][] dizi) {
	for(int satir=0;satir<dizi.length;satir++) {
		for(int sutun=0;sutun<dizi[satir].length;sutun++) {
			System.out.printf(dizi[satir][sutun] + "  ");
		}
		System.out.println("");
	}
	System.out.println("\n--------------");
}
	public static void main(String[] args) {
		int[][] dizi1=new int[3][4]; //3 satir 4 sutun
		int[][] dizi2= {{1,2,3},{6,7,8}};
		int[][] dizi3= {{1,2,3},{6,7,8,9}};
		int[][] dizi4= new int[2][];
		dizi4[0]=new int[5]; //satir
		dizi4[1]=new int[3]; //sutun
		diziGoster(dizi1);
		diziGoster(dizi2);
		diziGoster(dizi3);

	
	}
}
