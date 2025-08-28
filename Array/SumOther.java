// Write a program to accept the element into an array and replace every element in the array with the sum of its every other element

// Input Format

// Number of elements followed by array as input elements

// Constraints

// NIL

// Output Format

// Print the Array elements after modification

// Sample Input 0

// 10
// 10 20 30 40 50 60 70 80 90 100
// Sample Output 0

// 540 530 520 510 500 490 480 470 460 450

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumOther {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        int sum=0;
        for(int i =0; i<size; i++){
            arr[i]= s.nextInt();
            sum +=arr[i];
        }
        
        for(int i=0;i<size;i++){
            System.out.print(sum-arr[i] + " ");
        }
   
    }
}