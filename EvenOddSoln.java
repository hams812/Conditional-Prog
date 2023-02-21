/**
 * Program that takes in a number and determines if it is even or odd
 */

import java.util.Scanner;  //enables user input

public class EvenOddSoln
{
    public static void main( String[] args) {
        //DECLARE your variables
        int x;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        
        //PROMPT the user for an INTEGER
        System.out.println("Enter an integer.");  //prompt the user for a number
        
        //ASSIGN the keyboard input to your variable
        x = keys.nextInt();
        
        keys.close();  //close the keyboard scanner
        
        //WRITE THE LOGIC to determine if the number is even or odd
        if(x%2==0 && x>0){
            System.out.println(x+" is an even positive integer.");
        }
        else if(x%2==0 && x<0){
            System.out.println(x+" is an even negative integer.");
        }
        else if(x%2!=0 && x>0){
            System.out.println(x+" is an odd positive integer.");
        }
        else{
            System.out.println(x+" is an odd negative integer.");
        }
        
    }
}
