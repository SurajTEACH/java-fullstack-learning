package core_java.loop_ifelse;

import java.util.Scanner;

public class PrcaticsLevel2BonuseEmployee {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the salary: ");
          double salary = sc.nextDouble();
          System.out.println("Enter the years of service: ");
          int yearsOfService = sc.nextInt();

          if(yearsOfService > 5){
                 double bonus = salary  *  0.05;
                  System.out.println("The bonus amount is: " + bonus);
          }
          else{
              System.out.println("No bonus for employees with 5 or less years of service.");
          }
           sc.close();
     }
}


/*Create a program to find the bonuses of employees based on their years of service.
Hint =>
a. Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
b. Take salary and year of service in the year as input.
c. Print the bonus amount. */