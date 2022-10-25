
import java.util.Scanner;
import java.util.Arrays;
public class Dizi_Siralama {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n=inp.nextInt();
        int[] list=new int[n];
        System.out.println("Dizinin elemanlarini giriniz:");
        int k=1;
        for(int i=0;i<n;i++){
            System.out.print(k+". eleman:");
            k++;
            list[i]= inp.nextInt();

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}