package core_java.array.level2;

import java.util.Scanner;

public class Youngestfriends {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age[] = new int[3];
        double hight[] = new double[3];

        for(int i=0;i<3;i++){

           System.out.println("Enter "+(i+1)+"st friend details:");
            System.out.println("Enter the age:");
            age[i] = sc.nextInt();

            System.out.println("Enter the hight:");
            hight[i] = sc.nextDouble();

        }

        //find the youngest of the 3 friends

        int youngest = age[0];

        for(int i=0;i<3;i++){
            if(age[i]> youngest){
                youngest = age[i];
            }
        }

        double tollest = hight[0];

        for(int i=0;i<3;i++){
            if(hight[i]> tollest){
                tollest = hight[i];
            }
        }

        System.out.println("Result");

        System.out.println("The youngest of the 3 friends is "+youngest);
        System.out.println("The tallest of the 3 friends is "+tollest);



    }
}


/*2. Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint =>
a. Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
b. Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
c. Finally display the youngest and tallest of the 3 friends */