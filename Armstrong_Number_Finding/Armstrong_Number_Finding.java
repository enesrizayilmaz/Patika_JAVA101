# Armstrong sayı bulan program	
	package Armstrong_Sayi_Bulma;

	import java.util.Scanner;

	public class Armstrong_Sayi_Bulma {

	public static void main(String[] args) {
		//Armstrong sayı hesaplama
		//Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
		//Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
		
		 /* 
		 Basamak sayısı bulma
		 
		 1967 / 10 = 196
		 196  / 10 = 19
		 19   / 10 = 1
		 1    / 10 = 0
		 
		 Basamak sayısı değişkeni 0 ile başlatılıp her bölünmede 1 
		 arttırılırsa basamak sayısı tespit edilir.
		 */
		
		 /* 
		 Bir sayının son basamağını bulma
		 1967 % 10 = 7
		 1967 / 10 = 196
		 196  % 10 = 6
		 ...
		 ...
		 */
		int sayi,geciciSayi,basSayi=0,taban,sonuc=0;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		sayi = inp.nextInt();
		geciciSayi = sayi;
		while(geciciSayi !=0) {
			geciciSayi = geciciSayi / 10;
			basSayi++;
		}
		geciciSayi = sayi;
		
		while(geciciSayi !=0) {
		
			taban = geciciSayi % 10;
			int ustoplam=1;
			for(int i=1;i<=basSayi;i++) {
				ustoplam *=taban;
			}
			sonuc+=ustoplam;
			geciciSayi = geciciSayi / 10;
			
			
		
		}
		
	    if(sayi == sonuc) {
	    	System.out.println("Sayı bir armstrong sayıdır.");
	    }else {
	    	System.out.println("Sayı bir armstrong sayı değildir.");
	    }
	
		
		
		
		
		

		}

		}
