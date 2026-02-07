package core_java.data_type;

import java.util.Scanner;

public class divide {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter first number ");
         int a = sc.nextInt();
         System.out.println("Enter second number ");
         int b = sc.nextInt();
         int div = a / b;
         System.out.println("The division of " + a + " and " + b + " is " + div);
         sc.close();
    }
}
