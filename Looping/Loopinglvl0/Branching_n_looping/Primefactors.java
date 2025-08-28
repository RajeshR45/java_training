import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Primefactors {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int count = 0, i = 2;
        
        while(n > 1){
            if(n % i == 0){
                count++;
                n = n / i;
            }else{
                if(count != 0){
                    System.out.println(i+"->"+count);
                    count = 0;
                    
                }
                i++;
            }
        }
        System.out.println(i+"->"+count);
            
    }
}