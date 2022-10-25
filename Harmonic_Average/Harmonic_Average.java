import java.util.Scanner;
public class HarmonikOrtalama {

    

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        double ortalama;
        float result = 0;
        for (int j : array) {
            result += 1f / j;
        }
        ortalama= array.length / result;

        System.out.println("Harmonik Ortalama = " + ortalama);
    }
}