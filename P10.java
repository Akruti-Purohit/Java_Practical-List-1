/*Write a Java program that take an integer input (n) and
check given input is Armstrong or not. */

import java.util.*;
public class P10 {
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int n1 = n;
        int rem = 0,ans = 0;
        while(n1!=0)
        {
            rem = n1%10;
            ans = ans + (rem*rem*rem);
            n1 = n1/10;
        }

        if(n == ans)
        {
            System.out.println(n + " is an armstrong number.");
        }
        else{
            System.out.println(n + " is not an armstrong number.");
        }
        sc.close();
    }
}
