package java_training.Looping.Loopinglvl0;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rangeeven {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        
        for(int i = a; i <= b; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}