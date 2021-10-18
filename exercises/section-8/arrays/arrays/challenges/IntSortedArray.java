package arrays.challenges;
import java.util.Arrays;
import java.util.Scanner;

public class IntSortedArray {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //int[] nums = new int[size];
        int[] nums = getIntegers(2);
        //printArray(nums);
        int[] sorted = sortIntegers(nums);
        printArray(sorted);
    }

    public static int[] getIntegers(int times){
        int[] arr = new int[times];
        System.out.println("Enter all the " + times + " values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return (arr);
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("#%d -> %d.%n", i, arr[i]);
        }
    }
    public static int[] sortIntegers(int[] arr){
        //int[] sortedArray = new int[arr.length];

        // copy the arr to sortedArray
        /*for (int k = 0; k < arr.length; k++){
            sortedArray[k] = arr[k];
        }*/

        int[] sortedArray = Arrays.copyOf(arr, arr.length);

        boolean run = true;
        int temp;
        while (run){
            run = false;
            for (int i = 0; i < sortedArray.length -1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    run = true;
                }
            }
        }
        return (sortedArray);
    }
}
