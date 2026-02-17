package core_java.loop_ifelse;

import java.util.Scanner;

public class Example1CheckStudentGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student's grade ");
        int studentGrade = sc.nextInt();

        if(studentGrade >=50){
            System.out.println("Congratulations!");
            System.out.println("You have passed the exam");
        }
        else{
              System.out.println("Sorry!");
              System.out.println("You have failed the exam");
            }
    }
}
