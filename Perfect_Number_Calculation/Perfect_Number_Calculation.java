/*
Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen
sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
*/

	package Mukemmel_Sayi_Bulma;

	import java.util.Scanner;

	public class Mukemmel_Sayi_Bulma {

	public static void main(String[] args) {
	int sayi;
	int toplam=0;
	Scanner inp = new Scanner(System.in);
	System.out.println("Sayı giriniz: ");
	sayi = inp.nextInt();
	if(sayi <= 0) {
		System.out.println("Pozitif sayı giriniz !");
	}
	if(sayi == 1) {
		System.out.println("1 mükemmel sayıdır.");
	}
	for(int i=1;i<sayi;i++) {
		if(sayi % i == 0) {
			toplam +=i;
		}
	}
	if(sayi == toplam) {
		System.out.println(sayi+" bir mükemmel sayıdır.");
	}else {
		System.out.println(sayi+" bir mükemmel sayı değildir.");
	}

		}

	}
