/*Write a Java program that take an integer/string input
and check given input is palindrome or not. */

import java.util.*;
public class P9 {
    public static void main(String[] args) {
        System.out.println("22010318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int n1 = n;
        int rem = 0,rev = 0;
        while(n1!=0)
        {
            rem = n1%10;
            rev = (rev * 10) + rem;
            n1 = n1/10;
        }
        if(n == rev)
        {
            System.out.println(n+" is palindrom number.");
        }
        else{
            System.out.println(n+" is not palindrom number.");
        }
        sc.close();
    }
}
