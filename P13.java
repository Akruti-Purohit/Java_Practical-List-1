/*Write a Java program that uses a do-while loop to iterate
over an integer array and compute the maximum value. */

import java.util.*;

public class P13 {
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements of array:");
        int arr[],max = 0;
        arr = new int[n];
        int i = 0;
        do
        {
            arr[i] = sc.nextInt();
            i++;
        }while(i<n);
        
        // max = arr[0];
        System.out.print("The array is:");
        i = 0;
        do
        {
            System.out.print(arr[i] + " ");
            if(max<arr[i])
            {
                max = arr[i];
            }
            i++;
        }while(i<n);
        System.out.println();
        System.out.println("The maximum element is:"+max);
        sc.close();
    }
}
