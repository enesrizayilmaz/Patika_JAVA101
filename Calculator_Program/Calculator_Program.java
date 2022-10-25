#Hesap Makinesi Projesi

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int s1, s2, islem;

        Scanner inp = new Scanner(System.in);

        System.out.print("\nSayı 1 : ");
        s1 = inp.nextInt();

        System.out.print("\nSayı 2 : ");
        s2 = inp.nextInt();

        System.out.print("\nToplama yapmak için 1 yaz. Çıkartma işlemi için 2 yaz. Çarpma için 3 yaz. Bölme için 4 yaz.");
        islem = inp.nextInt();

        switch (islem) {
            case 1:
                System.out.println("\n\nToplam : " + (s1 + s2));
                break;
            case 2:
                System.out.println("\n\nFark : " + (s1 - s2));
                break;
            case 3:
                System.out.println("\n\nÇarpım : " + (s1 * s2));
                break;
            case 4:
                System.out.println("\n\nBölüm : " + (s1 / s2));
                break;

            default:
                System.out.println("\nGeçersiz Değer");
                break;
        }

    }
}