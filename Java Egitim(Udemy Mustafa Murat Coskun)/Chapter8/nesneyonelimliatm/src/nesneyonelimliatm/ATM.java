package nesneyonelimliatm;

import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {

        Login login1 = new Login();

        Scanner sc = new Scanner(System.in);
        int girishakki = 3;
        System.out.println("********************************************************");
        while (true) {
            if (login1.login(hesap)) {
                System.out.println("Giriş başarılı...");
                break;
            } else {
                System.out.println("Kullanıcı adı veya parola hatalı...");
                girishakki--;
                System.out.println("Kalan giriş hakkı sayınız: " + girishakki);
            }
            if (girishakki == 0) {
                System.out.println("Giriş hakkınız kalmadı.."
                        + "Programdan çıkılıyor...");
                return;
            }
        }

        while (true) {
            System.out.println("****************************************************");
            String islemler = "İŞLEMLER\n"
                    + "1-Bakiye sorgulama\n"
                    + "2-Para yatır\n"
                    + "3-Para çek\n"
                    + "çıkmak için (q)";

            System.out.println(islemler);
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");
            String islem = sc.next();

            switch (islem) {
                case "1": {
                    System.out.println("Bakiyeniz : " + hesap.getBakiye());
                    break;
                }
                case "2": {
                    System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                    int tutar = sc.nextInt();
                    hesap.paraYatir(tutar);
                    break;
                }
                case "3": {
                    System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                    int tutar = sc.nextInt();
                    hesap.paraCek(tutar);
                    break;
                }
                case "q": 
                    System.out.println("Programdan çıkılıyor...");
                    return;               
            }
        }
    }
}
