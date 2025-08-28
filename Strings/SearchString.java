import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SearchString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        char a  = s.next().charAt(0);
        s.nextLine();
        String b = s.nextLine();
        if(b.contains(String.valueOf(a))){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }
    }
}