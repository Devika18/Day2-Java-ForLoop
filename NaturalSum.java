//Java Program for adding Natural Numbers using For Loop

import java.util.Scanner;

//Declaring a class name as Natural sum

public class NaturalSum {
    public static void main(String[] args) {
        System.out.println("Enter how many natural numbers you want to add: ");

        //Creating an object named as n and taking input from command line
        Scanner n = new Scanner(System.in);
        int sum = 0;

        //Putting command line input into variable Num
        int Num = n.nextInt();
        for(int i=1;i<=Num;i++)
        {
            sum = sum + i;

            //Printing Natural Numbers
            System.out.println("Number are: " + i);
        }

        //Displaying the sum of given natural numbers
        System.out.println("Sum of Natural Number is: " + sum);
    }
}
