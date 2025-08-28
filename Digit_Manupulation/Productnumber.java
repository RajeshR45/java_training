import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Productnumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner s = new Scanner(System.in);
        
        long n = s.nextLong();
        
        long product = 1,ld = 0;
        
        while(n > 0){
            ld = n % 10;
            product = product * ld;
            n /= 10;
        }
        
        System.out.println(product);
    }
}
