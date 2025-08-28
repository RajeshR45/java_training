import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Divby3or5{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        if(a%3 == 0){
            System.out.print("Hi");
        }if(a%5 == 0){
            System.out.print("Hello");
        }
    }
}