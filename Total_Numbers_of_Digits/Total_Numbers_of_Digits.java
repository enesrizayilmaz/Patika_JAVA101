	package Basamak_Sayi_Toplami;

	import java.util.Scanner;

	public class Basamak_Sayi_Toplami {

	public static void main(String[] args) {
		int sayi,sonuc=0,basDeger;
		System.out.println("Basamak sayıları toplanacak değeri giriniz: ");
		Scanner inp = new Scanner(System.in);
		sayi = inp.nextInt();
		while(sayi !=0) {
			basDeger = sayi % 10;
			sonuc +=basDeger;
			sayi = sayi / 10 ;
		}
		System.out.println("Basamak sayılarının toplamı="+sonuc);
		
	}

	}
