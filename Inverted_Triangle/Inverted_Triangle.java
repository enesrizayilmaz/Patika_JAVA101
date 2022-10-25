	package Ters_ucgen;
	import java.util.Scanner;

	public class Ters_Ucgen {

	public static void main(String[] args) {
		
		int n;
		Scanner sayi = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		n = sayi.nextInt();
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
