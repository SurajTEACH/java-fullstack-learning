package core_java.data_type;

import java.util.Scanner;

public class ExampleUserDetails {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name, email, phone;
        int age;
        double hight;

        System.out.println("Enter your name");
        name = sc.nextLine();

        System.out.println("Enter your email");
        email = sc.nextLine();

        System.out.println("Enter your phone number");
        phone = sc.nextLine();

        System.out.println("Enter your age");
        age = sc.nextInt();

        System.out.println("Enter your hight");
        hight = sc.nextDouble();

        System.out.println("User contact details : -");

        System.out.println("================================");

        System.out.println("Name :"+name + "\nEmail :"+email + "\nPhone : "+phone + "\nAge :"+age + "\nHight :"+hight);
        sc.close();

    }
}
