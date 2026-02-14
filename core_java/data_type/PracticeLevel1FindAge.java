package core_java.data_type;

public class PracticeLevel1FindAge {
  
    public static void main(String[] args){
        String name = "Suraj kumar shah";
        int  birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("The age of :-\n"+ "name : " + name + "\n birth year : " + birthYear + "\n current year : " + currentYear + "\n age : " + age);
    }
}

// question : Find the age of a person whose name is Suraj kumar shah and birth year is 2000 and current year is 2024. Display the name, birth year, current year and age of the person.

// ans full explanation :

// Suraj kumar shah ki age find karni hai jiska birth year 2000 hai aur current year 2024 hai. Age find karne ke liye hum current year me se birth year ko minus karenge. Iska formula hoga: age = currentYear - birthYear. Isko code mein likhne par hume milega: int age = currentYear - birthYear;
// Ab hum name, birth year, current year aur age ko print karenge. Iske liye hum System.out.println() ka use karenge. Hum message mein name, birthYear, currentYear aur age ko include karenge. Isko code mein likhne par hume milega: System.out.println("The age of :-\n"+ "name : " + name + "\n birth year : " + birthYear + "\n current year : " + currentYear + "\n age : " + age);
// Is tarah se hum Suraj kumar shah ki age find kar sakte hain aur uska name, birth year, current year aur age print kar sakte hain.
