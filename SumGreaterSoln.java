/**
 * Program that takes in two numbers and determines if their sum is greater than 100
 */

import java.util.Scanner;  //enables user input

public class SumGreaterSoln
{
    public static void main( String[] args) {
        //DECLARE your variables
        double x,y;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        
        //PROMPT the user for the FIRST numbrer
        System.out.println("Enter your 1st number");
        
        //ASSIGN the first number to your variable
        x = keys.nextDouble();
        
        //PROMPT the user for the SECOND number
        System.out.println("Enter your 2nd number");
        
        //ASSIGN the second number to a second variable
        y = keys.nextDouble();
        
        //CLOSE the scanner
        keys.close();
        
        //WRITE THE LOGIC to determine if the sum is greater than 100
        if((x+y)>100){
             System.out.println("The sum of "+x+" and "+y+" is greater than 100.");
        }
        else if ((x+y)<100){
            System.out.println("The sum of "+x+" and "+y+" is lesser than 100.");
        }
        else{
            System.out.println("The sum of "+x+" and "+y+" is equal to 100.");
        }
        //OUTPUT the result to the user
        //You will need to use the string concatenator, +, to join text and variables
       
    }
}
