
public class girisizni {
	private int gizlisayi;
	
	public int getGizliSayi() { //get
		return gizlisayi;
	}
	
	public void setGizliSayi(int sayi) { //set
		if(sayi==55) {
			gizlisayi=sayi;
			System.out.println("sisteme giris yapabilirsin.");
		}
		else {
			gizlisayi=0;
			System.out.println("Yanlis bilgi");
		}
	}
	
	
}
