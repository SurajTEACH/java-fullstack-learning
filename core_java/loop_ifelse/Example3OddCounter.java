package core_java.loop_ifelse;

public class Example3OddCounter {
    public static void main(String[] args){
          int counter = 0;

          while(counter <= 10){
              counter++;

              if(counter % 2 == 0) 
              {
                  continue;
              }
              if(counter % 7 == 0){
                  break;
              }
              System.out.println(counter);
          }

    }
}

// Write the program to print the odd counter from 1 to 10 using while loop and
// break if divisible by 7. The output will be 1, 3, and 5
