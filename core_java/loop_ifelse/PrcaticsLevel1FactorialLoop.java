package core_java.loop_ifelse;

import java.util.Scanner;

public class PrcaticsLevel1FactorialLoop {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number: ");
          int num = sc.nextInt();

          if(num < 0){
              System.out.println("Factorial is not define nagative numbers.");
          }
          else{
                long factorial = 1;

                for(int i = 1; i <= num; i++){
                    factorial *= i;
                }
                System.out.println("The factorial is: " + factorial);
          }

    }
}
