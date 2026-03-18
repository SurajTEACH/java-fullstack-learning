package core_java.array.level2;

import java.util.Scanner;

public class BodyMessga {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of persons: ");
        int number = sc.nextInt();

        double weight[] = new double[number];
        double height[] = new double[number];
        double bmi[] = new double[number];
        String status[] = new String[number];

        for(int i=0;i<number;i++){
            System.out.println("Enter the weight of person " + (i+1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.println("Enter the height of person " + (i+1) + ": ");
            height[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if(bmi[i] <= 18.4){
                status[i] = "Underweight";
            }
            else if(bmi[i] >= 18.5 && bmi[i] <= 24.9){
                status[i] = "Normal";
            }
            else if(bmi[i] >= 25 && bmi[i] <= 29.9){
                status[i] = "Overweight";
            }
            else{
                status[i] = "Obese";
            }
        }

        for(int i=0;i<number;i++){
            System.out.println("Height of person " + (i+1) + ": " + height[i]);
            System.out.println("Weight of person " + (i+1) + ": " + weight[i]);
            System.out.println("BMI of person " + (i+1) + ": " + bmi[i]);
            System.out.println("Weight status of person " + (i+1) + ": " + status[i]);
        }
    }
}


/*6. An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint =>
a. Take input for a number of persons
b. Create arrays to store the weight, height, BMI, and weight status of the persons
c. Take input for the weight and height of the persons
d. Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
e. Display the height, weight, BMI, and weight status of each person
f. Use the table to determine the weight status of the person
5 */