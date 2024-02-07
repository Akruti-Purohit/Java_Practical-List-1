/*Write a Java program that takes a temperature input in
Celsius and converts it to Fahrenheit. */

import java.util.*;
public class P6 {
    public static void main(String[] args) {
        
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");
        float c,f;
        Scanner cel = new Scanner(System.in);
        System.out.print("Enter the tepmerature in celsius:");
        c = cel.nextFloat();
        f = (c * (9/5) + 32);

        System.out.println("The temperature in celsius:"+c);
        System.out.println("The temperture in fahrenheit:"+f);

        cel.close();
    }   
}