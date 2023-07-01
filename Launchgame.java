import java.util.Scanner;




class Guesser{
	int guessNum;
	
	public int guessNumber()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guesser please enter the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Player1{
	
	int p1guessNum;
	
	public int guessNumber()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Player 1 Kindly Guess the Number");
		p1guessNum=scan.nextInt();
		return p1guessNum;
		
		}
}

class Player2{
	
	int p2guessNum;
	
	public int guessNumber()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Player 2 Kindly Guess the Number");
		p2guessNum=scan.nextInt();
		return p2guessNum;
		
		}
}
	
class Player3{
	
	int p3guessNum;
	
	public int guessNumber()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Player 3 Kindly Guess the Number");
		p3guessNum=scan.nextInt();
		return p3guessNum;
			
		}	
}



class Umpire{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	public void collectNumFromGuesser()
		{
			Guesser g = new Guesser();
			numFromGuesser=g.guessNumber();
			  
		}
	

	public void collectNumFromPlayer()
	{
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		Player3 p3 = new Player3();
		
		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();
		
	}


	void compare() 
	{
		if (numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game Tie! All 3 Players won the Game");
			}
			
			else if (numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 & Player 2 Won the Game");
			}
			else if (numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player 3 Won the Game");
			}
			else
			{
				System.out.println("Player 1 won the Game");
			}
		}
		else if (numFromGuesser==numFromPlayer2)
			{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & 3 Won the Game");
			}
			else
			
			System.out.println("Player 2 Won the Game");
			}
		else if (numFromGuesser==numFromPlayer3)
			{
			System.out.println("Player 3 Won the Game");
			}
		else
			{
			System.out.println("Game Tie !!! Try Again");
		
			
		}
	}
	
}




public class Launchgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		
	}

}
