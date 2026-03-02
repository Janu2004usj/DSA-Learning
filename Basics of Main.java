// for the 1st week i just learned about the programming language and try out it by attend contest of 3 questions in the hackerrank

/* ✅ Problem: Read and Print Different Data Types
  📘 Description

Write a program that reads four inputs from the user:

An integer
A single character
A decimal number
A word (string)

Then, print each input on a new line in the same order.

📥 Input Format

The input contains four values in one line (or multiple lines):
An integer
A character
A decimal number
A word

Separated by spaces.
📤 Output Format

Print each value on a new line in the following order:

Integer
Character
Decimal number
Word

📝 Sample Input
34 S 56.1 PowerRanger

Sample Output
34
S
56.1
PowerRanger
  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read inputs
        int num = sc.nextInt();       // Whole number
        char ch = sc.next().charAt(0); // Letter
        double dec = sc.nextDouble(); // Decimal number
        String word = sc.next();      // Word

        // Print outputs
        System.out.println(num);
        System.out.println(ch);
        System.out.println(dec);
        System.out.println(word);

        sc.close();
    }
}

/*Question 1: Print Numbers from 1 to N

Problem:
Given a number N, print numbers from 2 to N.

Example:
Input: 5
Output: 1 2 3 4 5 */


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 2; i <= N; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}


/*Question 2: Find Sum of Natural Numbers

Problem:
Given N, find the sum of numbers from 1 to N.

Example:
Input: 5
Output: 15*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println(sum);
        sc.close();
    }
}

  
