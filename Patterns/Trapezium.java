import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Trapezium {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for(int row = 1; row <= n ;row++){
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= n ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}