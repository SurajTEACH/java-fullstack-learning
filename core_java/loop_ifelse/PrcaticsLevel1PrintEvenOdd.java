package core_java.loop_ifelse;

import java.util.Scanner;

public class PrcaticsLevel1PrintEvenOdd {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++){
            if(i % 2 == 0){
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }
         sc.close();
        }
     
}
