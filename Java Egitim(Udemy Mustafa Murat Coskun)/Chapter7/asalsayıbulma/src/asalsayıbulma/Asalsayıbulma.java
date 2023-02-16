package asalsayıbulma;

import java.util.Scanner;

public class Asalsayıbulma {

    public static boolean asalMi(int sayi) {

        for (int i = 2; i < sayi; i++) {

            int kalan = sayi % i;
            if (kalan == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        /*klavyeden girilen sayı asal mı diye kontrol eden program ve
        1'den 1000'e kadar olan asal sayılar*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Asal mı diye kontrol etmek istediğiniz sayıyı giriniz : ");

        int sayi = sc.nextInt();

        if (asalMi(sayi)) {
            System.out.println(sayi + " asal sayıdır.");
        } else {
            System.out.println(sayi + " asal sayı değildir.");
        }
        
        System.out.println("*****************************************************");
        
        System.out.println("1'den 1000'e kadar olan asal sayılar : ");
        for (int i = 2; i <= 1000; i++) {
            
            if(asalMi(i)){
                System.out.println(i);
            }
            
        }

    }

}
