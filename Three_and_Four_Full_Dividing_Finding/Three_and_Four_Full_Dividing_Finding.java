# Girilen Sayıya Kadar Olan 3 Ve 4'e Tam Bölünen Sayıları Bulma

	package uc_ve_dort_tambolen_bulma;

	import java.util.Scanner;

	public class uc_ve_dort_tambolen_bulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int adet=0;
		double toplam=0.0;
		int input;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Sayı giriniz:");
		input=inp.nextInt();
		
		for(int i=1;i<=input;i++) {
			if(i%12 == 0) {
				adet++;
				toplam+=i;
			}
		}
		System.out.println("Ortalama="+(toplam/adet));
		
		
		
		
	}

}
