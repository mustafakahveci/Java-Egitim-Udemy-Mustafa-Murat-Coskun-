
package kullanıcıgirisi;

import java.util.Scanner;

public class Kullanıcıgirisi {

    public static void main(String[] args) {
        /*
        kullanıcı giriş ekranı while döngüsü yardımı ile 
        kullanıcıan girdi alınıp sistemdeki ile karşılaştırılacak 
        3 defa yanlış girillirse program sonlanacak
        doğru girildiğinde hoşgeldiniz yazacak.
        */
        
        Scanner sc = new Scanner(System.in);
        
        String id = "Tadein";
        String parola = "123456789";
        
        int girishakki=3;
        
        while(true){
            
            if(girishakki==0){
                System.out.println("3 defa hatalı girdiniz..."
                        + "Program sonlanıyor...");
                break;
            }
            
            System.out.println("Kullanıcı adınız : ");
            String girisId = sc.nextLine();
            System.out.println("Parolanız : ");
            String girisParola = sc.nextLine();
            
            if(id.equals(girisId) && parola.equals(girisParola)){
                System.out.println("Hoşgeldin "+id);
                break;
            }
            System.out.println("Hatalı kullanıcı adı ya da parola");
            girishakki--;
            System.out.println("Kalan giriş hakkı sayısı: "+girishakki);
            System.out.println("**********************************************");
        }
        
        
    }
    
}
