package arrays.tests;

import java.util.Arrays;

public class ReferencesVsValues {
    public static void main(String[] args) {
        // Value types
        System.out.println("\n=====================");
        System.out.println("Init value types");
        int intOne = 55;
        int intTwo = intOne;

        System.out.println("intOne= " + intOne);
        System.out.println("intTwo= " + intTwo);

        System.out.println("After change (increment): ");
        intTwo++;
        System.out.println("intOne= " + intOne);
        System.out.println("intTwo= " + intTwo);

        System.out.println("End value types");

        // Reference type
        System.out.println("\n=====================");
        System.out.println("Init reference types");
        int[] arrayOne = new int[6];
        int[] arrayTwo = arrayOne;
        // Both arrayOne and arrayTwo points to the same memory address
        System.out.println("arrayOne= " + Arrays.toString(arrayOne));
        System.out.println("arrayTwo= " + Arrays.toString(arrayTwo));
        System.out.println("After change: ");
        arrayTwo[0] = 6;
        System.out.println("arrayOne= " + Arrays.toString(arrayOne));
        System.out.println("arrayTwo= " + Arrays.toString(arrayTwo));

        /*
            NOTE:
                arrayOne
                        \----------\
                       ---------------------
                       |0|1|2|3|4|5|6|7|8|9\
                       ---------------------
                         ---------/
                arrayTwo/
                Both arrays points to the same memory address, so once one of them is changed, all is affected.
         */

        modifyArray(arrayTwo); // third reference to array
        System.out.println("After modifyArray method:");
        System.out.println("arrayOne= " + Arrays.toString(arrayOne));
        System.out.println("arrayTwo= " + Arrays.toString(arrayTwo));

    }

    private static void modifyArray(int[] arr){
        // this method is the third that references to the same memory address by using arr parameter
        arr[0] = 12;
    }
}
