
package dongulerleatm;

import java.util.Scanner;

public class Dongulerleatm {
    /* while döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.
    
    İşlemler 
    1. işlem : Bakiye Öğrenme
    2. işlem : Para çekme
    3. işlem : Para Yatırma
    Çıkış : q
    */
    public static void main(String[] args) {
        int bakiye = 1000;
        Scanner sc = new Scanner(System.in);
        String islemler = "1.işlem = Bakiye Öğrenme\n"
                +"2. işlem = Para Çekme\n"+
                "3. işlem = Para Yatırma\n"+
                "çıkış için = (q)";
        while(true){
            System.out.println("*****************************");
            System.out.println(islemler);
            System.out.println("*****************************");
            System.out.println("İşlem Giriniz: ");
            String islem = sc.next();
            if("q".equals(islem)){
                break;
            }
            switch(islem){
                case "1": 
                System.out.println("Bakiyeniz : "+bakiye);
                break;
                case "2":
                    System.out.println("Çekilecek tutarı giriniz: ");
                    int tutar = sc.nextInt();
                    if(tutar > bakiye){
                        System.out.println("Yeterli bakiye yok...");
                    }
                    else{
                        bakiye = bakiye - tutar;
                        System.out.println(tutar+" TL çektiniz...");                         
                    }
                    System.out.println("Bakiyeniz : "+bakiye);
                    break;
                case "3":
                    System.out.println("Yatıracağınız tutarı giriniz: ");
                    int tutar2 = sc.nextInt();
                    bakiye = bakiye + tutar2;
                    System.out.println(tutar2+" TL yatırdınız...");
                    System.out.println("Yeni bakiyeniz : "+bakiye);
                    break;
                default:
                    System.out.println("Geçersiz işlem girdiniz...");
            }
        }
    }
}
