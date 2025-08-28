//Write a program to find given a specific date ,check whether the date is valid or not. Year will be in range 1900 to 9999

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Validdate {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String date = s.next();
        String[] d = date.split("/");
        
        int dd = Integer.parseInt(d[0]);
        int mm = Integer.parseInt(d[1]);
        int yy = Integer.parseInt(d[2]);
        
        if(yy>=1900 && yy<=9999){
            if(mm>=1 && mm<=12){
                if((mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm == 12) && (dd>=1 && dd<=31)){
                    System.out.println("Valid");
                }else if((mm==4 || mm==6 || mm==9 || mm==11) && (dd>=1 && dd<=30)){
                    System.out.println("Valid");
                }else if(mm == 2){
                    if(((yy % 400 == 0) && (yy % 100 !=0)) || (yy % 4 == 0)){
                        if(dd>=1 && dd<=29){
                            System.out.println("Valid");
                        }else{
                            System.out.println("Invalid");
                        }
                    }else if(dd>=1 && dd<=28){
                        System.out.println("Valid");
                    }else{
                        System.out.println("Invalid");
                    }
                }else{
                    System.out.println("Invalid");
                }
            }else{
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid");
        }
    }
}