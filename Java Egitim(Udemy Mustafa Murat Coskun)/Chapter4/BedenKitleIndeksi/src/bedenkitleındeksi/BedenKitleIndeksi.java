
package bedenkitleındeksi;

import java.util.Scanner;

public class BedenKitleIndeksi {


    public static void main(String[] args) {
        
        /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.
        Beden Kitle İndeksi : Kilo/Boy(m) * Boy(m)
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz(metre) : ");
        float boy = sc.nextFloat();
        System.out.println("Kilonuzu giriniz(kilogram) : ");
        float kilo = sc.nextFloat();
        
        float bki = kilo/(boy*boy);
        
        System.out.println("Beden kitle indeksiniz: "+bki);
        
    }
    
}
