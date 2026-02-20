package core_java.loop_ifelse;

import java.util.Scanner;

public class PrcaticsLevel2PowerNumber {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number: ");
          int number = sc.nextInt();
          System.out.println("Enter the power: ");
          int power = sc.nextInt();
          int result = 1;
          if(number > 0 && power > 0){
               for(int i = 1; i <= power; i++){
                    result *= number;
               }
               System.out.println(number + " raised to the power of " + power + " is: " + result);
          } else {
              System.out.println("Please enter positive integers for both number and power.");
          }
     }
}


/*Create a program to find the power of a number.
Hint =>
a. Get integer input for two variables - number and power and check for positive integer
b. Create a result variable with an initial value of 1.
c. Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result 5 */