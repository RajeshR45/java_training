import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SearchArray{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int size = s.nextInt();
        int arr[]= new int[size];
        for(int i = 0 ;i < size;i++){
            arr[i] = s.nextInt();
        }
        int key = s.nextInt();
        int flag = 0;
        for(int i = 0 ; i< size;i++){
            if(arr[i] == key){
                flag = 1;
            }
        }
        if(flag == 0){
        System.out.println("Not found");
        }else{
            System.out.println("Found");
        }
    }
}