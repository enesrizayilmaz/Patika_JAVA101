	import java.util.Scanner;

	class MatrisTranspozunuBulma{
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Matris kaç satırlı ?  ");
        int length = scan.nextInt();
        System.out.print("Matris kaç sütunlu ?  ");
        int weight = scan.nextInt();
        System.out.println("Matrisin elemanlarını sırasıyla giriniz.");

        int[][] matrix = new int[length][weight];
 	int[][] matrix_transpoze = new int[weight][length];

        for(int i =0  ; i < matrix.length;i++){
            for(int j = 0 ; j < matrix[i].length;j++)
                matrix[i][j] = scan.nextInt();
        }
        System.out.println("==================================");
        System.out.println();

        for(int i =0  ; i < matrix.length;i++){
            for(int j = 0 ; j < matrix[i].length;j++)
                System.out.print(matrix[i][j]+"   ");
                System.out.println();
        }
        System.out.println("------------");
        System.out.println("Matrisin transpozu : ");
        System.out.println();
       
        for(int j = 0 ; j < matrix[0].length;j++){
            for(int i =0  ; i < matrix.length;i++){
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
        scan.close();
    }
}