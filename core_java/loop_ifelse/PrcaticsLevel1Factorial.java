package core_java.loop_ifelse;

import java.util.Scanner;

public class PrcaticsLevel1Factorial {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number to find its factorial: ");
          int num = sc.nextInt();

          if(num < 0){
              System.out.println("Factorial is not defined for negative numbers.");
          } else {
              
               long factorial = 1;
               while(num > 0){
                    factorial *= num;
                    num --;
               }
                System.out.println("The factorial is: " + factorial);
            
          }
     }
}
