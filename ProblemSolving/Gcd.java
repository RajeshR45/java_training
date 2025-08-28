import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gcd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int i,gcd=0;
        
        for(i = 1 ;i <= 20 ; i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }else{
                continue;
            }
        }
        System.out.printf("GCD of two number is %d",gcd);
    }
}