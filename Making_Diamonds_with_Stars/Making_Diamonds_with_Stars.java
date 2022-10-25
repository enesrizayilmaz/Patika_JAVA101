	package Yildizlar_ile_Elmas_Yapma;

	import java.util.Scanner;

	public class Yildizlar_ile_Elmas_Yapma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sayi = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		n = sayi.nextInt();
		//Üçgen
		for(int i=1;i<=n-1;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k <= (2*i)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Ters üçgen
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k <= (2*i)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		}

	}
