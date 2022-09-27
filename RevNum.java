//Java program for reversing number using For Loop

import java.util.Scanner;

//Declaring class name as RevNum
public class RevNum {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner num = new Scanner(System.in);
        int rem;
        int rev=0;
        int N = num.nextInt();
        for(int i=1;i<N;i++)
        {
            rem = N % 10;
            rev = rev * 10 + rem;
            N = N / 10;
        }
            System.out.println("Reverse Number is: " + rev);
    }
}
