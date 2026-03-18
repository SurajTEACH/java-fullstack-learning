package core_java.array.level2;

import java.util.Scanner;

public class ReverseOrder {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number:");
      int number = sc.nextInt();

      int arr[] = new int[10];
      int index = 0;

      while (number != 0) {
          arr[index] = number % 10;
          number = number / 10;
          index++;
      }

      for (int i = index - 1; i >= 0; i--) {
          System.out.println(arr[i]);
      }

      
  }
}


/*Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint =>
a. Take user input for a number.
b. Find the count of digits in the number.
c. Find the digits in the number and save them in an array
d. Create an array to store the elements of the digits array in reverse order
e. Finally, display the elements of the array in reverse order */