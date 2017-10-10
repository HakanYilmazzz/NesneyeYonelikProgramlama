
package sayiyiokunusunacevir;
import java.util.*;
public class SayiyiOkunusunaCevir {

    public static void main(String[] args) {
        
        int sayi;
        int yuzler = 0;
        int onlar = 0;
        int birler = 0;
        int kalan1 = 0;
        int dongu = 0;
        
        Scanner oku= new Scanner(System.in);
        
        System.out.println("Devam etmek icin 0,2,3,4,5,6,7,8,9 dan herhangi "
                + "birine, programı sonlandırmak icin 1 e basınız..");
        dongu = oku.nextInt();
        
        while (dongu!=1){
        System.out.println("   Lütfen okunusunu gormek istediginiz en fazla uc"
                + " basamakli sayiyi giriniz: ");
        sayi = oku.nextInt();
        if (sayi>999 || sayi<-999){
            System.out.println("Sectiginiz sayi 3 basamakli sayilardan daha "
                    + "buyuk. Lutfen en fazla uc basamakli bir sayi giriniz.");}
        else if (sayi==0){
            System.out.println("sifir");}
        
        else if (sayi>0) {
            yuzler = sayi/100;
            kalan1 = sayi%100;
            onlar = kalan1/10;
            birler = kalan1%10;
                switch(yuzler){
                    case 1: 
                        System.out.print("yuz");break;
                    case 2:
                        System.out.print("ikiyuz");break;
                    case 3:
                        System.out.print("ucyuz");break;
                    case 4:
                        System.out.print("dortyuz");break;
                    case 5:
                        System.out.print("besyuz");break;
                    case 6:
                        System.out.print("altiyuz");break;
                    case 7:
                        System.out.print("yediyuz");break;
                    case 8:
                        System.out.print("sekizyuz");break;
                    case 9:
                        System.out.print("dokuzyuz");break;}
                
                switch(onlar){
                    case 1: 
                        System.out.print("on");break;
                    case 2:
                        System.out.print("yirmi");break;
                    case 3:
                        System.out.print("otuz");break;
                    case 4:
                        System.out.print("kirk");break;
                    case 5:
                        System.out.print("elli");break;
                    case 6:
                        System.out.print("altmis");break;
                    case 7:
                        System.out.print("yetmis");break;
                    case 8:
                        System.out.print("seksen");break;
                    case 9:
                        System.out.print("doksan");break;}
            
                switch(birler){

                    case 1: 
                        System.out.println("bir");break;
                    case 2:
                        System.out.println("iki");break;
                    case 3:
                        System.out.println("uc");break;
                    case 4:
                        System.out.println("dort");break;
                    case 5:
                        System.out.println("bes");break;
                    case 6:
                        System.out.println("alti");break;
                    case 7:
                        System.out.println("yedi");break;
                    case 8:
                        System.out.println("sekiz");break;
                    case 9:
                        System.out.println("dokuz");break;}}
        else {
            sayi = sayi/(-1);
            yuzler = sayi/100;
            kalan1 = sayi%100;
            onlar = kalan1/10;
            birler = kalan1%10;
            switch(yuzler){
                case 1: 
                System.out.print("eksi yuz");break;
                case 2:
                    System.out.print("eksi ikiyuz");break;
                case 3:
                    System.out.print("eksi ucyuz");break;
                case 4:
                    System.out.print("eksi dortyuz");break;
                case 5:
                    System.out.print("eksi besyuz");break;
                case 6:
                    System.out.print("eksi altiyuz");break;
                case 7:
                    System.out.print("eksi yediyuz");break;
                case 8:
                    System.out.print("eksi sekizyuz");break;
                case 9:
                    System.out.print("eksi dokuzyuz");break;}
            
            switch(onlar){
                case 1: 
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kirk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmis");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;}
            
            switch(birler){

                case 1: 
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;}}
        
        System.out.println("   Devam etmek icin 0,2,3,4,5,6,7,8,9 dan herhangi "
                + "birine, programı sonlandırmak icin 1'e basınız..");
        dongu = oku.nextInt();
        }}}














