import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrintNum {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int flag = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(Character.isDigit(s.charAt(i))){
                System.out.print(s.charAt(i)+"");
                flag = 1;
            }
        }
        
        if(flag == 0){
            System.out.println(flag);
        }
        
    }
}
