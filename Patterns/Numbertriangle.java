import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Numbertriangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int val = 0;
        
        for(int row = 1; row <= n ; row++){
            if(row % 2 == 0){
                val = 2;
            }else{
                val = 1;
            }
            
            for(int col = 1 ; col <= row ; col++){
                System.out.print(val);
                val = val+2;
            }
            System.out.println();
        }
    }
}
