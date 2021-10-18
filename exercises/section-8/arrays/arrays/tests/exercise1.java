package arrays.tests;
import java.util.Scanner;
public class exercise1 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num = getNumbers(5);
        for (int i = 0; i < num.length; i++) {
            System.out.printf("Number #%d -> %d.%n", i, num[i]);
        }
        System.out.println("Average is: " + getAverage(num) + ".");
    }

    public static int[] getNumbers(int n){
        int[] values = new int[n];
        System.out.printf("Enter %d number(s): \n", n);
        for (int k = 0; k < values.length; k++){
            values[k] = sc.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] n){
        double total = 0.0;
        for (int i : n) {
            total += i;
        }

        return (total / (double) n.length);
    }
}
