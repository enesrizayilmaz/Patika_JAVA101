	package Fibonacci_Serisi;

	import java.util.Scanner;

	public class Fibonacci_Serisi {

	public static void main(String[] args) {
		// Fibonacci Serisi = 0, 1, 1, 2, 3, 5, 8, 13, 21 ...
		int sayi,s1,s2,toplam;
		Scanner inp = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		sayi = inp.nextInt();
		s1=0;
		s2=1;
		System.out.println(sayi +" sayısının fibonacci serisi : ");
		for(int i=1;i<=sayi;i++) {
			System.out.print(s1 + " , ");
			toplam = s1+s2;
			s1 = s2;
			s2 = toplam;
			
			
			}

		}

	}
