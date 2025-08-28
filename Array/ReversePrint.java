import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReversePrint{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int size = s.nextInt();
        
        int arr[] = new int[size];
        
        for(int i = 0 ; i < size ; i++){
            arr[i] = s.nextInt();
        }
        
        for(int i = size-1 ; i >= 0 ; i--){
            System.out.print(arr[i]+" ");
        }
    }
}