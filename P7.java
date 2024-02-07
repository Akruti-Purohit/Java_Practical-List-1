/*Write a Java program that take an integer input (n) and prints out the first n terms of the Fibonacci sequence. */

import java.util.*;

public class P7 {
    public static void main(String[] args) {
        System.out.println("22013018033");
        System.out.println("Purohit Akruti K.");

        int n, a = 0, b = 1, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms of fibonacci sequence tou want to print:");
        n = sc.nextInt();

        System.out.print("The first " + n + " terms of fibonacci sequence is:" + a + " " + b + " ");
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();
    }
}