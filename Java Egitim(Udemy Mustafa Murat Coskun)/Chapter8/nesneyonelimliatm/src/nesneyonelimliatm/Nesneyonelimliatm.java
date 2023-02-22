package nesneyonelimliatm;

public class Nesneyonelimliatm {
    
    //Nesne yönelimli atm projesi
    //login girişi kullanıcı girişini kontrol edecek
    //hesap class'ı hesap işlemlerini kontrol edecek
    //atm ise atm mizi çalıştaracak.

    public static void main(String[] args) {
        
        Hesap hesap1 = new Hesap("mustafa","123456",1000);
        
        ATM atm = new ATM();
        atm.calis(hesap1);        
    }
    
}
