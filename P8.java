/*Write a Java program that take an integer input (n) and
check given number is prime or not. */

import java.util.*;

public class P8 {
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) 
        {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
          System.out.println(n + " is a prime number.");
        else
          System.out.println(n + " is not a prime number.");
          
        sc.close();
    }
}

