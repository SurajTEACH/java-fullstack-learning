package core_java.data_type;

import java.util.Scanner;

public class PracticeLevel1HeightConvert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height in centimeters:");
        double heightInCm = sc.nextDouble();

        int foot = 12; // 1 foot me 12 inch hote hain
        double inch = 2.54;
        double heightInInch = heightInCm / inch;
        double heightInFoot = heightInInch / foot;
        System.out.println(heightInCm + " cm is equal to " + heightInFoot + " foot and " + heightInInch + " inches.");
        sc.close();

    }
}

/*10. Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

*/

// ans full explanation :

/* 
Height ko centimeters me input lena hai aur usko feet aur inches me convert karna hai. Height ko centimeters me input lene ke liye hum Scanner class ka use karenge. Hum user se height in cm input karne ke liye System.out.println() ka use karenge. Isko code mein likhne par hume milega: System.out.println("Enter the height in centimeters:"); double heightInCm = sc.nextDouble();
Ab hum height ko inches me convert karenge. Inch me convert karne ke liye hum height in cm ko 2.54 se divide karenge. Iska formula hoga: heightInInch = heightInCm / inch. Isko code mein likhne par hume milega: double heightInInch = heightInCm / inch;
Ab hum height ko feet me convert karenge. Feet me convert karne ke liye hum height in inch ko 12 se divide karenge. Iska formula hoga: heightInFoot = heightInInch / foot. Isko code mein likhne par hume milega: double heightInFoot = heightInInch / foot;
Ab hum height in cm, height in foot aur height in inch ko print karenge. Iske liye hum System.out.println() ka use karenge. Hum message mein heightInCm, heightInFoot aur heightInInch ko include karenge. Isko code mein likhne par hume milega: System.out.println(heightInCm + " cm is equal to " + heightInFoot + " foot and " + heightInInch + " inches.");  
*/
