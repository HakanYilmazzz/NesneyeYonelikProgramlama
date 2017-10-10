/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dortıslem;
/**
 *
 * @author MuhendisBusra
 */
import java.util.Scanner;
public class DortIslem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner oku= new Scanner(System.in);
        int sayi1;
        int sayi2;
        int islem = 5;
        int sonuc;
        //System.out.println("Toplama islemi icin 1, Cikarma islemi icin 2, Carpma islemi icin 3, Bolme islemi icin 4, cıkmak icin 0 giriniz: " );
        //islem= oku.nextInt();
       
        while (islem!=0){
            
            System.out.println("Sayi1 girin: ");
            sayi1= oku.nextInt();
            System.out.println("Sayi2 girin: ");
            sayi2= oku.nextInt();
            System.out.println("Toplama islemi icin 1, Cikarma islemi icin 2, Carpma islemi icin 3, Bolme islemi icin 4, cıkmak icin 0 giriniz: " );
            islem= oku.nextInt();
           
            if (islem==1){
                sonuc=sayi1+sayi2;
                System.out.println("Toplama isleminizin sonucu= " + sonuc); 
                
            }
            else if (islem==2){
                if (sayi1<sayi2){
                    sonuc=sayi2-sayi1;
                    System.out.println("Cikarma isleminizin sonucu= " + sonuc);
                    
                }
                else {
                    sonuc=sayi1-sayi2;
                    System.out.println("Cikarma isleminizin sonucu= " + sonuc);
                    
                }
            }
            else if (islem==3){
                sonuc=sayi1*sayi2;
                System.out.println("Carpma isleminizin sonucu= " + sonuc);
                
            }
            else if (islem==4){
                if (sayi1!=0 && sayi2!=0){
                    sonuc=sayi1/sayi2;
                    System.out.println("Bolme isleminizin sonucu= " + sonuc);
                    
                }
                else {
                    System.out.println("Bu sayilarla bölme yapamam lütfen sifir haric sayilar giriniz.");
                    
                }
            }
            
        }

    }
    
}
