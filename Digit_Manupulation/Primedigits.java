import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Primedigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s =new Scanner(System.in);
        
        long n = s.nextLong();
        long ld,lc,p = 1;
        long copy = n;
        while(copy > 0){
            lc = copy % 10;
            p = p * 10;
            copy = copy / 10;
        }
        p = p / 10;
        while(n > 0){
            ld = n / p;
            n = n % p;
            // System.out.println(ld);
            if(ld == 3 || ld == 5 || ld == 7 || ld == 2){
                System.out.print(ld+" ");
            }
            p = p / 10;
        }
    }
}