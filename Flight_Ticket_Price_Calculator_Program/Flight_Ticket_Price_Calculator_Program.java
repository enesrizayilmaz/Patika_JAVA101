* Uçak Bileti Fiyatı Hesaplama
		
		Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

		Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
		Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
		Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
		Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
		Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
		
		`
		package ucak_bileti_fiyati_hesaplama;
			
		import java.util.Scanner;

		public class ucak_bileti_fiyati_hesaplama {

			public static void main(String[] args) {
		double km, perKm=0.10,toplamFiyat;
		int yas,yon;
		//yon = 1 tek yön - yon = 2 gidiş-dönüş
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yaşınızı giriniz:");
		yas = input.nextInt();
		System.out.println("Kaç km gideceğinizi giriniz:");
		km = input.nextDouble();
		System.out.println("Gidiş şeklinizi seçiniz. 1-Tek yön 2-Gidiş-Dönüş:");
		yon = input.nextInt();
		
		if(km<0 || yas <0 || yon > 2 || yon < 1) {
			System.out.println("Hatalı veri girdiniz!");
		}else {
			toplamFiyat = (km * perKm);
			System.out.println("Toplam fiyat"+toplamFiyat);
			System.out.println("İndirim uygulanıyor");
			if(yas<12) {
				toplamFiyat *=0.5;
			}else if(yas>=12 && yas<=24) {
				toplamFiyat *=0.90;
			}else if(yas>65) {
				toplamFiyat *=0.70;
			}
			if(yon == 2) {
				toplamFiyat *=0.8;
			}
			System.out.println("İndirimli fiyat"+toplamFiyat);
			
		}
		
		
		
		
		
		
		
		
		
		
			}

		}
                      ` 
