import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Length {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        String a = s.nextLine();
        int length = 0;
        while(true){
            char ch='0';
            try{
            ch = a.charAt(length);
            }catch(Exception e){
                break;
            }
            if(Character.isLetterOrDigit(ch) || ch == 32) 
                length++;
            
        }
        System.out.println(length);
    }
}