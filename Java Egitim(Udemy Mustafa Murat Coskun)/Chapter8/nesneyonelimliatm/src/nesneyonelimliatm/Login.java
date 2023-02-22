package nesneyonelimliatm;

import java.util.Scanner;

public class Login {

    public boolean login(Hesap hesap) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz : ");
        String kullanıcı_adi = sc.nextLine();
        System.out.println("Parolanızı giriniz : ");
        String parola = sc.nextLine();

        if (kullanıcı_adi.equals(hesap.getKullanici_adi()) && parola.equals(hesap.getParola())) {
            System.out.println(hesap.getKullanici_adi() + " Hoşgeldiniz...");
            return true;
        } else {
            return false;
        }

    }

}
