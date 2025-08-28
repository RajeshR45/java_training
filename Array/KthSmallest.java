import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class KthSmallest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int size = s.nextInt();
        int a[] = new int[size];
        int k = s.nextInt();
        
        for(int i = 0 ; i < size ;i++){
            a[i] = s.nextInt();
        }
        if(k > size){
            System.out.println("Out of Range");
        }else{
        // int min = a[0];
        // int count = 0;
        // for(int i = 1; i < size ; i++){
        //     if(min > a[i]){
        //         count++;
        //     }
        //     if(count == k){
        //         break;
        //     }
        //   }
        //     System.out.println(min);
            
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ;j++){
                if(a[i] < a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
            
        // for(int i = 0 ; i < size ; i++){
        //     System.out.println(a[i]+" ");
        // }
            
        System.out.println(a[k-1]);
        }
    }
}