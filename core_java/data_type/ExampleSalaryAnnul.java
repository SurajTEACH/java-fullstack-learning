package core_java.data_type;

import java.util.Scanner;

public class ExampleSalaryAnnul {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your monthly salary");
        int salary = sc.nextInt();

        System.out.println("Enter the annaul salary");
        int annualSalary = sc.nextInt();
        
        int increment  =  salary * 10/100;

        salary =  salary + increment;

        System.out.println("Annual salary :" + annualSalary);

        System.out.println("Increment : "+ increment + " New salary :"+ salary);

        System.out.println("Old salary : "+ (salary - increment) + "\n New salary :"+salary + "\n Increment : "+ increment + "\n Annual salary : "+ annualSalary);
        sc.close();

      
      }
}


/*  program ke bare me explain karo  */

/* yeha ExampleSalaryAnnul ka program h yeha user se monthly salary leta h or annual salary leta h or 10% increment calculate karta h or new salary calculate karta h or print karta h */
