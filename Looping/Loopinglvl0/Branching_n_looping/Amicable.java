import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Amicable{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        
        int factor1 = 0,factor2 = 0;
        
        for(int i = 1 ; i <= a/2 ; i++){
            if(a % i == 0){
                factor1 += i;
            }
        }
        
        for(int j = 1 ; j <= b/2 ; j++){
            if(b % j == 0){
                factor2 += j;
            }
        }
        
        if(factor1 == b && factor2 == a){
            System.out.println("Amicable Pair");
        }else{
            System.out.println("Not a Amicable Pair");
        }
    }
}