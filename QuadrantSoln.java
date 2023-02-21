/**
 * Program that takes in an ordered pair and prints the quadrant in which it lies.
 */

import java.util.Scanner;  //enables user input

public class QuadrantSoln
{
    public static void main( String[] args) {
        //START HERE: Declare your variables
        double x,y;
        
        //enable user input
        Scanner keys = new Scanner(System.in);
        
        //PROMPT the user for X-COORD
        System.out.println("Enter the x co-ordinate of your ordered pair");
        x = keys.nextDouble();
        
        //PROMPT the user for Y-COORD
        System.out.println("Enter the y co-ordinate of your ordered pair");
        y = keys.nextDouble();
        
        //Close the scanner
        keys.close();
        
        //WRITE YOUR LOGIC todetermine the quadrant in which the user's order pair lies
        //You will need if and else if statements...
        if (x>0 && y>0){
            System.out.println("The pair ("+x+", "+y+" ) "+"is in Quadrant 1,");
        }
        else if (x<0 && y>0){
            System.out.println("The pair ("+x+", "+y+" ) "+"is in Quadrant 2.");
        }
        else if (x<0 && y<0){
            System.out.println("The pair ("+x+", "+y+" ) "+"is in Quadrant 3.");
        }
        else if (x>0 && y<0){
            System.out.println("The pair ("+x+", "+y+" ) "+"is in Quadrant 4.");
        }
         else if (x==0 && y!=0){
            System.out.println("The pair ("+x+", "+y+" ) "+"is on the y axis.");
        }
        else if (y==0 && x!=0){
            System.out.println("The pair ("+x+", "+y+" ) "+"is on the x axis.");
        }
        else{
            System.out.println("The pair ("+x+", "+y+" ) "+"is the origin itself.");
        }
        
        //OUTPUT the quadrant to the user: "The pair (#, #) is in quadrant #"
        //Yopu will need to use the string concatenator, +, to join text and variables
        System.out.println("");
    }
}
