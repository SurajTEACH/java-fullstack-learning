package core_java.loop_ifelse;

import java.util.Scanner;

public class PrcaticsLevel2AllMultiple {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number: ");
          int number = sc.nextInt();
          if(number > 0 && number < 100){
              System.out.println("The multiples of " + number + " below 100 are: ");
              for(int i = 100; i >= 1; i--){
                  if(i % number == 0){
                      System.out.println(i);
                  }
              }
          } else {
              System.out.println("Please enter a positive integer less than 100.");
          }
           sc.close();
          }
     }



/*Create a program to find all the multiples of a number taken as user input below 100.
Hint =>
a. Get the input value for a variable named number. Check the number is a positive integer and less than 100. b. Run a for loop backward: from i = 100 to i = 1. c. Inside the loop, check if i perfectly divide the number. If true, print the number and continue the loop. */