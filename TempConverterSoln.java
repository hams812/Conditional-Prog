
/**
 * Program that convertes temperature from Fahrenheit to Celsius and vice versa
 */

import java.util.Scanner;  //used to get user input

public class TempConverterSoln
{
    public static void main( String[] args) {
        //START HERE: declare your variables
        double fah,celsius;
        
        //enable user input
        Scanner keys = new Scanner(System.in);
        
        //PROMPT the user (you add text between the quotes)
        System.out.println("Enter the temperature in Fahrenheit.");
        
        //GET THE NUMBER from the user (change left side of equals)
        fah = keys.nextDouble();
        
        //CLOSE the keyboard scanner
        keys.close();
        
        //WRITE THE TEMPERATURE CONVERSION FORMULA
        celsius=(5*(fah-32))/9;
        
        //OUTPUT RESULT IN CELSIUS TO USER
        //You will need to use the string joiner, +, to join text with variables
        System.out.println("The temperature in Celsius is "+celsius+"C.");
        
        //input temp as Celsius
        //enable user input
        Scanner keys2 = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius.");
        celsius = keys2.nextDouble();
        fah=((9*celsius)/5)+32;
        System.out.println("The temperature in Fahrenheit is "+fah+"F.");
        //CLOSE the keyboard scanner
        keys.close();
    }
}
