
package hasnext;

import java.util.Scanner;

public class Hasnext {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int sayi;
        
        if(sc.hasNextInt()){
            sayi = sc.nextInt();
            System.out.println("Girdiğiniz sayı: "+sayi);
        }
        else{
            System.out.println("Lütfen sayı giriniz...");
        }
        
    }
    
}
