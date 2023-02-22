
package calisanlarprojesi;

public class Yonetici extends Calisan {
        
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyAd, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyAd, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı : "+sorumlu_kisi_sayisi);
    }
    
    public void zamYap(int zamMiktarı){
        System.out.println(getAd()+" çalışanlara "+zamMiktarı+" tl zam yapıyor...");
    }
    
    
    
}
