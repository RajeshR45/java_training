package java_training.Looping.Loopinglvl0;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Multiplicationtables{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        
        for(int i = 0 ; i < a ; i++){
            System.out.println((i+1) + " * " + b + " = " + ((i+1)*b));
        }
    }
}
