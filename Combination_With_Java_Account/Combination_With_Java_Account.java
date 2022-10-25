	package kombinasyon;

	import java.util.Scanner;

	public class Java_ile_Kombinasyon_Hesaplama {

	public static void main(String[] args) {
		int n,r,faktn=1,faktr=1,faktneksir=1;
		Scanner inp = new Scanner(System.in);
		System.out.println("C(n,r) için n sayısını giriniz:");
		n = inp.nextInt();
		System.out.println("C(n,r) için r sayısını giriniz:");
		r = inp.nextInt();
		// n! Hesaplama
		for(int i=1;i<=n;i++) {
			faktn *=i;
			}
		// r! hesaplama
		for(int i=1;i<=r;i++) {
			faktr*=i;
			}
		for(int i=1;i<=n-r;i++) {
			faktr*=i;
			}
		//Kombinasyon Formülü = C(n,r) = n! / (r! * (n-r)!)
		
		System.out.print("C(");
		System.out.print(n+",");
		System.out.print(r);
		System.out.print(") :"+ (faktn)/(faktr*(faktneksir)));
		
	
		
		
	}

}
