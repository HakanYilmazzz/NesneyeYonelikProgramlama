
public class KalemTest {

	public static void main(String[] args) {
		int sayi; //int degisken
		Kalem kalemBos= new Kalem(); //kalem tipinde nesne yarattýk.
	//	kalemBos.kalemAnlat();
		
	 	Kalem kalemDolu= new Kalem("Kýrmýzý","07");
	 //	kalemDolu.kalemAnlat();
	 	
	 	kalemBos.setKrenk("Sari");
	 	kalemBos.setKtip("tukenmez");
	 	
	 	System.out.println("Kalemin rengi: \t" + kalemDolu.getKrenk());
	 	System.out.println("Kalemin tipi: \t" + kalemDolu.getKtip());
		
	}

}
