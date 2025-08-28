import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Strongnumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int n,sum = 0,fact = 1,ld;
        n = s.nextInt();
        
        int copy = n;
        
        while(n > 0){
            ld = n % 10;
            n = n / 10;
            fact = 1;
            for(int i = 1; i <= ld ; i++){
                fact = fact * i;
            }
            sum = sum + fact;
        }
        if(copy == sum){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a strong number");
        }
        
    }
}
