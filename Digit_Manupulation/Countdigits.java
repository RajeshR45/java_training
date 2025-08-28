import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Countdigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        long n = s.nextLong();
        
        long count = 0;
        
        while(n > 0){
            n = n / 10;
            count ++;
        }
        
        
        System.out.println(count);
    }
}
