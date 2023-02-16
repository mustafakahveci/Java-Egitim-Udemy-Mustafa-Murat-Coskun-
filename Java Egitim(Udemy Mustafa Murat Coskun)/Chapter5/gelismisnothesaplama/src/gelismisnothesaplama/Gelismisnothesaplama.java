package gelismisnothesaplama;

import java.util.Scanner;

public class Gelismisnothesaplama {
    /*kullanıcıdan vize1,vize2 ve final notunu alarak bir harf notu hesaplama sistemi yapmaya çalışın 
        ayrıca kullanıcıdan okuldaki genel not ortalamasını alarak,
        DD alma ve  2.50'nin altında olma koşuluna göre ekrana bir tavsiye mesajı yazın.
        
        vize1 toplam notun %30'una 
        vize2 toplam notun %30'una
        final toplam notun %40'ına etki edecek.
        
        Toplam Not >= 90   ---> AA
        Toplam Not >= 85   ---> BA
        Toplam Not >= 80   ---> BB
        Toplam Not >= 75   ---> CB
        Toplam Not >= 70   ---> CC
        Toplam Not >= 65   ---> DC
        Toplam Not >= 60   ---> DD
        Toplam Not >= 55   ---> FD
        Toplam Not < 55   ---> FF
        */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. vize sonucunuzu giriniz : ");
        int vize1 = sc.nextInt();
        System.out.println("2. vize sonucunuzu giriniz : ");
        int vize2 = sc.nextInt();
        System.out.println("Final sonucunuzu giriniz : ");
        int finalSonucu = sc.nextInt();
        
        double not = (double)((vize1/10)*3) + ((vize2/10)*3) + ((finalSonucu/10)*4);
        System.out.println("Ortalama: "+not);
        
        System.out.println("Okul ortalamanızı giriniz(AGNO:(2,50)) :");
        double agno = sc.nextDouble();
        
        if(not >= 90){
            System.out.println("AA");
        }
        else if(not >=85){
            System.out.println("BA");
        }
        else if(not >=80){
            System.out.println("BB");
        }
        else if(not >=75){
            System.out.println("CB");
        }
        else if(not >=70){
            System.out.println("CC");
        }
        else if(not >=65){
            System.out.println("DC");
        }
        else if(not >=60){
            System.out.println("DD");
            if(agno >= 2.50){
                System.out.println("Dersi koşullu olarak geçtiniz...");
            }
            else{
                System.out.println("Okul ortalamanız düşük olduğu için dersi tekrar almalısınız...");
            }
        }
        else if(not >=55){
            System.out.println("FD");
        }
        else{
            System.out.println("FF");
        }

    }
}
