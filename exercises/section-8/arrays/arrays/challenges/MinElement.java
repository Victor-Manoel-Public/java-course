package arrays.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter array length: ");
        int[] counts = readIntegers(sc.nextInt());
        System.out.println("Min value of " + Arrays.toString(counts) + "= " + findMin(counts));
    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter all "+ count +" value(s) ");
        for(int k = 0; k < array.length; k++){
            array[k] = sc.nextInt();
        }

        return array;
    }
    private static int findMin(int[] arr){
        // int min = arr[0];  BAD
        int min = Integer.MAX_VALUE; // GOOD
        for (int k : arr) {
            if (k < min) {
                min = k;
            }
        }
        return min;
    }

}
