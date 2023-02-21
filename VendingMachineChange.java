
/**
 * VendingMachineChange will take a user input and display the change for it.
 */
import java.util.Scanner;
public class VendingMachineChange
{
    public static void main(String[]args){
        System.out.println("Enter a whole number from 1 to 99.\n I will find the combination of coins that equals that amount of change.");
        Scanner keys=new Scanner(System.in);
        
        int x= keys.nextInt();
        
        if(x<1||x>99){
            System.out.println("Invalid Input\n");
        }
        else{
        System.out.println(x+" cents in coins:\n");
        
        int quarters=x/25;//tells the number of quarters
        x=x%25;//tells the remainder money or do x=x-quarters*(25)
        System.out.println(quarters+" Quarters\n");
        
        int dimes=x/10;//tells the number of dimes
        x=x%10;//tells the remainder money
        System.out.println(dimes+" Dimes\n");
        
        int nickels=x/5;//tells the number of dimes
        x=x%5;//tells the remainder money
        System.out.println(nickels+" Nickels and \n");
        
        System.out.println(x+" Pennies");
    }
    }
}
