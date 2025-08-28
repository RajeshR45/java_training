// Sample Input 0
// 5
// Sample Output 0

// 11011
// 11011
// 00000
// 11011
// 11011



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Boxplus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n % 2 == 0){
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n; j++){
                    if(i == n/2 || j == n/2 || i == (n/2)-1 || j == (n/2)-1){
                        System.out.print(0);
                    }else{
                        System.out.print(1);
                    }
                }
                System.out.println();
            }
        }else{
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n; j++){
                    if(i == n/2 || j == n/2){
                        System.out.print(0);
                    }else{
                        System.out.print(1);
                    }
                }
                System.out.println();
            }
        }
    }
}