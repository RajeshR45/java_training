import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Countzeroone {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
                
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        int zeros=0,ones=0;
        for(int i =0; i<size; i++){
            arr[i]= s.nextInt();
            if(arr[i] == 0)
                zeros++;
        }
        System.out.println("zc = " + zeros);
        System.out.println("oc = "+ (size-zeros));
   
    }
}