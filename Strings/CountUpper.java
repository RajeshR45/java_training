import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountUpper {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int[] arr = new int[26];
        
        for(int i = 65 ;i < 91 ;i++){
            arr[i - 65] = i;
        }
        String a = s.nextLine();
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ;j < a.length() ; j++){
                char ch = a.charAt(j);
                if(ch == arr[i]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}