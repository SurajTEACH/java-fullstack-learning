package core_java.array;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
       Scanner  sc = new Scanner(System.in);

       System.out.println("Enter a number");
       int number = sc.nextInt();

       if(number < 0){
          System.out.println("Enter a invaild number");
          System.exit(0);
       }
       else{
          int sumArr[] = new int[number];

          System.out.println("Enter the elemets");

          for(int i=0;i<number;i++){
             sumArr[i] = sc.nextInt();
          }

          int sum = 0;
          for(int i=0;i<number;i++){
              sum +=sumArr[i];
          }

          System.out.println("The sum of the digits is " + sum);
       }
    }
}
