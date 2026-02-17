package core_java.loop_ifelse;

import java.util.Scanner;

public class Example6SumOfDigit {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number: ");

          int number = sc.nextInt();

          int sum = 0;

          int temp = number;

          while(temp !=0){
              int  digit = temp % 10;
              sum += digit;
              temp /= 10;
          }

          System.out.println("The sum of the digits of " + number + " is: " + sum);
          sc.close();
    }
}
