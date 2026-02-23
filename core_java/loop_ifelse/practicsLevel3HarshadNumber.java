package core_java.loop_ifelse;

import java.util.Scanner;

public class practicsLevel3HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while(num != 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        if(num % sum == 0){
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }
    }
}
