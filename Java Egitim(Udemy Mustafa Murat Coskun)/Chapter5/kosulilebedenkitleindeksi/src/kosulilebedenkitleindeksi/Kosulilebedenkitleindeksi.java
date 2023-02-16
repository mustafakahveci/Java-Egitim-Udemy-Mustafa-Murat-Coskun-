
package kosulilebedenkitleindeksi;

import java.util.Scanner;


public class Kosulilebedenkitleindeksi {

    //kullanııdana alınan boy ve kilo değerine göre beden kitle indeksi hesaplama
    //beden kitle indeksi = kilo / boy(m)*boy(m)
    
    /*
    18.5 altındaysa --> zayıf
    18.5 - 25 arası --> normal
    25-30 arası --> fazla kilolu
    30'un üstündeyse --> obez
    */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz: ");
        int kilo = sc.nextInt();
        System.out.println("Boyunuzu giriniz: Örnek:(1,76) ");
        float boy = sc.nextFloat();
        
        float bki = kilo / (boy*boy);
        System.out.println("Beden kitle indeksiniz : "+bki);
        
        if(bki < 18){
            System.out.println("Zayıf");
        }
        else if(bki >= 18.5 && bki <25){
            System.out.println("Normal");
        }
        else if(bki >= 25 && bki <30){
            System.out.println("Fazla Kilolu");
        }
        else{
            System.out.println("Obez");
        }
        
        
    }
    
}
