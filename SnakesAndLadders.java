import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;



public class SnakesAndLadders {

	public static void main(String[] args) {
		SnakeLadderConditions snakeLadders = new SnakeLadderConditions();
		snakeLadders.startGame();

	}

}



class SnakeLadderConditions {
	
	final static int WINPOINT = 100;
	
	
	static Map<Integer,Integer> snake = new HashMap<Integer,Integer>();
	static Map<Integer,Integer> ladder = new HashMap<Integer,Integer>(); 
	
	{
		snake.put(99,54);
		snake.put(70,55);
		snake.put(52,42);
		snake.put(25,2);
		snake.put(95,72);
		
		ladder.put(6,25);
		ladder.put(11,40);
		ladder.put(60,85);
		ladder.put(46,90);
		ladder.put(17,69);
	}
	
	
	
	public int rollDice() {
		int dice = 0;
		
		Random random = new Random();
		dice = random.nextInt(7);
		
		return (dice == 0?1:dice);
	}
	
	
	
	public void startGame() {
		
		int userPlayer = 0, computer = 0;
		//int currentPlayer;																	
		Scanner scanner = new Scanner(System.in);
		String roll;
		int diceValue = 0;
		
		
		System.out.println("Hello! Lets play rock, paper, scissors!");
		

		System.out.println("Enter your move:(0 = scissors; 1 = Rock; 2 = Paper):");
		userPlayer = scanner.nextInt();
		computer = scanner.nextInt();
		
		do {																		//**CHECK 'DO' FOR EACH IF/ELSE STATEMENTS**
			
			if (userPlayer < 0 || userPlayer > 2){
				
				System.out.println("Invalid choice");
				System.exit(0);
			}
		

			if(userPlayer == computer){

				if(userPlayer == 0){

					System.out.println("Tie game! You both chose scissors!");
					System.exit(0);
				}

				else if (userPlayer == 1){

					System.out.println("Tie game! You both chose rock!");
					System.exit(0);
				}

				else if (userPlayer == 2){

					System.out.println("Tie game! You both chose paper!");
					System.exit(0);
				}

			}

			if (userPlayer == 0){

				if (computer == 1){

					System.out.println("Player picked scissors! Computer picked rock!");
					System.out.println("Computer Wins!");
					int currentPlayer = 2;						

					System.out.println(currentPlayer==1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
					System.out.println("Press r to roll Dice");
					roll = scanner.next();
					diceValue = rollDice();


					if(currentPlayer == 1) {
						userPlayer = calculatePlayerValue(userPlayer,diceValue);
						System.out.println("First Player Score	: " + userPlayer);
						System.out.println("Second Player Score	: " + computer);
						System.out.println("------------------");

						if(isWin(userPlayer)) {
							System.out.println("FIRST PLAYER WINS!!!");
							return;
						}
					
					}
					else {
						computer = calculatePlayerValue(computer,diceValue);
						System.out.println("First Player Score	: " + userPlayer);
						System.out.println("Second Player Score	: " + computer);
						System.out.println("------------------");
						if(isWin(computer))
						{
							System.out.println("SECOND PLAYER WINS!!!");
							return;
						}
					} currentPlayer = -currentPlayer;					 
				continue;
				}

				else if (computer == 2);{

					System.out.println("Player picked scissors! Computer picked paper!");
					System.out.println("Player Wins!");
					int currentPlayer = 1;

					System.out.println(currentPlayer==1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
					System.out.println("Press r to roll Dice");
					roll = scanner.next();
					diceValue = rollDice();


					if(currentPlayer == 1) {
						userPlayer = calculatePlayerValue(userPlayer,diceValue);
						System.out.println("First Player Score	: " + userPlayer);
						System.out.println("Second Player Score	: " + computer);
						System.out.println("------------------");

						if(isWin(userPlayer)) {
							System.out.println("FIRST PLAYER WINS!!!");
							return;
						}
					
					}
					else {
						computer = calculatePlayerValue(computer,diceValue);
						System.out.println("First Player Score	: " + userPlayer);
						System.out.println("Second Player Score	: " + computer);
						System.out.println("------------------");
						if(isWin(computer))
						{
							System.out.println("SECOND PLAYER WINS!!!");
							return;
						}
					} currentPlayer = -currentPlayer;					 
				continue;
				}



			}

			if (userPlayer == 1){

				if (computer == 0){

					System.out.println("Player picked rock! Computer picked scissors!");
					System.out.println("Player Wins!");
					int currentPlayer = 1;	

					System.out.println(currentPlayer==1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
					System.out.println("Press r to roll Dice");
					roll = scanner.next();
					diceValue = rollDice();


					if(currentPlayer == 1) {
						userPlayer = calculatePlayerValue(userPlayer,diceValue);
						System.out.println("First Player Score	: " + userPlayer);
						System.out.println("Second Player Score	: " + computer);
						System.out.println("------------------");

						if(isWin(userPlayer)) {
							System.out.println("FIRST PLAYER WINS!!!");
							return;
						}
					
					}
					else {
						computer = calculatePlayerValue(computer,diceValue);
						System.out.println("First Player Score	: " + userPlayer);
						System.out.println("Second Player Score	: " + computer);
						System.out.println("------------------");
						if(isWin(computer))
						{
							System.out.println("SECOND PLAYER WINS!!!");
							return;
						}
					} currentPlayer = -currentPlayer;					 
				continue;
				}

				else if (computer == 2);{

					System.out.println("Player picked rock! Computer picked paper!");
					System.out.println("Computer Wins!");
					int currentPlayer = 2;


					System.out.println(currentPlayer==1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
					System.out.println("Press r to roll Dice");
					roll = scanner.next();
					diceValue = rollDice();


					if(currentPlayer == 1) {
						userPlayer = calculatePlayerValue(userPlayer,diceValue);
						System.out.println("First Player Score	: " + userPlayer);
						System.out.println("Second Player Score	: " + computer);
						System.out.println("------------------");

						if(isWin(userPlayer)) {
							System.out.println("FIRST PLAYER WINS!!!");
							return;
						}
					}
					else {
						computer = calculatePlayerValue(computer,diceValue);
						System.out.println("First Player Score	: " + userPlayer);
						System.out.println("Second Player Score	: " + computer);
						System.out.println("------------------");
						if(isWin(computer))
						{
							System.out.println("SECOND PLAYER WINS!!!");
							return;
						}
					} currentPlayer = -currentPlayer;
				continue;
				}


			}

			if (userPlayer == 2){

				if (computer == 0){

					System.out.println("You picked paper! Computer picked scissors!");
					System.out.println("Computer Wins!");
					int currentPlayer = 2;

					System.out.println(currentPlayer==1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
					System.out.println("Press r to roll Dice");
					roll = scanner.next();
					diceValue = rollDice();


					if(currentPlayer == 1) {
						userPlayer = calculatePlayerValue(userPlayer,diceValue);
						System.out.println("First Player Score	: " + userPlayer);
						System.out.println("Second Player Score	: " + computer);
						System.out.println("------------------");

						if(isWin(userPlayer)) {
							System.out.println("FIRST PLAYER WINS!!!");
							return;
						}
					
					}
					else {
						computer = calculatePlayerValue(computer,diceValue);
						System.out.println("First Player Score	: " + userPlayer);
						System.out.println("Second Player Score	: " + computer);
						System.out.println("------------------");
						if(isWin(computer))
						{
							System.out.println("SECOND PLAYER WINS!!!");
							return;
						}
					} currentPlayer = -currentPlayer;									//Allows switching of players

				continue;
				}
			
			}
					 
				
			
			else if (computer == 1);{
					
					System.out.println("You picked paper! Computer picked rock!");
					System.out.println("Player Wins!");
					 int currentPlayer = 1;
				
					 
			System.out.println(currentPlayer==1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
			System.out.println("Press r to roll Dice");
			roll = scanner.next();
			diceValue = rollDice();
			
			
			if(currentPlayer == 1) {
				userPlayer = calculatePlayerValue(userPlayer,diceValue);
				System.out.println("First Player Score	: " + userPlayer);
				System.out.println("Second Player Score	: " + computer);
				System.out.println("------------------");
				
				if(isWin(userPlayer)) {
					System.out.println("FIRST PLAYER WINS!!!");
					return;
				}
			}
			else {
				computer = calculatePlayerValue(computer,diceValue);
				System.out.println("First Player Score	: " + userPlayer);
				System.out.println("Second Player Score	: " + computer);
				System.out.println("------------------");
				if(isWin(computer))
				{
					System.out.println("SECOND PLAYER WINS!!!");
					return;
				}
			} currentPlayer = -currentPlayer;									//Allows switching of players
		continue;	
		}
	
	  }while("r".equals(roll));

   }	
	
	
	
	public int calculatePlayerValue(int player, int diceNum) {
		player = player + diceNum;
		
		if(player > WINPOINT)
		{
			player = player - diceNum;
			return player;
		}
		
		if(null!=snake.get(player))
		{
			System.out.println("Snake ate you! YUM YUM!\n");
			player= snake.get(player);
		}
		
		if(null!=ladder.get(player))
		{
			System.out.println("Up the ladder! The User Rises!\n");
			player= ladder.get(player);
		}
		return player;
	}
	
	public boolean isWin(int player) {
		return WINPOINT == player;
	}
	
}