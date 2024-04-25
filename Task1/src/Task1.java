import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		boolean playAgain = true;
		
		while (playAgain) {
			
			int gen; 
			int att =1;
			int won =0;
			
			System.out.println("Welcome to Number Gussing Game");
			System.out.println("*******************************");
			System.out.println("You Only Have 5 Attempt");
			
			while(att <=5) {
				
				System.out.print("Enter the your Guess Number:");	
				int guess = scan.nextInt();
				System.out.println("");
				
				gen = rand.nextInt(100)+1;
				
				if (guess == gen) {
					System.out.println("You won");
					System.out.println("Wins: " + won);
					System.out.println(5-att+" Attempt left");
					won++;
				}
				else {
					System.out.println("Sorry!!! You Lose...");
					System.out.println("Wins: " + won);
					System.out.println(5-att+" Attempt left");
					if (gen < guess) {
						
						System.out.println("Tour Guess is too High");
					}
					else {
						
						System.out.println("Tour Guess is too Low");
					}
				}
				att++;
				
			}
			
			System.out.print("Do you want to play next Round? Y/N : ");
			String res = scan.next();
			
			if (res.equalsIgnoreCase("Y") || res.equalsIgnoreCase("y")) {
				
				playAgain = true;
				System.out.println("");
			}
			else {
				playAgain = false;
				System.out.println("Thank You for Playing...");
				System.exit(0);
			}
			
		}
		scan.close();

	}

}
