//Write a program in C to find if a given integer x appears more than n/2 times in a sorted array of n integers.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Majorityele{
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ele = -1;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                ele = num;
                count = 1;
            } 
            else if (num == ele ) {
                count++;
            }
            else {
                count--;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == ele ) {
                count++;
            }
        }

        if (count > n / 2) 
            System.out.println("The majority element is : " + ele );
        else 
            System.out.println("No majority element found in the array");
            
    }


}
