/*Write a Java program that take an integer input (n) and
find reverse number of given number. */

import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        int a,n;
        int rev = 0,rem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        a=n;

        System.out.println("The value of a before reversing:"+a);
        // int rem;
        while(a!=0)
        {
            rem = a%10;
            rev = (rev*10) + rem;
            a = a/10;
        }
        System.out.println("The value of a after reversing:"+rev);
        sc.close();
    }
}
