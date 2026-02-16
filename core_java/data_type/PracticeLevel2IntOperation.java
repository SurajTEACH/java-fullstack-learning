package core_java.data_type;

public class PracticeLevel2IntOperation {
    public  static void main(String[] args){
          int a = 10;
          int b = 5;
          int c = 2;
  
          int result1 = a + b * c; // 10 + 5 * 2 = 10 + 10 = 20
          int result2 = a * b + c; // 10 * 5 + 2 = 50 + 2 = 52
          int result3 = c + a / b; // 2 + 10 / 5 = 2 + 2 = 4
          int result4 = a % b + c; // 10 % 5 + 2 = 0 + 2 = 2
  
          System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}


/*Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators.
Hint =>
a. Create variables a, b, and c of int data type.
b. Take user input for a, b, and c.
c. Compute 3 integer operations and assign the result to a variable
d. Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___ */