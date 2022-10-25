# Java ile Üstlü Sayı Hesaplama	
	package Uslu_Sayi_Hesaplama;

	import java.util.Scanner;
	
	public class Uslu_Sayi_Hesaplama {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int taban,us,toplam=1;
		
		System.out.println("-----Üslü sayı hesaplama programı-----");
		System.out.println("Taban giriniz:");
		taban = inp.nextInt();
		System.out.println("Üs giriniz:");
		us = inp.nextInt();
		
		
		for(int i=1;i<=us;i++) {
			toplam *=taban;
		}
		System.out.println(taban+" üzeri "+us+"="+toplam);
		

	}

	}
