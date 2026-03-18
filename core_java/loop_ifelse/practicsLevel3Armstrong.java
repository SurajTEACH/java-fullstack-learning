package core_java.loop_ifelse;

import java.util.Scanner;

public class practicsLevel3Armstrong {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter a number");
          int num = sc.nextInt();

          int originalNum = num;
          int sum = 0;

          while(num != 0){
              int rem = num % 10;
              sum += rem*rem*rem;
              num /= 10;
          }

          if(sum == originalNum){
              System.out.println(originalNum + " is an Armstrong number.");
          } else {
              System.out.println(originalNum + " is not an Armstrong number.");
          }
      }
}

