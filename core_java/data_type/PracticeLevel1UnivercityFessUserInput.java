package core_java.data_type;

public class PracticeLevel1UnivercityFessUserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();

        System.out.println("Enter the university fees:");
        double universityFees = sc.nextDouble();

        System.out.println("Enter the parcentage of discount:");
        double discountPercentage = sc.nextDouble();

        double discountAmount = (discountPercentage / 100) * universityFees;
        double discountedPrice = universityFees - discountAmount;

        System.out.println("The name of the student is " + name + " and the university fees is " + universityFees + " and the discount percentage is " + discountPercentage + "% and the discount amount is " + discountAmount + " and the discounted price is " + discountedPrice);
        
    }
}
