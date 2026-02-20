package core_java.loop_ifelse;

import java.util.Scanner;

public class PrcaticsLevel1RoketLunch {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         int counter;
          System.out.println("Enter the number of seconds for the rocket launch countdown: ");
          counter = sc.nextInt();

          for(int i=counter;i>=1;i--){
              System.out.println(i);
          }

          System.out.println("Rocket Launched!");
          sc.close();
     }
}
