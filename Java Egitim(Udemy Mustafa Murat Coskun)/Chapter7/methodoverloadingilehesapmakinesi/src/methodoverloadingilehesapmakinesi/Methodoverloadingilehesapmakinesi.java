package methodoverloadingilehesapmakinesi;

import java.util.Scanner;

public class Methodoverloadingilehesapmakinesi {

    public static int toplama(int sayi1, int sayi2) {
        return (sayi1+sayi2);
    }

    public static int toplama(int sayi1, int sayi2, int sayi3) {
        return (sayi1+sayi2+sayi3);
    }

    public static int cıkarma(int sayi1, int sayi2) {
        return (sayi1-sayi2);
    }

    public static int carpma(int sayi1, int sayi2) {
        return (sayi1*sayi2);
    }

    public static int carpma(int sayi1, int sayi2, int sayi3) {
        return (sayi1*sayi2*sayi3);
    }

    public static double bolme(int sayi1, int sayi2) {
        return ((double)sayi1/sayi2);
    }

    public static void main(String[] args) {

        /*
        Method Overloading kullanarak bir tane hesap makinesi tasarlamaya çalışın.
        Toplama ve çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.
         */
        Scanner sc = new Scanner(System.in);
        OUTER:
        while (true) {
            System.out.println("********************************************");
            String islemler = "1-Toplama işlemi\n"
                    + "2-Çıkarma işlemi\n"
                    + "3-Çarpma işlemi\n"
                    + "4-Bölme işlemi\n"
                    + "(çıkmak için = 0)";
            System.out.println("Hesap makinesine hoşgeldiniz...");
            System.out.println("Yapmak istediğin işlemi seçiniz : ");
            System.out.println(islemler);
            int islem = sc.nextInt();
            switch (islem) {
            //toplama işlemi
                case 1:{
                    System.out.println("Kaç sayı gireceksiniz (2 yada 3) ?");
                    int kacsayi = sc.nextInt();
                    if(kacsayi==2){
                        System.out.println("birinci sayıyı giriniz : ");
                        int sayi1 = sc.nextInt();
                        
                        System.out.println("ikinci sayıyı giriniz : ");
                        int sayi2 = sc.nextInt();
                        
                        System.out.println("Girdiğiniz sayıların sonucu = "+toplama(sayi1,sayi2));
                    }
                    else if(kacsayi==3){
                        System.out.println("birinci sayıyı giriniz : ");
                        int sayi1 = sc.nextInt();
                        
                        System.out.println("ikinci sayıyı giriniz : ");
                        int sayi2 = sc.nextInt();
                        
                        System.out.println("üçüncü sayıyı giriniz : ");
                        int sayi3 = sc.nextInt();
                        
                        System.out.println("Girdiğiniz sayıların sonucu = "+toplama(sayi1,sayi2,sayi3));
                    }
                    else{
                        System.out.println("lütfen 2 yada 3 değer giriniz...");
                    }
                    break;
                }
                    
            //çıkarma işlemi
                case 2:{
                    System.out.println("birinci sayıyı giriniz : ");
                        int sayi1 = sc.nextInt();
                        
                        System.out.println("ikinci sayıyı giriniz : ");
                        int sayi2 = sc.nextInt();
                        
                        System.out.println("Girdiğiniz sayıların sonucu = "+cıkarma(sayi1, sayi2));
                    break;
                }
                    
            //çarpma işlemi
                case 3:{
                    System.out.println("Kaç sayı gireceksiniz (2 yada 3) ?");
                    int kacsayi = sc.nextInt();
                    if(kacsayi==2){
                        System.out.println("birinci sayıyı giriniz : ");
                        int sayi1 = sc.nextInt();
                        
                        System.out.println("ikinci sayıyı giriniz : ");
                        int sayi2 = sc.nextInt();
                        
                        System.out.println("Girdiğiniz sayıların sonucu = "+carpma(sayi1,sayi2));
                    }
                    else if(kacsayi==3){
                        System.out.println("birinci sayıyı giriniz : ");
                        int sayi1 = sc.nextInt();
                        
                        System.out.println("ikinci sayıyı giriniz : ");
                        int sayi2 = sc.nextInt();
                        
                        System.out.println("üçüncü sayıyı giriniz : ");
                        int sayi3 = sc.nextInt();
                        
                        System.out.println("Girdiğiniz sayıların sonucu = "+carpma(sayi1,sayi2,sayi3));
                    }
                    else{
                        System.out.println("lütfen 2 yada 3 değer giriniz...");
                    }
                    break;
                }
            //bölme işlemi
                case 4:{
                    System.out.println("birinci sayıyı giriniz : ");
                        int sayi1 = sc.nextInt();
                        
                        System.out.println("ikinci sayıyı giriniz : ");
                        int sayi2 = sc.nextInt();
                        
                        System.out.println("Girdiğiniz sayıların sonucu = "+bolme(sayi1, sayi2));
                    break;
                }
                case 0:
                    System.out.println("Hesap makinesinden çıkılıyor...");
                    break OUTER;
                default:
                    System.out.println("Hatalı giriş... "
                            + "Lütfen tekrar giriniz...");
                    break;
            }
            System.out.println("********************************************\n\n");
        }
    }
}
