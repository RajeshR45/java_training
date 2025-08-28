import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Primefactor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int pf = 0;
        boolean flag = false;
        
        for(int i = 1; i <= a ; i++){
            if(a % i == 0){
                for(int j = 2 ; j < i ; j++){
                    if(i % j == 0){
                        flag = true;
                    }
                }
                if(flag == false){
                    pf = i;
                }else{
                    continue;
                }
            }
        }
        
        System.out.println(pf);
    }
}