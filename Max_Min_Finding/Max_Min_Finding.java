
package Max_Min;

import java.util.Arrays;
import java.util.Scanner;


public class Max_Min {
  public static void main(String[] args) {
	  int sayi;
	  int temp_yakin;
	  int yakin=0;
	  int temp_uzak;
	  int uzak=0;
	  int [] myArray = {15,12,788,1,-1,-778,2,0};
	  Scanner inp = new Scanner(System.in);
	  System.out.println("Sayı giriniz: ");
	  sayi = inp.nextInt();
	  // Girilen sayıdan küçük sayılar : 1,-1,2,0
	  temp_yakin = Math.abs(sayi - myArray[0]);
	  //Varsayılan değer 10 
	  temp_uzak = Math.abs(sayi - myArray[0]);
	  for(int i : myArray) {
		if(i < sayi) {
			if(Math.abs(sayi - i)< temp_yakin) {
				temp_yakin = Math.abs(sayi - i);	
				yakin = i ;
				 
			}
		}
		if(i > sayi) {
			if(Math.abs(sayi - i)< temp_yakin) {
				temp_uzak = Math.abs(sayi - i);	
				uzak = i ;
				 
			}
		}
	
	  }
	  System.out.println("Girilen sayıdan küçük en yakın sayı = "+yakin);
	  System.out.println("Girilen sayıdan büyük en yakın sayı = "+uzak);
	 
	  
	
  }
}