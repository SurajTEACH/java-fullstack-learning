package core_java.data_type;

import java.util.Scanner;

public class ExampleSumOfDigit {
     public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        while(temp != 0){
            int digit = temp % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            temp /= 10; // Remove the last digit
        }
        System.out.println("The sum of the digits of " + number + " is: " + sum);
        sc.close();
     }
}
