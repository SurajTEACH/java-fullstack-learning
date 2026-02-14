package core_java.data_type;

public class PracticeLevel1DevidePen {
    public static void main(String[] args){
        int totalPen = 14;
        int numberOfStudents = 3;

        int penPerStudent = totalPen / numberOfStudents;

        int quantityOfPenLeft = totalPen % numberOfStudents;

        System.out.println("The pen per student is " +    penPerStudent +" " +"and the remaining pen not distributed is "+ quantityOfPenLeft);
    }
}


/*  This program calculates the number of pens each student gets and the number of pens left over when dividing 14 pens among 3 students. The division is performed using integer division and modulus operations. The result is printed to the console.  
*/

// full explanation :

/* 
This program calculates the number of pens each student gets and the number of pens left over when dividing 14 pens among 3 students. The division is performed using integer division and modulus operations. The result is printed to the console.  
1. We declare an integer variable `totalPen` and assign it the value 14, which represents the total number of pens available.
2. We declare another integer variable `numberOfStudents` and assign it the value 3
, which represents the number of students among whom the pens will be divided.
3. We calculate the number of pens each student gets by performing integer division of `totalPen
` by `numberOfStudents` and store the result in the variable `penPerStudent`.
4. We calculate the number of pens left over by using the modulus operator to find the remainder when `totalPen` is divided by `numberOfStudents` and store the result in the variable `quantityOfPenLeft`.
5. Finally, we print the results to the console, showing how many pens each student gets and how many pens are left undistributed.

*/