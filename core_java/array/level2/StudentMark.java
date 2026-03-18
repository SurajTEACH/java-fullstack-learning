package core_java.array.level2;

import java.util.Scanner;

public class StudentMark {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int number = sc.nextInt();

        double marks[] = new double[number];
        double percentage[] = new double[number];
        String grade[] = new String[number];

        for(int i=0;i<number;i++){
            System.out.println("Enter the marks of student " + (i+1) + ": ");
            marks[i] = sc.nextDouble();
        }

        for(int i=0;i<number;i++){
            percentage[i] = (marks[i] / 300) * 100;

            if(percentage[i] >= 90){
                grade[i] = "A";
            }
            else if(percentage[i] >= 80 && percentage[i] < 90){
                grade[i] = "B";
            }
            else if(percentage[i] >= 70 && percentage[i] < 80){
                grade[i] = "C";
            }
            else if(percentage[i] >= 60 && percentage[i] < 70){
                grade[i] = "D";
            }
            else{
                grade[i] = "F";
            }
        }

        for(int i=0;i<number;i++){
            System.out.println("Marks of student " + (i+1) + ": " + marks[i]);
            System.out.println("Percentage of student " + (i+1) + ": " + percentage[i]);
            System.out.println("Grade of student " + (i+1) + ": " + grade[i]);
        }
    }
}


/*8. Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as per the following guidelines
Hint =>
a. Take input for the number of students
b. Create arrays to store marks, percentages, and grades of the students
c. Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
d. Calculate the percentage and grade of the students based on the percentage
e. Display the marks, percentages, and grades of each student */