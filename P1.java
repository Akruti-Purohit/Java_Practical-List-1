//Write a Java program that declares three integer variables (a, b, c) and compute their sum and average.

import java.util.Scanner;

class P1
{
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Puroohit Akruti K.");

        Scanner sc = new Scanner(System.in);

        int a,b,c;
        System.out.println("Enter 3 numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double sum = a+b+c;
        double avg = sum/3;

        System.out.println("The value of a is :"+a);
        System.out.println("The value of b is :"+b);
        System.out.println("The value of c is :"+c);
        System.out.println("The sum is :"+sum);
        System.out.println("The avreage :"+avg);

        sc.close();
    }
}