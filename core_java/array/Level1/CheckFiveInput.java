package core_java.array.Level1;

import java.util.Scanner;

public class CheckFiveInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        int arr[] = new int[number];

        System.out.println("Enter a element");

        for(int i=0;i<number;i++){
          arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
             
            if(arr[i] > 0){
                
                if(arr[i] % 2 == 0){
                    System.out.println(arr[i] + " is even number");
                }
                else{
                    System.out.println(arr[i] + " is odd number");
                }
            }
            else if(arr[i] == 0){
                System.out.println(arr[i] + " is zero");
            }
            else{
                System.out.println(arr[i] + " is negative number");
            }

        }

        if(arr[0] == arr[arr.length-1]){
            System.out.println("First and last element are same");
        }
        else{
            System.out.println("First and last element are not same");
        }
    }
}
