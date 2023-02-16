
package basithesapmakinesi;

import java.util.Scanner;


public class Basithesapmakinesi {

    public static void main(String[] args) {
        //switch case kullanarak 4 işlem yapan basit hesap makinesi 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Birinci sayı: ");
        int sayi1 = sc.nextInt();
        
        System.out.println("İkinci sayı: ");
        int sayi2 = sc.nextInt();
        
        System.out.println("İşlem giriniz : ");
        System.out.println("Toplama(1) - Çıkarma(2) - Çarpma(3) - Bölme(4)");
        int islem = sc.nextInt();
        double sonuc = 0;
        switch(islem){
            case(1):
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç: "+sonuc);
                break;
            case(2):
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç: "+sonuc);
                break;
            case(3):
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç: "+sonuc);
                break;
            case(4):
                sonuc = (double)sayi1/sayi2;
                System.out.println("Sonuç: "+sonuc);
                break;
            default:
                System.out.println("Geçersiz işlem girdiniz...");
        }    
    }
    
}
