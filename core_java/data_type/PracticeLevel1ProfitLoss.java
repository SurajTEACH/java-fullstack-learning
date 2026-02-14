package core_java.data_type;

public class PracticeLevel1ProfitLoss {
    public static void main(String[] args){
        
         int costPrice = 129;
         int sellingPrice = 191;

         int profit = sellingPrice - costPrice;

         int profitPercentage = (profit * 100) / costPrice;

         System.out.println("The profit of :-\n"
                 + "cost price : " + costPrice
                 + "\n selling price : " + sellingPrice
                 + "\n profit : " + profit
                 + "\n profit percentage : " + profitPercentage);
    }
}

// question : A shopkeeper bought a cycle for Rs. 129 and sold it for Rs. 191. Find the profit and profit percentage. Display the cost price, selling price, profit and profit percentage of the cycle.

// ans full explanation :

// Shopkeeper ne cycle ko Rs. 129 me kharida aur Rs. 191 me becha. Ab hume profit aur profit percentage find karna hai. Profit find karne ke liye hum selling price me se cost price ko minus karenge. Iska formula hoga: profit = sellingPrice - costPrice. Isko code mein likhne par hume milega: int profit = sellingPrice - costPrice;
// Ab hum profit percentage find karenge. Profit percentage find karne ke liye hum profit ko 100 se multiply karenge aur usko cost price se divide karenge. Iska formula hoga: profitPercentage = (profit * 100) / costPrice. Isko code mein likhne par hume milega: int profitPercentage = (profit * 100) / costPrice;
// Ab hum cost price, selling price, profit aur profit percentage ko print karenge. Iske liye hum System.out.println() ka use karenge. Hum message mein costPrice, sellingPrice, profit aur profitPercentage ko include karenge. Isko code mein likhne par hume milega: System.out.println("The profit of :-\n"+ "cost price : " + costPrice + "\n selling price : " + sellingPrice + "\n profit : " + profit + "\n profit percentage : " + profitPercentage);
/*  Is tarah se hum shopkeeper ke profit
  aur profit percentage find kar sakte hain aur uska cost price, selling price, profit aur profit percentage print kar sakte hain.  */
