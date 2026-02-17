package core_java.loop_ifelse;

import java.util.Scanner;

public class Example2Counter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int counter = 0;

        while(counter <= number){
            System.out.println(counter);
            counter++;
        }

        sc.close();
    }
}
