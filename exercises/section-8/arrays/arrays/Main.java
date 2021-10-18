package arrays;
public class Main {
    public static void main(String[] args) {
        int[] myArr = new int[10];
        for (int i = 0; i < myArr.length ; i++) {
            myArr[i] = i * 10;
        }

        printIntArray(myArr);
    }

    public static void printIntArray(int[] arr){
        for(int i =0; i < arr.length; i++){
            System.out.printf("#%d -> %d.%n", i, arr[i]);
        }
    }
}