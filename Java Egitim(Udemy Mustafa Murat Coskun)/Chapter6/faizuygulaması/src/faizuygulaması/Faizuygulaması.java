
package faizuygulaması;

import java.util.Scanner;

public class Faizuygulaması {

    public static void main(String[] args) {
        /*
        Faiz uygulaması
        
        Kullanıcıdan anapara değerini ve parasının kaç yıl vadeli yatırmak istediği 
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.
        
        Faiz Oranı : %6
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Para miktarını giriniz: ");
        double anapara = sc.nextInt();
        System.out.println("Vade sayısı(yıl) : ");
        int yıl = sc.nextInt();
        
        for (int i = 0; i < yıl; i++) {
            anapara = ((anapara/100) * (106));
            System.out.println(i+". yıl sonunda para miktarı = "+anapara);
            
        }
    }
    
}
