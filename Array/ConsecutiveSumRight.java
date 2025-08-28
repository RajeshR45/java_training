import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConsecutiveSumRight{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        int sum=0;
        for(int i =0; i<size; i++){
            arr[i]= s.nextInt();
            sum +=arr[i];
        }
        
        for(int i=0;i<size;i++){
            System.out.print(sum-arr[i] + " ");
            sum = sum-arr[i];
        }
   
        
    }
}