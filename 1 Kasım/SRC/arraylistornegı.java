import java.util.*;
public class arraylistornegý {
	public static void goster(ArrayList<String> myArrayList) {
		System.out.println("\n--------------\n");
		for(String eleman: myArrayList) {  // foreach
			System.out.println(eleman);
		}
	}
	public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<String>();
	ArrayList<Object> list2=new ArrayList<Object>();
	
	list1.add("sari");
	list1.add("mavi");
	
	list2.add(5);
	list2.add("lab dersi");
	list2.add(5.9);
	
	for(int i=0;i<list1.size();i++) {
		System.out.println(list1.get(i));
	}
	
	list1.set(0, "yesil"); //silip yerine koyuyor
	goster(list1);
	list1.add(1,"Beyaz");
	goster(list1);
	
	list1.remove(2);// 2.indisi sildik
	goster(list1);
	
	System.out.println("\n--------------\n");
	System.out.println("Beyazin indexi: "+ list1.indexOf("Beyaz"));
	System.out.println("Siyah indexi: "+ list1.indexOf("Siyah")); //listede yoksa -1 döner.
	
	System.out.println("Bos mu: "+ list1.isEmpty());
	
	list1.clear(); //listeyi sildik
	goster(list1);
	System.out.println("Bos mu: "+ list1.isEmpty());
	
	
	
	}

}
