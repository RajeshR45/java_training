package java_training.Looping.Loopinglvl0;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Division {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int count = 0;
        while(a >= 0){
            a = a-b;
            count++;
        }
        
        System.out.print(count-1);
    }
}
