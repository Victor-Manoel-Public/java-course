public class SecondsAndMinutes {

    /*
    1. Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
    You should validate that the first parameter is >=0.
    You should validate that the 2nd parameter is >= 0 && <= 59.

    The method should return "Invalid Value" in the method if either of the above are not true.
    If the parameters are valid then calculate how many hours, minutes and seconds equal the minutes and seconds
    passed to this method and return that value as string in the format "XXh YYm ZZs" where XX represents a number of
    hours, YY the minutes and ZZ the seconds.


    2. Create a 2nd method of the same name but with only one parameter seconds.
    Validate that it is >=0, and return "Invalid Value" if it is not true
    If it is valid, the calculate how many minutes are in the seconds value and then call the other overloaded
    method passing the correct minutes and seconds calculated so that i can calculate correctly.

    Call both methods to print values to the console.
    * */
    public static String getDurationString(int min, int secs){
        if( (min >= 0) && (secs >= 0 && secs <= 59)){
            int hours = min/60;
            int remainMinutes = min % 60;
            return hours + "h " + remainMinutes + "m " + secs +"s";
        }
        return "Invalid Value";
    }

    public static String getDurationString(int seconds){
         if(seconds < 0 ){
             return "Invalid Value";
         }
         int minutes = seconds / 60;
         int remainSeconds = seconds % 60;

         return getDurationString(minutes, remainSeconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }
}
