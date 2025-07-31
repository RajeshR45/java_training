import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner s = new Scanner(System.in);
        
        long n = s.nextLong();
        
        
        long copy = n;
        long cube = 0,ld = 0;
        long length = (long)(Math.log10(n) + 1);
        while(n > 0){
            ld = n % 10;
            cube += (long)(Math.pow(ld,length));
            n = n / 10;
        }
        
        if(copy == cube){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }
    }
}
