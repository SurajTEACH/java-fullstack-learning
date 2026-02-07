package core_java.data_type;

import java.util.Scanner;

public class multiply {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        int mul = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is " + mul);
        sc.close();
   }
}
