package calisanlarprojesi;

import java.util.Scanner;

public class Calisanlarprojesi {

    /*
    Çalışanlar programı
    çalışan sınıfı şeklinde üst sınıf
    çalışan sınıfından türeyen yazılımcı adında bir alt sınıf
    çalışan sınıfından türeyen yönetici adında bir alt sınıf
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Çalışanlar Programına Hoşgeldiniz...");

        String islemler = "İŞLEMLER\n"
                + "1-Yazılımcı İşlemleri\n"
                + "2-Yönetici İşlemleri\n"
                + "çıkış için (q)";

        while (true) {
            System.out.println("******************************************");
            System.out.println(islemler);
            System.out.println("Yapmak istediğiniz işlemi seçiniz...");
            String islem = sc.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci1 = new Yazilimci("Mustafa", "Kahveci", 64, "C,Java");
                String yazilimci_islem = "Yazılımcı işlemleri\n"
                        + "1-Format At\n"
                        + "2-Bilgileri Goster\n"
                        + "Çıkış için (q)";
                while (true) {
                    System.out.println(yazilimci_islem);
                    System.out.println("işlem seçiniz...");
                    String y_islem = sc.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("Format için işletim sistemini seçiniz : ");
                        String isletim_sistemi = sc.nextLine();
                        yazilimci1.formatAt(isletim_sistemi);
                    } else if (y_islem.equals("2")) {
                        yazilimci1.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz işlem girdiniz...");
                    }
                }
            } else if (islem.equals("2")) {
                Yonetici yonetici1 = new Yonetici("Serhat", "Say", 123, 10);
                String yonetici_islem = "Yönetici işlemleri\n"
                        + "1-Zam Yap\n"
                        + "2-Bilgileri Göster\n"
                        + "çıkış için (q)";
                while (true) {
                    System.out.println(yonetici_islem);
                    System.out.println("işlem seçiniz...");
                    String y_islem = sc.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz ? ");
                        int zam_miktarı = sc.nextInt();
                        sc.nextLine();
                        yonetici1.zamYap(zam_miktarı);
                    } else if (y_islem.equals("2")) {
                        yonetici1.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz işlem girdiniz...");
                    }

                }
            } else {
                System.out.println("Geçersiz işlem girdiniz...");
            }
        }
    }

}
