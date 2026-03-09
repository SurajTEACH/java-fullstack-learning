/*10. Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint =>
a. Create a String Array to save the results and
b. Finally, loop again to show the results of the array based on the index position
6 */

package core_java.array.Level1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number: ");
       int number = sc.nextInt();

       String arr[] = new String[number];

       for(int i=1;i<=number;i++){
           if(i % 3 == 0 && i % 5 == 0){
               arr[i-1] = "FizzBuzz";
           }
           else if(i % 3 == 0){
               arr[i-1] = "Fizz";
           }
           else if(i % 5 == 0){
               arr[i-1] = "Buzz";
           }
           else{
               arr[i-1] = String.valueOf(i);
           }
       }

       for(int i=1;i<=number;i++){
           System.out.println("Position " + i + " = " + arr[i-1]);
       }

       
    }
}
