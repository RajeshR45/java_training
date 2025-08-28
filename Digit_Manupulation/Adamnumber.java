import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Adamnumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        long n = s.nextLong();
        
        long osq = n * n;
        long ldn,revn = 0,lds, revs = 0;
        while(n > 0){
            ldn = n % 10;
            revn = revn * 10 + ldn;
            n = n / 10;
        }
        long square = revn * revn;
        while(osq > 0){
            lds = osq % 10;
            revs = revs * 10 + lds;
            osq /= 10;
        }
        
        if(revs == square){
            System.out.println("Adam Number");
        }else{
            System.out.println("Not a adam number");
        }
    }
}