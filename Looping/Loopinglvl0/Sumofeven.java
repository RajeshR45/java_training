package java_training.Looping.Loopinglvl0;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumofEven {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int sum = 0; 
        for(int i = 1 ; i <= n ;i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}