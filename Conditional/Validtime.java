import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Validtime {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        // int h = s.nextInt();
        // int m = s.nextInt();
        // int s = s.nextInt();
        // StringBuilder res = new StringBuilder();
        // String time = s.nextLine();
        // for(int j = 0 ; j < 2; j++){
        // for(int i = 0 ; i < time.length() ; i++){
        //     if((int)(time.charAt(i).isDigit())){
        //         res.append((int)time.charAt(i));
        //     }if(time.charAt(i) == ':'){
        //         break;
        //     }   
        // }
        // }
        
        String time = s.next();
        String[] t = time.split(":");
        
        int h = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int sec = Integer.parseInt(t[2]);      
        
        if((h >= 0 && h <= 23) && (m>=0 && m<=59) && (sec>=0 && sec<=59)){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
        
        
        
    }
}