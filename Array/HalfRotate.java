import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HalfRotate {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //INPUT
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        int a[] = new int[size];
        
        for(int i = 0 ;i < size ;i++){
            a[i] = sc.nextInt();
        }
        
        int key = sc.nextInt();
        
        //ROTATION
        
        for(int j = 1 ; j <= key  ; j++){
            int cp = a[size/2];
            
            for(int k = size/2 ; k < size-1 ; k++){
                a[k] = a[k+1];
            }
            a[size-1] = cp;
        }
        
        //DISPLAY
        for(int l = 0 ; l < size ;l++){
            System.out.print(a[l]+" ");
        }
        
        
    }
}