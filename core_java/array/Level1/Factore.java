/*Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
Hint =>
a. Take the input for a number
b. Find the factors of the number and save them in an array. For this create integer variable maxFactor and initialize to 10, factors array of size maxFactor and index variable to reflect the index of the array.
c. To find factors loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing the index. If the index is equal to maxIndex, then need factors array to store more elements
d. To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, and eventually assign the factors array to the temp array
e. Finally, Display the factors of the number */

package core_java.array.Level1;

import java.util.Scanner;

public class Factore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int factors[] = new int[10];
        int maxFactor = 10;
        int index = 0;

        for(int i=1;i<=number;i++){
            if(number % i == 0){
                factors[index] = i;
                index++;
            }
        }

        for(int i=0;i<index;i++){
            System.out.println(factors[i]);
        }
    }
}
