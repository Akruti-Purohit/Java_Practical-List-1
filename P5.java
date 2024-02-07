/*Write a Java program that takes two integer inputs (a
and b) and performs the following operations addition,
subtraction, multiplication, division and modulo. */

import java.util.Scanner;
public class P5 {
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        a = sc.nextInt();
        System.out.print("Enter the number:");
        b = sc.nextInt();

        System.out.println("The sum of a and b is:"+ (a+b));
        System.out.println("The substraction of a and b is:"+ (a-b));
        System.out.println("The multipication of a and b is:"+ (a*b));
        System.out.println("The division of a and b is:"+ ((double)a/b));
        System.out.println("The modulo of a and b is:"+ (a%b));

        sc.close();
    }
}
