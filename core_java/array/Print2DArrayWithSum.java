package core_java.array;

import java.util.Scanner;

public class Print2DArrayWithSum {

  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a column size");

        int col = sc.nextInt();

        System.out.println("Enter a row size");

        int row = sc.nextInt();

        int arr[][] =  new int[col][row];

        System.out.println("Enter the elements");

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Elements of the 2D Array are: ");
        int sum = 0;
        for(int i=0;i<col;i++){
           for(int j=0;j<row;j++){
              System.out.println(arr[i][j] + " ");
              sum += arr[i][j];
           }
           System.out.println();
        }

        System.out.println("The sum of the element of the 2D Array is :"+sum);

        sc.close();
    }


}
