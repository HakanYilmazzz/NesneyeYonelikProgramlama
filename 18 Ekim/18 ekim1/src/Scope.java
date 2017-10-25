
public class Scope {
	private int x=1;
	
	public void begin() {
		x=5;
		System.out.printf("Begin methodu icinde lokal x= %d \n",x);
	
	useLocalVariable();
	useField();
	
	useLocalVariable();
	useField();
	
	System.out.printf("Begin methodu icinde x= %d \n",x);
	
	}
	
	public void useLocalVariable() {
		int x=25;
		System.out.printf("bu method icinde x= %d \n",x);
		++x;
		System.out.printf("Bu method icinde x= %d \n",x);
		
	}
	
	public void useField() {
		System.out.printf("Bu method icinde x= %d \n",x);
		x*=10;
		System.out.printf("Bu method icinde x= %d \n",x);
	}
	
}


