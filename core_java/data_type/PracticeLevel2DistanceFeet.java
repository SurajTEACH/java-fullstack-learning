package core_java.data_type;

import java.util.Scanner;

public class PracticeLevel2DistanceFeet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in feet: ");
        double distanceFeet = sc.nextDouble();
        double mile = 1760.0; // 1 mile = 1760 yards
        double yard = 3; // 1 yard = 3 feet

        double distanceYard =    distanceFeet/yard;
        double distanceMile = distanceYard/mile;

        System.out.println(distanceFeet + " feet is equal to " + distanceMile + " miles and " + distanceYard + " yards.");
        
    }
}
