package core_java.loop_ifelse;

import java.util.Scanner;

public class PrcaticsLevel1NaturalNumber {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a natural number: ");
          int n = sc.nextInt();
          
          if(n > 0){
               int sumWhileLoop = 0;
               int i = 1;
               while(i <= n){
                   sumWhileLoop += i;
                   i++;
               }
               int sumFormula = n * (n + 1) / 2;

               if(sumWhileLoop == sumFormula){
                    System.out.println("Both computations are correct. The sum of first " + n + " natural numbers is: " + sumWhileLoop);
                } else {
                    System.out.println("There is a discrepancy in the computations.");
               }
          }


      }
}


/*12. Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct.
Hint =>
a. Take the user input number and check whether it's a Natural number b. If it's a natural number Compute using formulae as well as compute using while loop
c. Compare the two results and print the result 5 */