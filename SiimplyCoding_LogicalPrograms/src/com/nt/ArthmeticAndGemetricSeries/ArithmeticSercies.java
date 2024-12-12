package com.nt.ArthmeticAndGemetricSeries;

import java.util.Scanner;

/*Enter the minimum number: 9
Enter the maximum number: 30
Series: 9+13+17+21+25+29 =114
import java.util.Scanner;
*/

public class ArithmeticSercies {

    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the minimum number: ");
        int min = sc.nextInt();
        System.out.print("Enter the maximum number: ");
        int max = sc.nextInt();

        String s = "";

        for (int i = min; i <= max; i += 4) {
            sum += i;
            if (i + 4 > max) {
                s += i; 
            } else {
                s += i + "+";
            }
        }

        // Print the result
        System.out.println("Series: " + s+ " "+"="+sum);

        
    }
}
