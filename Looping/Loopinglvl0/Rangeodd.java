package java_training.Looping.Loopinglvl0;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rangeodd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        
        for(int i = 1; i <= a; i++){
            if(i % 2 == 0){
                continue;
            }else{
                System.out.print(i +" ");
            }
        }
    }
}
