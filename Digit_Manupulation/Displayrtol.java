import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Displayrtol {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        long n = s.nextLong();
        
        while(n > 0){
            long ld = n % 10;
            System.out.print(ld+" ");
            n = n / 10;
        }
    }
}
