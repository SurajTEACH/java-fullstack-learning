package core_java.data_type;

import java.util.Scanner;

public class ExampleDisplayResult {
    public static  void main(String[] args){
         Scanner sc = new Scanner(System.in);

          System.out.println("Enter your name");
          String name = sc.nextLine();

          System.out.println("Enter your Roll number");
          String rollNumber = sc.nextLine();

          System.out.println("Enter your marks");
          int marks = sc.nextInt();
          System.out.println("Name : "+ name + "\nRoll number : "+ rollNumber + "\nMarks : "+ marks);
          sc.close();
         
    }
}
