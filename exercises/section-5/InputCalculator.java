import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        /*
    Write a method called inputThenPrintSumAndAverage that does not have any parameters.
    The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
    When the user enters something that is not an int then it needs to print a message in the format
    "SUM = XX AVG = YY".
    XX represents the sum of all entered numbers of type int.
    YY represents the calculated average of all numbers of type long.

    TIP: Use casting when calling the round method since it needs double as a parameter.
    NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.
    NOTE: Be mindful of users who may type an invalid input right away (see example above).

    EXAMPLES OF INPUT/OUTPUT:
      EXAMPLE 1:
        INPUT:
        1
        2
        3
        4
        5
        a

      OUTPUT
      SUM = 15 AVG = 3

      EXAMPLE 2:
        INPUT:
        hello
        OUTPUT:
        SUM = 0 AVG = 0
     */
        Scanner sc = new Scanner(System.in);
        int total = 0, counter = 0;
        while ( sc.hasNextInt() ){
            // System.out.println("Enter a number: "); this is not needed
            total += sc.nextInt();
            counter++;
        }
        System.out.printf("SUM = %d AVG = %d", total, (Math.round((double) total/counter) ));
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

}
