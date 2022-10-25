# Ödev - Vücut Kitle İndeksi Hesaplayan Program
### Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
### Formül
***Kilo(kg) / Boy(m) * Boy(m)***
### Çıktısı
* Lütfen boyunuzu (metre cinsinde) giriniz : 1.72
* Lütfen kilonuzu giriniz : 105
* Vücut Kitle İndeksiniz : 35.49215792320173

```
import java.util.Scanner;

public class vkIndeks {
    public static void main(String[] args) {
        double kg , m , indeks ;
        Scanner input = new Scanner(System.in);
        System.out.println("VÜCUT KİTLE İNDEKSİ HESAPLAMA ");
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();
        indeks = kg / ( m * m ) ;
        System.out.print("Vücut Kitle İndeksiniz : " + indeks);
    }
}
