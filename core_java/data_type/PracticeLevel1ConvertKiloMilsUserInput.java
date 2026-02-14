package core_java.data_type;

import java.util.Scanner;

public class PracticeLevel1ConvertKiloMilsUserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in kilometers:");
        double kiloMeter = sc.nextDouble();

        double mile = kiloMeter * 1.6;

        System.out.println(kiloMeter + " km is equal to " + mile + " miles.");

        sc.close();
    }
}
