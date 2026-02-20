package core_java.loop_ifelse;

import java.util.Scanner;

public class PrcaticsLevel2TallestFriend {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.println("Enter the height of Amar:");
        double heightAmar = sc.nextDouble();
        System.out.println("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter the height of Akbar:");
        double heightAkbar = sc.nextDouble();
        System.out.println("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.println("Enter the height of Anthony:");
        double heightAnthony = sc.nextDouble();

        if(ageAmar < ageAkbar && ageAmar < ageAnthony){
            System.out.println("Amar is the Youngest friend");
        } else if(ageAkbar < ageAmar && ageAkbar < ageAnthony){
            System.out.println("Akbar is the Youngest friend");
        } else {
            System.out.println("Anthony is the Youngest friend");
        }

        if(heightAmar > heightAkbar && heightAmar > heightAnthony){
            System.out.println("Amar is the tallest friend");
        } else if(heightAkbar > heightAmar && heightAkbar > heightAnthony){
            System.out.println("Akbar is the tallest friend");
        } else {
            System.out.println("Anthony is the tallest friend");
        }
         sc.close();
    }
}


/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint =>
a. Take user input for the age and height of the 3 friends and store it in a variable
b. Find the smallest of the 3 ages to find the youngest friend and display it
c. Find the largest of the 3 heights to find the tallest friend and display it */