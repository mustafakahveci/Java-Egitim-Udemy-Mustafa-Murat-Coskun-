
package girilen3sayıdanmaksbulma;

import java.util.Scanner;

public class Girilen3sayıdanmaksbulma {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("birinci sayıyı girin: ");
        int sayi1 = sc.nextInt();
        System.out.println("ikinci sayıyı girin: ");
        int sayi2 = sc.nextInt();
        System.out.println("üçüncü sayıyı girin: ");
        int sayi3 = sc.nextInt();
        
        int maks = -1;
        
        if(sayi1>=sayi3 && sayi1>=sayi2)
        {
            maks=sayi1;
        }
        else if(sayi2>=sayi1 && sayi2>=sayi3)
        {
            maks=sayi2;
        }
        else
        {
            maks=sayi3;
        } 
        
        System.out.println("Maks sayi = "+maks);
    }
    
}
