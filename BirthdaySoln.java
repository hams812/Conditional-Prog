/**
 * Program that takes in the user's birth month and determines the number of days in the month
 *
 */

import java.util.Scanner; //enables user input

public class BirthdaySoln
{
    public static void main( String[] args) {
        
        //get user input
        Scanner keys = new Scanner(System.in);
    double variable, variable2;   //your birth month 
    
        System.out.println("Enter your birth month");  //prompt the user for a birth month
    variable = keys.nextDouble();

        //determine the number of days in the user's birth month
        while(variable >0 && variable <=12){
            if (variable == 1|| variable == 3 || variable == 5|| variable == 7|| variable == 8|| variable == 10|| variable == 12) 
            System.out.println( "Your birth month has 31 days.");
        else if (variable == 4 || variable == 6 || variable == 9 || variable == 11)
        System.out.println( " Your birth month has 30 days.");
            if (variable == 2)
            System.out.println("Your birth month has 28 or 29 days depending on whether the year is a leap year or not.");
            variable = 0; //exit the loop by making the condition false
        System.out.println("Enter your birth month");  //prompt the user for a birth month
            variable = keys.nextDouble();
        }
        
    
        //output the result to the user
    }
}
