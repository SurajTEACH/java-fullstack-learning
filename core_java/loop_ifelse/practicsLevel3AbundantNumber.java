package core_java.loop_ifelse;

import java.util.Scanner;

public class practicsLevel3AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum =0;

        while(num !=0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        if(sum > num){
            System.out.println(num + " is an Abundant number.");
        } else {
            System.out.println(num + " is not an Abundant number.");
        }
    }
}
