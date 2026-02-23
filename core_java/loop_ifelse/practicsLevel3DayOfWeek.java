package core_java.loop_ifelse;

import java.util.Scanner;

public class practicsLevel3DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month: ");
        int month = sc.nextInt();

        System.out.println("Enter day: ");
        int day = sc.nextInt();

        System.out.println("Enter year: ");
        int year = sc.nextInt();

        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + 31 * m / 12) % 7;

        System.out.println("Day of the week: " + d);
    }
}


/*Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division): */