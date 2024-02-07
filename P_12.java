/*Write a Java program that uses a while loop to iterate
over an integer array and computes product of all its
elements. */

import java.util.*;
public class P12 {
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements of array:");
        int arr[],pro = 1;
        arr = new int[n];
        int i = 0;
        while(i<n)
        {
            arr[i] = sc.nextInt();
            pro = pro * arr[i];
            i++;
        }

        System.out.print("The array is:");
        i = 0;
        while(i<n)
        {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
        System.out.println("The product of all elements of array is:"+pro);
        sc.close();
    }
}
