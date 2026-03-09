package core_java.array.Level1;

import java.util.Scanner;

public class multiplicationArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int arr[] = new int[10];

        // store multiplication in array
        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = number * i;
        }

        // print table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + arr[i - 1]);
        }

    }
}