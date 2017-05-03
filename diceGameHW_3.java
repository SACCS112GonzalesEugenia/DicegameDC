// week 9 - hw 3
// design and implement a dice game
// user to decide number of dices to roll
// one dice:  1- 6
// two dices: 2-12
// three dices: 3-18
// system rolls dice(s)
// user guess points
// requirements
// dice class
// member variable
// constructor
// method
// main program

import java.util.Scanner;

public class diceGameHW_3 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int guess = 0;
		int numDice = 0;
		int roll1 = 0;
		int roll2 = 0;
		int roll3 = 0;
		int diceRoll = 0;
		int again = 0;
		
		Dice s1 = new Dice(roll1, roll2, roll3);
		
		do{
			System.out.println("How many dice do you wish to roll? Choose 1-3");
			numDice = input.nextInt();
		
			if (numDice == 1)
			{
				System.out.println("You chose to roll (1) die. How many points will the die roll? Choose 1-6");
				guess = input.nextInt();
				diceRoll = s1.getDiceRoll1(roll1);
			}
			if (numDice == 2)
			{
				System.out.println("You chose to roll (2) dice. How many points will the dice roll? Choose 2-12");
				guess = input.nextInt();
				diceRoll = s1.getDiceRoll1(roll2);
			}
			if (numDice == 3)
			{
				System.out.println("You chose to roll (3) dice. How many points will the dice roll? Choose 3-18");
				guess = input.nextInt();
				diceRoll = s1.getDiceRoll1(roll3);
			}
		
			if (guess == diceRoll)
			{
				System.out.printf("You guessed %d and the dice roll was %d. You win!",guess, diceRoll);
			}
			if (guess > diceRoll)
			{
				System.out.printf("You guessed %d and the dice roll was %d. Sorry, you lose.",guess,diceRoll);
			}
			if (guess < diceRoll)
			{
				System.out.printf("You guessed %d and the dice roll was %d. Sorry, you lose. ",guess,diceRoll);
			}
			
			System.out.println("\nDo you want to play again? Yes = 1, No = 0 ");
			again = input.nextInt();
			
			if (again == 0)
			{
				System.out.println("Thanks for playing!");
			}
		}while(again == 1);
	}

}