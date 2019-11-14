import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void printArray (int[] mas, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(mas[i]);
        }
        System.out.println();
    }
    public static void reverseArray (int[] mas, int n) {
        int tmp;
        for (int i = 0; i < n / 2; i++) {
            tmp = mas[i];
            mas[i] = mas[n - i - 1];
            mas[n - i - 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] mas = new int[1000];
        Scanner input = new Scanner(System.in);
        System.out.println("Input number (number < 1000). Then enter elements of array");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            mas[i] = input.nextInt();
        }
        reverseArray(mas, n);
        printArray(mas, n);
    }
}
