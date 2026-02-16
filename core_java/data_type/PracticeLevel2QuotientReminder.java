package core_java.data_type;

import java.util.Scanner;

public class PracticeLevel2QuotientReminder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int quotient = num1/num2;
        int remainder = num1%num2;
        System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
        System.out.println("The remainder of " + num1 + " and " + num2 + " is " + remainder);
        sc.close();
    }
}
