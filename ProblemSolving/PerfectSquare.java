import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PerfectSquare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int div = (int)Math.sqrt(n);
        
        if(div*div == n){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not");
        }
    }
}
