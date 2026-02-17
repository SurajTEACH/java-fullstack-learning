package core_java.loop_ifelse;

import java.util.Scanner;

public class Example4DayOfWeek {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int dayNumber = sc.nextInt();
        switch(dayNumber){
            case 1:
                 System.out.println("Monday");
                 break;
            case 2:
                 System.out.println("Tuesday");
                 break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");         
        }
        if(dayNumber >= 1 && dayNumber <= 5){
            System.out.println("It is a weekday.");
        }
        else if(dayNumber == 6 || dayNumber == 7){
            System.out.println("It is a weekend.");
        }
        sc.close();

    }
}


// This program takes in a number and prints the day of the week and also
// prints if it is a weekday or weekend
