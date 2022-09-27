//Java program for checking Palindrome Number

import java.util.Scanner;

//Declare a class with name Palandrome
public class Palandrome {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");

        //Created an object and took input from command line
        Scanner obj = new Scanner(System.in);
        int originalNum = obj.nextInt();
        int reversedNum=0, rem;

        //Storing original number into new variable i.e num
        int num = originalNum;
        for( ;num != 0; num/= 10)
        {
            /** num = 121
             * rem = 121 % 10 = 1
             * reversedNum = 0 * 10 + 1 = 1
             */
            rem = num % 10;
            reversedNum = (reversedNum * 10) + rem;
        }

        //If original number is equal to reversed number then printing message as number is Palindrome Number
        if (originalNum==reversedNum) {
            System.out.println(originalNum + " is a Palindrome Number");
        }
        // If both numbers are not equal then printing message as number is not a Palindrome number
            else
            System.out.println(originalNum + " is not a Palindrome Number");
    }
}
