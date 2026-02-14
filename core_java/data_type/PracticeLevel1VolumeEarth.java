package core_java.data_type;

public class PracticeLevel1VolumeEarth {
    public static void main(String[] args){

        double radius = 6371;
        double volume = (4.0/3.0) * 3.14 * (radius * radius * radius);
        

        double radiusInMiles = radius *  1.6;
        double volumeInMiles = (4.0/3.0) * 3.14 * (radiusInMiles * radiusInMiles * radiusInMiles);

        System.out.println("The volume of the earth is :-\n"+ "radius in km : " + radius + "\n volume in km : " + volume + "\n radius in miles : " + radiusInMiles + "\n volume in miles : " + volumeInMiles);


    }
}

// question : Calculate the volume of the earth in cubic kilometers and cubic miles. The radius of the earth is 6371 km. Display the radius in kilometers, volume in cubic kilometers, radius in miles and volume in cubic miles of the earth.

// ans full explanation :
/*  Earth ka volume calculate karna hai cubic kilometers aur cubic miles me. Earth ka radius 6371 km hai. Ab hume radius in kilometers, volume in cubic kilometers, radius in miles aur volume in cubic miles display karna hai.
 Volume calculate karne ke liye hum sphere ka volume formula use karenge: volume = (4/3) * π * r³
 Jahan r radius hai. Isko code mein likhne par hume milega: double volume = (4.0/3.0) * 3.14 * (radius * radius * radius);
 Ab hum radius ko miles me convert karenge. Kilometer ko miles me convert karne ke liye hum kilometer ke value ko 1.6 se multiply karenge. Iska formula hoga: radiusInMiles = radius * 1.6. Isko code mein likhne par hume milega: double radiusInMiles = radius * 1.6;
 Ab hum volume ko miles me calculate karenge. Volume calculate karne ke liye hum sphere ka volume formula use karenge: volume = (4/3) * π * r³. Jahan r radius hai. Isko code mein likhne par hume milega: double volumeInMiles = (4.0/3.0) * 3.14 * (radiusInMiles * radiusInMiles * radiusInMiles);
 Ab hum radius in kilometers, volume in cubic kilometers, radius in miles aur volume in cubic miles ko print karenge. Iske liye hum System.out.println() ka use karenge. Hum message mein radius, volume, radiusInMiles aur volumeInMiles ko include karenge. Isko code mein likhne par hume milega: System.out.println("The volume of the earth is :-\n"+ "radius in km : " + radius + "\n volume in km : " + volume + "\n radius in miles : " + radiusInMiles + "\n volume in miles : " + volumeInMiles);
 Is tarah se hum earth ka volume calculate kar sakte hain cubic kilometers aur cubic miles me aur uska radius in kilometers, volume in cubic kilometers, radius in miles aur volume in cubic miles print kar sakte hain.  */



