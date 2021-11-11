//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            System.out.println(
                    map.get(s) == null ?
                            "Not found" :
                            s + "=" + map.get(s)
            );
        }
        in.close();
    }
}