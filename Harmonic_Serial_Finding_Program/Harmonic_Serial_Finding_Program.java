# Java ile Harmonik Seri Hesaplama	
	import java.util.Scanner;
	public class hormonik {
    	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        double toplam = 0;

        System.out.println("Sayi giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++){
            toplam+= (1.0 / i);
            
        }

        System.out.println(toplam);
   	 }
	}