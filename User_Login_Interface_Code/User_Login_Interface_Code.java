package kullanici_giris;

import java.util.Scanner;

public class kullanici_giris {

	public static void main(String[] args) {
		
		String id, password, islem, yeniSifre;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanici Adinizi Giriniz:"+" ");
		id= input.nextLine();
		System.out.print("Sifrenizi Giriniz:"+" ");
		password= input.nextLine();
		
		if(id.equals("enes")&&password.equals("1999")) {
			System.out.print("Giris basarili");
		}else if(id.equals("enes")&&!password.equals("1999")) {
			System.out.println("Sifreyi yanlis girdiniz. Sifrenizi sifirlamak ister misiniz ?");
			System.out.println("1-Evet ");
			System.out.println("2-Hayır");
			islem = input.nextLine();
			if(islem.equals("1")) {
				System.out.print("Yeni sifrenizi giriniz");
				yeniSifre = input.nextLine();
				if(yeniSifre.equals("1999")) {
					System.out.print("Sifreniz eski sifrenizle aynı olamaz.Lütfen başka şifre giriniz:"+" ");
					yeniSifre = input.nextLine();
					System.out.print("Sifreniz olusturuldu");
				}else {
					System.out.print("Sifreniz olusturuldu");
				}
			}else {
				System.out.print("Sistemden cikis yapildi.");
			}
			
		}else if(!id.equals("enes")&&!password.equals("1999"))
				{
			System.out.print("Böyle bir hesap bulunamadi lütfen tekrar deneyiniz.");}
		
		else{
			System.out.print("Böyle bir hesap bulunamadi lütfen tekrar deneyiniz.");
		}
		
		
		
		
		
	}

}
