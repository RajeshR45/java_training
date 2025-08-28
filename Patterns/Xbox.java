import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Xbox {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        n = n * 2 - 1;
        
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1; col <= n ; col++){
                if(row == 1 || row == n || col == 1 || col == n || row == col || (row+col) == n+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
