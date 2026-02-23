package core_java.loop_ifelse;

import java.util.Scanner;

public class PrcaticsLevel2FactorNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factors of " + num + " are: ");

        for(int i = 1; i < num; i++){
             if( num % i == 0){
                 System.out.println(i);
             }
        }
    }
}

/*Create a program to find the factors of a number taken as user input.
Hint =>
a. Get the input value for a variable named number and check if it is a positive integer. b. Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i. 4 */
