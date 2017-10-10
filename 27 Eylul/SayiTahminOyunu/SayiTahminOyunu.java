
package sayitahminoyunu;
import java.util.Scanner;
import java.util.Random;
public class SayiTahminOyunu {
    public static void main(String[] args) {
        
        Scanner oku= new Scanner(System.in);
        Random r=new Random(); 
        
        int adim;
        int sayi = r.nextInt(100);
        int sayac = 0;
        int tahmin;
       
        System.out.println("Tahmin oyununa hosgeldiniz. "
                + "Lutfen oyunu kac adımda bitirmek istediginizi giriniz.");
        adim = oku.nextInt();
        while (sayac < adim){
                
            System.out.println("1,2,...,98,99 sayilari arasından bir tahminde "
                    + "bulunun. Girmek istediginiz sayi: ");
            tahmin = oku.nextInt();
            
            if (tahmin<1 || tahmin>99){
                sayac = sayac+1;
                
                System.out.println("Aralik dişinda bir sayi girdiniz lütfen "
                        + "aralik icerisindeki sayilar arasindan tahminde bulunun. ");}
            
            else {
                if (sayi<tahmin){
                    sayac = sayac+1;
                    
                    System.out.println("Atanan sayi girdiginiz sayidan daha kucuk.");}
                
                else if (sayi>tahmin){
                    sayac = sayac+1;
                    
                    System.out.println("Atanan sayi girdiginiz sayidan daha buyuk. ");}
                else{
                    sayac = sayac+1;
                    
                    System.out.println("Sayiyi doğru tahmin ettiniz. Dogru tahmine "
                            + "ulastiginiz hamle sayisi: " + sayac);
                    break;
                    
                }}}
        
        if (sayac>=adim){
        System.out.println("Belirlediginiz tahmin hakkınız doldu. Oyunu "
                + "kaybettiniz. Tahmin etmeniz beklenen sayi: " + sayi);
        }}}
    

