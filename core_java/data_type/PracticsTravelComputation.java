package core_java.data_type;

public class PracticsTravelComputation {

  public static void main(String[] args) {

    String name = "Eric";

    String fromCity = "Chennai", viaCity = "Vellore", toCity = "Bangalore";

    double distanceFromChennaiToVellore = 156.6;

    int timeFromChennaiToVellore = 4 * 60 + 4;

    double distanceFromVelloreToBangalore = 211.8;

    int timeFromVelloreToBangalore = 4 * 60 + 25;

    double totalDistance = distanceFromChennaiToVellore + distanceFromVelloreToBangalore;

    int totalTime = timeFromChennaiToVellore + timeFromVelloreToBangalore;

    System.out.println("The Total Distance travelled by " + name + " from " +
        fromCity + " to " + toCity + " via " + viaCity +
        " is " + totalDistance + " km and " +
        "the Total Time taken is " + totalTime + " minutes");

  }
}

//  question : Eric Travels from Chennai to Bangalore via Vellore. From Chennai to Vellore distance is 156.6 km and the time taken is 4 Hours and 4 Mins and from Vellore to Bangalore is 211.8 km and will take 4 Hours and 25 Mins. Compute the total distance and total time from Chennai to Bangalore

// ans   full exaplaination : 

// Eric Chennai se Bangalore ja raha hai Vellore ke through. Chennai se Vellore ka distance 156.6 km hai aur time 4 ghante aur 4 minute hai. Vellore se Bangalore ka distance 211.8 km hai aur time 4 ghante aur 25 minute hai. Ab hume total distance aur total time calculate karna hai. 
// Sabse pehle hum distance calculate karenge. Total distance nikalne ke liye hum Chennai se Vellore ka distance aur Vellore se Bangalore ka distance ko add karenge. Iska formula hoga: totalDistance = distanceFromChennaiToVellore + distanceFromVelloreToBangalore. Isko code mein likhne par hume milega: double totalDistance = distanceFromChennaiToVellore + distanceFromVelloreToBangalore;
// Ab hum time calculate karenge. Total time nikalne ke liye hum Chennai se Vellore ka time aur Vellore se Bangalore ka time ko add karenge. Iska formula hoga: totalTime = timeFromChennaiToVellore + timeFromVelloreToBangalore. Isko code mein likhne par hume milega: int totalTime = timeFromChennaiToVellore + timeFromVelloreToBangalore;
// Ab hum total distance aur total time ko print karenge. Iske liye hum System.out.println() ka use karenge. Hum message mein name, fromCity, toCity, viaCity, totalDistance aur totalTime ko include karenge. Isko code mein likhne par hume milega: System.out.println("The Total Distance travelled by " + name + " from " +
        fromCity + " to " + toCity + " via " + viaCity +
        " is " + totalDistance + " km and " +
        "the Total Time taken is " + totalTime + " minutes");
// Is tarah se hum total distance aur total time calculate kar sakte hain aur print kar sakte hain.





