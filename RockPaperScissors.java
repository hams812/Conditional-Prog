import java.util.Scanner;

class RockPaperScissors {
  public static void main(String[] args) {
                int wins=0,losses=0,ties=0;
		//Initialize the Scanner and print a welcome message
		Scanner in = new Scanner(System.in);		
		System.out.println("Welcome to Rock, Paper, Scissors!");

		//Use a while(true) loop and only break the loop if the user wants to quit
		while(true) {
		
			//Get the user's move through user input
			System.out.print("What is your move? To make a move, enter r for rock, p for paper, or s for scissors. To quit the game, enter quit. ");
			String myMove = in.nextLine();
			
			//Check if the user wants to quit the game
			if(myMove.equals("quit")) {
				break;
			}

			//Check if the user's move is valid (rock, paper, or scissors)
			if(!myMove.equals("r") && !myMove.equals("p") && !myMove.equals("s")) {

				System.out.println("Your move isn't valid!");
			
			} else {

				//Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2
				int rand = (int)(Math.random()*3);
				
				//Convert the random number to a string using conditionals and print the opponent's move
				String opponentMove = "";
				if(rand == 0) {
					opponentMove = "r";
				} else if(rand == 1) {
					opponentMove = "p";
				} else {
					opponentMove = "s";
				}
				System.out.println("Opponent move: " + opponentMove);
					
				//Print the results of the game: tie, lose, win
				if(myMove.equals(opponentMove)) {
					System.out.println("It's a tie!");
					ties++;
					System.out.println("Your record is now "+wins+" wins,"+losses+" losses,"+" and "+ties+" ties.");
				} else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
					System.out.println("You won!");
					wins++;
					System.out.println("Your record is now "+wins+" wins,"+losses+" losses,"+" and "+ties+" ties.");
				} else {
					System.out.println("You lost!");
					losses++;
					System.out.println("Your record is now "+wins+" wins,"+losses+" losses,"+" and "+ties+" ties.");
				}

			}
                    
		}

		//Print a final message for the user
		System.out.println("Thanks for playing Rock, Paper, Scissors!");

  }
}