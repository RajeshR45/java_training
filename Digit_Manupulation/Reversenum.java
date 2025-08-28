import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Reversenum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        long n = s.nextLong();
        long ld,rev = 0;
        while(n > 0){
            ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
