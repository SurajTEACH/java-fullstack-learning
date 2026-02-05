package core_java.data_type;

import java.util.Scanner;

public class Addition {
  
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

          System.out.println("Enter first number ");
          int a = sc.nextInt();
          System.out.println("Enter second number ");
          int b = sc.nextInt();
          int sum = a + b;
          System.out.println("The sum of " + a + " and " + b + " is " + sum);
          sc.close();
    }

}

/*  program ke bare me explain karo  */

/* yeha Addition ka program h yeha user 2 number leta h or 2 number ko add kar ke ek varible me store kaeta h or use print karta */
