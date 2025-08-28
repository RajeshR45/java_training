import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Star {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for(int row = 0 ; row < n ; row++){
            for(int col = 0 ;col < row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}