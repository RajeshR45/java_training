package java_training.Looping.Loopinglvl0;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Displayn {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        
        for(int i = 0 ; i < a ; i++){
            System.out.println(alphabet);
        }
    }
}