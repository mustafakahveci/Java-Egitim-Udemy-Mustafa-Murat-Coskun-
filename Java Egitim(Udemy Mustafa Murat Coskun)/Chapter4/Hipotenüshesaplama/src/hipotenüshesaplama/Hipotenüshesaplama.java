
package hipotenüshesaplama;

import static java.lang.Math.*;
import java.util.Scanner;

public class Hipotenüshesaplama {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Birinci kenarı giriniz: ");
        int kenar1 = sc.nextInt();
        System.out.println("İkinci kenarı giriniz:");
        int kenar2 = sc.nextInt();
        
        float hipotenüs = (float)sqrt((kenar1*kenar1)+(kenar2*kenar2));
        
        System.out.println("Hipotenüs uzunluğu = "+hipotenüs);
        
    }
}
