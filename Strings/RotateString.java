import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RotateString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int key = s.nextInt();
        s.nextLine();
        String a = s.nextLine();
        int n = key % a.length();
        String rotate = a.substring(n) + a.substring(0,n);
        System.out.println(rotate);
    }
}