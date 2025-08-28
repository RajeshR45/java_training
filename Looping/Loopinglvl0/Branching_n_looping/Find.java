// Find the max,min,sum and average of the given n numbers without using array.

// Note: -1 will be the termination of the input.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Find {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);

        int count = 0, sum = 0;
        int min = 0, max = 0;

        while (true) {
            int number = s.nextInt();

            if (number == -1) {
                break;
            }

            if (count == 0) {
                min = number;
                max = number;
            }

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            float avg = (float) sum / count;
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
            System.out.println("Sum = " + sum);
            System.out.printf("Average = %.6f", avg);
        }
    }
}

