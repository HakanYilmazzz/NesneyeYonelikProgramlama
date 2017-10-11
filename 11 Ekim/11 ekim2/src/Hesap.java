
public class Hesap {
	private double bakiye;
	
	public Hesap() { //yapıcı method bos
		
	}
	public Hesap(double mevcutBakiye) { //yapıcı method
		if(mevcutBakiye>0.0) {
			bakiye=mevcutBakiye;
			}
		
			
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye=bakiye;
	}
	
	public void paraekle(double miktar) { //void  not return
		bakiye=bakiye+miktar;
	}
	
	
	
	
	
	
	
	
}
