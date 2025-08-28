import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Commonele {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int size1 = s.nextInt();
        int size2 = s.nextInt();
        int size3 = s.nextInt();
        
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        int arr3[] = new int[size3];
        int dup[] = new int[size1+size2+size3];
        int adup[] = new int[size1+size2+size3];
        
        for(int i = 0 ;i < size1 ;i++){
            arr1[i] = s.nextInt();
        }
        for(int i = 0 ;i < size2 ;i++){
            arr2[i] = s.nextInt();
        }
        for(int i = 0 ;i < size3 ;i++){
            arr3[i] = s.nextInt();
        }
        int pos = 0;
        for(int i = 0 ; i < size1 ;i++){
            for(int j = 0 ;j < size2;j++){
                if(arr1[i]==arr2[j]){
                    dup[pos] = arr1[i];
                    pos++;
                }
            }
        }
        int posa = 0;
        for(int i = 0 ; i < dup.length ; i++){
            for(int j = 0 ; j < size3; j++){
                if(dup[i] == arr3[j]){
                    adup[posa] = dup[i];
                    posa++;
                }
            }
        }
        
        for(int i = 0 ; i < adup.length; i++){
            if(adup[i] == 0){
                break;
            }
            System.out.print(adup[i] + " ");
        }
    }
}

