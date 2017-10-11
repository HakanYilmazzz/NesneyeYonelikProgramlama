
public class Kalem {
	 private String Krenk;
	 private String Ktip;
	
	public Kalem() { //Parametre alamyan konstraktýr
		System.out.println("bos constructor");
	}
//	public Kalem(String renk,String tip) { //iki parametreli
//		Krenk=renk;
//		Ktip=tip;
		
//	}
	public Kalem(String Krenk,String Ktip) {
		this.Krenk=Krenk;
		this.Ktip=Ktip;
		}
	public String getKrenk() { //getter setter renk
		return Krenk;
	}

	public void setKrenk(String Krenk) {
		this.Krenk = Krenk;
	}

	public String getKtip() { //getter setter tip
		return Ktip;
	}

	public void setKtip(String Ktip) {
		this.Ktip = Ktip;
	}
	public void kalemAnlat(String Krenk, String Ktip) {
		System.out.println("Kalemin rengi \t \n \n :" + Krenk + "Kalemin rengi \t: " + Ktip);
		System.out.println("Kalemin rengi %s dir, kalemin tipi : %s dir", Krenk, Ktip);
}
}