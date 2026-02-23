package core_java.loop_ifelse;

import java.util.Scanner;

public class practicsLevel3BIM {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height in cm: ");
        int height = sc.nextInt();
        System.out.println("Enter your weight in kg: ");
        int weight = sc.nextInt();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);

        if(bmi <= 18.4){
            System.out.println("Underweight");
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Normal");
        }
        else if(bmi >= 25 && bmi <= 29.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
