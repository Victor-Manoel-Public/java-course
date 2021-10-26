package arrays.challenges;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("original array= " + Arrays.toString(array));
        int[] reversed = reverse(array);
        System.out.println("reversed array= " + Arrays.toString(reversed));
    }

    public static int[] reverse(int[] array){
        int[] reverseArray = new int[array.length];
        int temp = array[0];
        reverseArray[array.length - 1] = temp;
        for(int i = 1; i < array.length; i++){
            reverseArray[array.length - i - 1] = array[i];
        }
        return reverseArray;
    }

}
