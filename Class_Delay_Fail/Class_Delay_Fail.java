package sinif_gecme_kalma;

import java.util.Scanner;

public class sinif_gecme_kalma {

	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,muzik,ortalama;
		int dersSayisi=0;
		int toplamPuan=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik notunuzu giriniz:");
		mat=input.nextInt();
		System.out.println("Fizik notunuzu giriniz:");
		fizik=input.nextInt();
		System.out.println("Kimya notunuzu giriniz:");
		kimya=input.nextInt();
		System.out.println("Türkçe notunuzu giriniz:");
		turkce=input.nextInt();
		System.out.println("Müzik notunuzu giriniz:");
		muzik=input.nextInt();
		
	    if((mat<100 && mat>0)) {
	    	dersSayisi++;
	    	toplamPuan+=mat;
	    }
	    if((turkce<100 && turkce>0)) {
	    	dersSayisi++;
	    	toplamPuan+=turkce;	
	    }
	    if((muzik<100 && muzik>0)) {
	    	dersSayisi++;
	    	toplamPuan+=muzik;	
	    }
	    if((fizik<100 && fizik>0)) {
	    	dersSayisi++;
	    	toplamPuan+=fizik;
	    }
	    if((kimya<100 && kimya>0)) {
	    	dersSayisi++;
	    	toplamPuan+=kimya;
	    }
	    if(dersSayisi == 0) {
	    	System.out.println("Sınav bilgisi girilmemiştir.");
	    }else {
	        ortalama = (toplamPuan/dersSayisi);
		if(ortalama<=55){
			System.out.println("Sınıftan kaldınız.");
			System.out.println(ortalama);
			}else{
			System.out.println("Sınıftan geçtiniz.");
			System.out.println(ortalama);
			}
		
	    }
	
	    

			}

		}
