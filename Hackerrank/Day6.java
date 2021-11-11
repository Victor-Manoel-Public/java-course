import java.io.*;
import java.util.*;

public class Day6 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t = sc.nextInt();
        String s;

        for(int i= 0; i < t; i++){
            s = sc.next(); // reads string

            for(int k =0; k < s.length(); k++){

                if(k % 2 == 0){
                    System.out.print(s.charAt(k)); // prints even
                }
            }

            System.out.print(" "); // space between

            for(int x =0; x < s.length(); x++){
                if(x % 2 == 1){
                    System.out.print(s.charAt(x)); // prints odd
                }
            }

            System.out.println(); // next

        }
    }
}