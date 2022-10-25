# KDV Tutarı Hesaplayan Program
* Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
* (Not : KDV tutarını %18 olarak alın.)
* KDV'siz Fiyat = 10
* KDV'li Fiyat = 11.8
* KDV Tutarı = 1.8
# Ödev
* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan program yazınız.
```
import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar , kdv , kdvliTutar , kdvTutari ;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Fiyatını Giriniz : ");
        tutar = input.nextDouble();

        boolean kdvOrani = (0 < tutar) && (tutar < 1000);
        kdv = kdvOrani ? 0.18 : 0.08 ;
        kdvTutari = tutar * kdv ;
        kdvliTutar = tutar + kdvTutari ;

        System.out.println("Ürün Fiyatı : " + tutar);
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.println("KDV'li Fiyat : " + kdvliTutar);

    }
}

```

# Patika Linkim:
<a href="https://app.patika.dev/krblttrkn">Patika Profilim:)</a>