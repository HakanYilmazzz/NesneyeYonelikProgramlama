
package dortıslem2;
import java.util.Scanner;
public class DortIslem2 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        int sayi1;
        int sayi2;
        int islem = 5;
        int sonuc;
        float sayi3;
        float sayi4;
        float sonuc2;
        while (islem!=0){
            System.out.println("Toplama islemi icin 1, " );
            System.out.println("Cikarma islemi icin 2, ");
            System.out.println("Carpma islemi icin 3, ");
            System.out.println("Bolme islemi icin 4, ");
            System.out.println("Cikis yapmak icin 0 giriniz: ");
            islem= oku.nextInt();
            if (islem==1){
                System.out.println("Sayi1 girin: ");
                sayi1= oku.nextInt();
                System.out.println("Sayi2 girin: ");
                sayi2= oku.nextInt();
                sonuc=sayi1+sayi2;
                System.out.println("Toplama isleminizin sonucu= " + sonuc);    }
            else if (islem==2){
                System.out.println("Sayi1 girin: ");
                sayi1= oku.nextInt();
                System.out.println("Sayi2 girin: ");
                sayi2= oku.nextInt();
                sonuc=sayi1-sayi2;
                System.out.println("Cikarma isleminizin sonucu= " + sonuc);}
            else if (islem==3){
                System.out.println("Sayi1 girin: ");
                sayi1= oku.nextInt();
                System.out.println("Sayi2 girin: ");
                sayi2= oku.nextInt();
                sonuc=sayi1*sayi2;
                System.out.println("Carpma isleminizin sonucu= " + sonuc);    }
            else if (islem==4){
                System.out.println("Sayi1 girin: ");
                sayi3= oku.nextInt();
                System.out.println("Sayi2 girin: ");
                sayi4= oku.nextInt();
                if (sayi3!=0 && sayi4!=0){
                    sonuc2=sayi3/sayi4;
                    System.out.println("Bolme isleminizin sonucu= " + sonuc2); }
                else {
                    System.out.println("Lütfen sifir haric sayilar giriniz."); }
            }   }   }   }
