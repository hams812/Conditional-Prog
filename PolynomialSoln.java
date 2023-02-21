/**
 * Program to evaluate a polynomial for a user entered value.
 *
 */

import java.util.Scanner;

public class PolynomialSoln
{
    public static void main( String[] args ) {
    	//variable declarations
    	double a,b;
    	
    	//enables user input
        Scanner keys = new Scanner(System.in);
        System.out.println("The polynomial is p(x)=2x^2 -7x +3");
        System.out.println("Enter the value of 'a' to calculate p(a)");
        //<your variable> = keys.nextDouble();
        a=keys.nextDouble();
        
        //Polynomial computation
        b=(2*a*a)-(7*a)+3;
        
        //Output the result
        System.out.println("p(a)="+b);
    }
}
