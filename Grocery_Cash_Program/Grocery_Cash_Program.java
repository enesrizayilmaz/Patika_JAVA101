# Manav Kasa Programı

Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

*Meyveler ve KG Fiyatları*

* Armut : 2.14 TL
* Elma : 3.67 TL
* Domates : 1.11 TL
* Muz : 0.95 TL
* Patlıcan : 5.00 TL

*Örnek Çıktı*
- Armut Kaç Kilo ? : 0
- Elma Kaç Kilo ? : 1
- Domates Kaç Kilo ? : 1
- Muz Kaç Kilo ? : 2
- Patlıcan Kaç Kilo ? : 3
- Toplam Tutar : 21.68 TL

```
import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.00 , toplam ;
        double kg1 , kg2 , kg3 , kg4 ,kg5 ;
        Scanner input = new Scanner(System.in);
        System.out.println("MANAV KASA PROGRAMI ");
        System.out.print("Armut Kaç Kilo : ");
        kg1 = input.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        kg2 = input.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        kg3 = input.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        kg4 = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo : ");
        kg5 = input.nextDouble();
        toplam = (kg1 * armut) + (kg2 * elma) + (kg3 * domates) + (kg4 * muz) + (kg5 * patlican) ;
        System.out.print("Toplam Tutar : " + toplam + " TL");
    }
}
