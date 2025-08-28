package java_training.Looping.Loopinglvl0;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Poweroftwo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        int number = s.nextInt();
        int flag = 0,p = 1;
        
        while(number>=p){
            if(number==p){
                flag = 1;
            }
            p = p * 2;
        }
        if(flag == 0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
