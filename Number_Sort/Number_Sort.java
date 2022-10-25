# Girilen 3 sayıyı küçükten büyüğe sıralayan program
	package sayi_siralama;

	import java.util.Scanner;

	public class sayi_siralama {

	public static void main(String[] args) {
		int sayi1,sayi2,sayi3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.sayıyı giriniz:");
		sayi1=input.nextInt();
		
		System.out.println("2.sayıyı giriniz:");
		sayi2=input.nextInt();
		
		System.out.println("3.sayıyı giriniz:");
		sayi3=input.nextInt();
		
		if(sayi1<sayi2 && sayi1<sayi3) {
			if(sayi2<sayi3) {
				System.out.println("sayı 1 < sayı 2 < sayı 3");
			}else {
				System.out.println("sayı 1 < sayı 3 < sayı 2");
			}
		}else if(sayi2<sayi1 && sayi2<sayi3){
			if(sayi1<sayi3) {
				System.out.println("sayı 2 < sayı 1 < sayı 3");
			}else {
				System.out.println("sayı 2 < sayı 3 < sayı 1");
			}
		}
		else {
			if(sayi1<sayi2) {
				System.out.println("sayı 3 < sayı 1 < sayı 2");
			}else {
				System.out.println("sayı 3 < sayı 2 < sayı 1");
						}
					}
		
		
				}

			}
