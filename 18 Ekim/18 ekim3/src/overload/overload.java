package overload;

public class overload {
	public void test() {
		System.out.printf(" 7'nin karesi = %d \n",square(7));
		System.out.printf(" 7.5'in karesi = %.3f \n",square(7.5));
		
	}
	public int square(int value) {
		return value*value;
	}
	public double square(double value) {
		return value*value;
	}
}
