import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Countfactors {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int n,count = 0;
        
        Scanner s = new Scanner(System.in);
        
        n = s.nextInt();
        
        for(int i = 1 ; i <= n ;i++){
            if(n % i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}