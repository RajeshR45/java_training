// Sample Input 0
// 5
// Sample Output 0

// 11111
// 00000
// 11111
// 00000
// 11111


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Alternatezeroone {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for(int row = 1; row <= n ; row++){
            for(int col = 1 ; col <= n ; col++){
                System.out.print(row%2);
            }
            System.out.println();
        }
    }
}
