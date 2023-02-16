package ikisayınınebobunubulma;

import java.util.Scanner;

public class Ikisayınınebobunubulma {

    public static int ebobBul(int sayi1, int sayi2) {

        int maks = 1;

        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {

            if (sayi1 % i == 0 && sayi2 % i == 0) {
                maks = i;
            }
        }
        return maks;
    }

    public static void main(String[] args) {
        //kullanıcıdan alınan 2 sayının ebobunu bulma
        //45 ile 30 ---> 15

        Scanner sc = new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz : ");
        int sayi1 = sc.nextInt();
        System.out.println("ikinci sayıyı giriniz :");
        int sayi2 = sc.nextInt();

        System.out.println("Girdiğiniz iki sayının ebobu = " + ebobBul(sayi1, sayi2));
    }

}
