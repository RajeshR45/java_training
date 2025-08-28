import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FloatMultiply {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        float a = s.nextFloat();
        float b = s.nextFloat();
        
        System.out.printf("%.2f",a*b);
    }
}
