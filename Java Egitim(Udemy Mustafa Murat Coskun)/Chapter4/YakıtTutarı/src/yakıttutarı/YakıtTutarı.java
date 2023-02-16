
package yakıttutarı;

import java.util.Scanner;

public class YakıtTutarı {

    public static void main(String[] args) {
        /*
        Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini alın ve
        sürücünün toplam ne kadar ödemesi gerektiğini hesaplayın
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Aracınız kilometrede ne kadar yakıyor(TL cinsinden) : ");
        float kilometre_tutari = sc.nextFloat();
        
        System.out.println("Kaç kilometre yol gittiniz : ");
        int km = sc.nextInt();
        
        float tutar = km*kilometre_tutari;
        
        System.out.println("Ödemeniz gereken tutar = "+tutar+" TL");
        
        
    }
    
}
