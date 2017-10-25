
public class soru2 {

	public static void main(String[] args) {
		int ARRAY_LENGTH=6;
		int[] a=new int[ARRAY_LENGTH]; 
		
		for(int i=0;i<a.length;i++) {
			a[i]=2+2*i;
		}
		System.out.printf("%s %8s","index","Value");
		for(int i=0;i<a.length;i++) {
			System.out.printf(" \n %d %8d",i,a[i]);
		}
		
	}

}
