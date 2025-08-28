import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReplaceVowels {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        String a = s.nextLine();
        
        String b  = a.replaceAll("[aeiouAEIOU]"," ");
        System.out.println(b);
    }
}