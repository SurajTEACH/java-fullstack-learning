package core_java.array.level2;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int arr[] = new int[10];
        int index = 0;

        while (number != 0) {
            arr[index] = number % 10;
            number = number / 10;
            index++;
        }

        for (int i = 0; i < index; i++) {
            int count = 1;
            for (int j = i + 1; j < index; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }
            if (arr[i] != -1) {
                System.out.println(arr[i] + " appears " + count + " times");
            }
        }
    }
}

/*10. Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint =>
a. Take the input for a number
b. Find the count of digits in the number
c. Find the digits in the number and save them in an array
d. Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
e. Display the frequency of each digit in the number
7 */
