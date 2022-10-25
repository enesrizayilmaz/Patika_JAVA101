# Ödev
* Yarıçapı **r** , merkez açısının ölçüsü **𝛼** olan daire diliminin alanını bulan programı yazınız.
* **𝜋** sayısını 3.14 alınız.
* Formül = (**𝜋** * (**r * r**) * **𝛼**) / 360

```
import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        int r , alfa ;
        double pi = 3.14 , alan ;
        Scanner input = new Scanner(System.in);
        System.out.println("Daire Diliminin Alanını Hesaplama : ");
        System.out.print("Dairenin Yarıçapı : ");
        r = input.nextInt();
        System.out.print("Dairenin Merkez Açı Ölçüsü : ");
        alfa = input.nextInt();
        
        alan = ( pi * ( r * r ) * alfa ) / 360 ;

        System.out.println("Daire Diliminin Alanı : " + alan);

    }
}

