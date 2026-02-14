package core_java.data_type;

public class PracticeLevel1ConvertkiloToMils {
    
     public static void main(String[] args){
        
         double kiloMeter = 10.8;
         double mile = kiloMeter * 1.6;

          System.out.println(kiloMeter + " km is equal to " + mile + " miles.");
     }
}

// question : Convert 10.8 km to miles and display the result

// ans full explanation :

// 10.8 km ko miles me convert karna hai. Kilometer ko miles me convert karne ke liye hum kilometer ke value ko 1.6 se multiply karenge. Iska formula hoga: mile = kiloMeter * 1.6. Isko code mein likhne par hume milega: double mile = kiloMeter * 1.6;

// Ab hum kilometer aur mile ke value ko print karenge. Iske liye hum System.out.println() ka use karenge. Hum message mein kiloMeter aur mile ko include karenge. Isko code mein likhne par hume milega: System.out.println(kiloMeter + " km is equal to " + mile + " miles.");
// Is tarah se hum 10.8 km ko miles me convert kar sakte hain aur uska result print kar sakte hain.

