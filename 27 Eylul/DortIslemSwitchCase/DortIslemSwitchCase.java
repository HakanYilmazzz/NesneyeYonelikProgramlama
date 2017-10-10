
package dortıslemswitchcase;
import java.util.Scanner;
public class DortIslemSwitchCase {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        int sayi1;
        int sayi2;
        int islem = 5;
        int sonuc;
        float sayi3;
        float sayi4;
        float sonuc2;
        while(islem!=0){
            System.out.println("Toplama islemi icin 1, "
                    + "Cikarma islemi icin 2, "
                    + "Carpma islemi icin 3, "
                    + "Bolme islemi icin 4, "
                    + "cıkmak icin 0 giriniz: " );
            islem= oku.nextInt();
            switch(islem){
                case 1: 
                    System.out.println("Sayi1 girin: ");
                    sayi1= oku.nextInt();
                    System.out.println("Sayi2 girin: ");
                    sayi2= oku.nextInt();
                    sonuc=sayi1+sayi2;
                    System.out.println("Toplama isleminizin sonucu= " + sonuc);
                    break; 
                case 2: 
                    System.out.println("Sayi1 girin: ");
                    sayi1= oku.nextInt();
                    System.out.println("Sayi2 girin: ");
                    sayi2= oku.nextInt();
                    sonuc=sayi1-sayi2;
                    System.out.println("Cikarma isleminizin sonucu= " + sonuc);
                    break;  
                case 3:
                    System.out.println("Sayi1 girin: ");
                    sayi1= oku.nextInt();
                    System.out.println("Sayi2 girin: ");
                    sayi2= oku.nextInt();
                    sonuc=sayi1*sayi2;
                    System.out.println("Carpma isleminizin sonucu= " + sonuc);
                    break;
                case 4:
                    System.out.println("Sayi1 girin: ");
                    sayi3= oku.nextInt();
                    System.out.println("Sayi2 girin: ");
                    sayi4= oku.nextInt();
                    if (sayi3!=0 && sayi4!=0){
                       sonuc2=sayi3/sayi4;
                       System.out.println("Bolme isleminin sonucu= " + sonuc2);}
                    else {
                        System.out.println("Sifir haric sayilar giriniz.");}
            }   }   }   }
