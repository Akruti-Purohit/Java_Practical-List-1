/*Write a Java program to print following patterns: */
import java.util.*;
public class P15_1 {
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        // char c = '*';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
