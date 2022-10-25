	
	package Max_Min_Bulma;

	import java.util.Scanner;

	public class Max_Min_Bulma {

	public static void main(String[] args) {
	int n;
	int sayi;
	int buyuk=0;
	int kucuk=0;
	Scanner inp = new Scanner(System.in);
	
	System.out.println("Kaç sayı girmek istersiniz: ");
	n = inp.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println(i+". "+"sayıyı giriniz:");
		sayi= inp.nextInt();
		if(i == 1) {
			buyuk=sayi;
			kucuk=sayi;
		}
		if(sayi>buyuk) {
			buyuk = sayi;
		}
		if(sayi<kucuk) {
			kucuk = sayi;
		}
		
	}
	System.out.println("Büyük sayı: "+buyuk);
	System.out.println("Küçük sayı: "+kucuk);
		}

	}
