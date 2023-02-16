
package carpımtablosu;

public class Carpımtablosu {

    public static void main(String[] args) {
        
        // iç içe for döngüsü kullanarak bir çarpım tablosu oluşturun. 
        
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println("\n");
        }        
    }
    
}
