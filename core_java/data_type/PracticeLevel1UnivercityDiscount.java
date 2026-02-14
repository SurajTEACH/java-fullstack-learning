package core_java.data_type;

public class PracticeLevel1UnivercityDiscount {
    public static void main(String[] args){
        
        double fee = 125000;
        int discountPercentage = 10;
        
        double discountAmount = (fee * discountPercentage)/100;

        double discountPrice = fee - discountAmount;

        System.out.println("The fee of the university is "+ fee + " and the discount percentage is "+ discountPercentage + "% and the discount amount is "+ discountAmount + " and the discount price is "+ discountPrice);
    }
}

//question : The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.

// ans full explanation :

/* 

University ek course ke liye student se INR 125000 fee charge kar raha hai. University student ko 10% ka discount offer karna chahta hai. Hume program likhna hai jisse hum discounted amount aur discounted price find kar sake jo student course ke liye pay karega.


Sabse pehle hum fee aur discount percentage ko variables me store karenge. Iske liye hum double data type ka use karenge kyunki fee decimal value ho sakti hai. Discount percentage ke liye hum int data type ka use karenge kyunki wo whole number hoga. Isko code mein likhne par hume milega: double fee = 125000; int discountPercentage = 10;
Ab hum discount amount find karenge. Discount amount find karne ke liye hum fee ko discount percentage se multiply karenge aur usko 100 se divide karenge. Iska formula hoga: discountAmount = (fee * discountPercentage) / 100. Isko code mein likhne par hume milega: double discountAmount = (fee * discountPercentage) / 100;
Ab hum discounted price find karenge. Discounted price find karne ke liye hum fee me se discount amount ko minus karenge. Iska formula hoga: discountPrice = fee - discountAmount. Isko code mein likhne par hume milega: double discountPrice = fee - discountAmount;
Ab hum fee, discount percentage, discount amount aur discounted price ko print karenge. Iske liye hum System.out.println() ka use karenge. Hum message mein fee,
discountPercentage, discountAmount aur discountPrice ko include karenge. Isko code mein likhne par hume milega: System.out.println("The fee of the university is "+ fee + " and the discount percentage is "+ discountPercentage + "% and the discount amount is "+ discountAmount + " and the discount price is "+ discountPrice);
Is tarah se hum University ke fee, discount percentage, discount amount aur discounted price find kar sakte hain aur usko print kar sakte hain.
*/
