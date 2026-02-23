
package core_java.loop_ifelse;

import java.util.Scanner;

public class practicsLevel3Percentage {
  public static void main(String[] args) {
    
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter the marks of 3 subjects physics, chemistry and maths and precentage will be calculated");

      int physics = sc.nextInt();
      int chemistry = sc.nextInt();
      int maths = sc.nextInt();

      double average = (physics + chemistry + maths) / 3.0;

      //compute percentage
      double  percentage = (average /100) * 100;

      // grade

      if(percentage >=80){
          System.out.println("Average marks is "+average+" and grade is A "+" and Remarks Level 4, above agency-normalizes standards ");
      }
      else if(percentage >=79 && percentage <=70){
          System.out.println("Average marks is "+average+" and grade is B "+" and Remarks Level 3, at agency-normalizes standards ");

      }
      else if(percentage >=69 && percentage <=60){
          System.out.println("Average marks is "+average+" and grade is C "+" and Remarks Level 2, below agency-normalizes standards ");
      }
      else if(percentage >=59 && percentage <=50){
          System.out.println("Average marks is "+average+" and grade is D "+" and Remarks Level 1, below agency-normalizes standards ");
      }
      else if(percentage >=49 && percentage <=40){
          System.out.println("Average marks is "+average+" and grade is E "+" and Remarks Level 1, below agency-normalizes standards ");
      }
      else{
          System.out.println("Average marks is "+average+" and grade is R "+" and Remarks Level 0, below agency-normalizes standards ");
      }



  }
}  
  