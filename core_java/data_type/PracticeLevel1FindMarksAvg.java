package core_java.data_type;

public class PracticeLevel1FindMarksAvg {

    public static void main(String[] args){

        String name = "Suraj";
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double averageMarks = (maths + physics + chemistry) / 3.0;

        System.out.println("The average marks of :-\n"
                + "name : " + name
                + "\n maths : " + maths
                + "\n physics : " + physics
                + "\n chemistry : " + chemistry
                + "\n average marks : " + averageMarks);

    }  

}  


/*  question : Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ____ out of 100*/

// ans full explanation :

// Sam ke marks Maths me 94, Physics me 95 aur Chemistry me 96 hai. Ab hume average percent mark find karna hai PCM me. Average percent mark find karne ke liye hum Maths, Physics aur Chemistry ke marks ko add karenge aur usko 3 se divide karenge. Iska formula hoga: averageMarks = (maths + physics + chemistry) / 3.0. Isko code mein likhne par hume milega: double averageMarks = (maths + physics + chemistry) / 3.0;
// Ab hum name, Maths, Physics, Chemistry aur average marks ko print karenge. Iske liye hum System.out.println() ka use karenge. Hum message mein name, maths, physics, chemistry aur averageMarks ko include karenge. Isko code mein likhne par hume milega: System.out.println("The average marks of :-\n"+ "name : " + name + "\n maths : " + maths + "\n physics : " + physics + "\n chemistry : " + chemistry + "\n average marks : " + averageMarks);
// Is tarah se hum Sam ke average percent mark find kar sakte hain aur uska name, Maths, Physics, Chemistry aur average marks print kar sakte hain.
