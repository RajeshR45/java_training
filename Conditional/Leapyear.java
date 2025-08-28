import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leapyear {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        
        if(((year % 400 == 0) || (year % 100 != 0)) && (year % 4 == 0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a Leap year");
        }
    }
}
