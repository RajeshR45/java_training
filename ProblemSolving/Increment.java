// Sample Input 0

// 10 12
// Sample Output 0

// Pre increment:11
// Post increment:12
// Final values:11 13
// Sample Input 1

// 5 5
// Sample Output 1

// Pre increment:6
// Post increment:5
// Final values:6 6



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Increment {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        
        System.out.println("Pre increment:"+(++a));
        System.out.println("Post increment:"+(b++));
        System.out.println("Final values:"+a+" "+b);
    }
}