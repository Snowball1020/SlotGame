import java.util.Random;
import java.util.Scanner;

public class SlotGame {

	public static void main(String[] args) {

		//pre condition
		int YourMoney = 50;

		while (YourMoney > 0) {
			int LeftMoney = YourMoney;

			System.out.println("You have: " + YourMoney
					+ " Dollars left. Press Enter Key to start the game. (1000 dollars for play)");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();

			System.out.println("Good luck! Enter to stop the roulette");
			System.out.println("");

			// random generator
			Random rand = new Random();

			// slot col 1
			for (int i = 0; i < 1; i++) {
				int answer = rand.nextInt(3);
				System.out.println("First col is: " + answer);
				
				// slot col 2
				scanner.nextLine();
				for (int i2 = 0; i2 < 1; i2++) {
					int answer2 = rand.nextInt(3);
					System.out.println("Second col is: " + answer2);
					
					// slot col 3
					scanner.nextLine();
					for (int i3 = 0; i3 < 1; i3++) {
						int answer3 = rand.nextInt(3);
						System.out.println("Third col is: " + answer3);
						scanner.nextLine();

						if (answer == answer2 && answer2 == answer3) {
							System.out.println("Congratz!! Got 5000 dollars!!");
							YourMoney = YourMoney + 5000;
						}
						else if (answer == answer2 || answer2 == answer3 || answer == answer3) {
							YourMoney = YourMoney - 1000;
							System.out.println("Almost there!");
						}
						else {
							YourMoney = YourMoney - 1000;
							System.out.println("You lose. ");
							System.out.println();

						}
					}

				}
			}	
		}
		System.out.println("No more money to bet. Game is over");
	}
}

