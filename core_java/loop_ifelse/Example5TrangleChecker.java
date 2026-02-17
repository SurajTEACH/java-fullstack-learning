package core_java.loop_ifelse;

import java.util.Scanner;

public class Example5TrangleChecker {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter angle 3 angles of a triangle: ");
          int angle1 = sc.nextInt();
          int angle2 = sc.nextInt();
          int angle3 = sc.nextInt();

          int sumOfAngle = angle1 + angle2 + angle3;

          System.out.println("The given angles are: " + angle1 + ", " + angle2 + ", and " + angle3 + " add"+ " up to " + sumOfAngle);

          if(sumOfAngle == 180){
              System.out.println("The given angles form a valid triangle.");
          }
          else{
              System.out.println("The given angles do not form a valid triangle.");
          }
    }
}
