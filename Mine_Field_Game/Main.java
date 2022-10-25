package Mayin_Tarlasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	        System.out.print("Dizinin satýr sayýsýný giriniz:");
	        int satirSayisi= scan.nextInt();
	        System.out.print("Dizinin sütun sayýsýný giriniz:");
	        int sutunSayisi= scan.nextInt();
	        MineSweeper minesweeper = new MineSweeper(satirSayisi, sutunSayisi);
	        minesweeper.run();
	}

}
