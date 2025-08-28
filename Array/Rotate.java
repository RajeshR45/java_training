import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rotate{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int size = s.nextInt();
        int a[] = new int[size];
        for(int i = 0 ; i < size ; i++){
            a[i] = s.nextInt();
        }
        int k = s.nextInt();
        for(int i = 0; i < k % size;i++){
            int copy = a[0];
            for(int j = 0 ; j < size-1 ; j++){
                a[j] = a[j+1];
            }
            a[size-1] = copy;
        }
        
        for(int j = 0 ;j < size ;j++){
            System.out.print(a[j]+" ");
        }
    }
}