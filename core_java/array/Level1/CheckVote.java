package core_java.array.Level1;

import java.util.Scanner;

public class CheckVote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the students age");

        int studentAge[] = new int [10];

        for(int i=0;i<10;i++){
            studentAge[i] = sc.nextInt();
        }

        for(int i=0;i<10;i++){
            if(studentAge[i]>=18){
                System.out.println("Eligible to vote");
            }
            else{
                System.out.println("Not eligible to vote");
            }
        }
    }
}
