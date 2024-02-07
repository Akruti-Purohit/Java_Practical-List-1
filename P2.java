//Write a Java program that declares two double variables (radius, area) and compute the area of a circle.

import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        double r,a;
        final double pi = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        r = sc.nextInt();

        a = pi * r * r;
        
        System.out.println("The area is:"+a);
        sc.close();
    }
}
