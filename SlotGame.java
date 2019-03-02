import java.util.Random;
import java.util.Scanner;

public class SlotGame {

	public static void main(String[] args) {

		//pre condition
		int YourMoney = 500;

		while (YourMoney > 0) {
			int LeftMoney = YourMoney;

			System.out.println("you have: " + YourMoney
					+ " dollars left. Press Enter Key to start the game. (100 dollars for play)");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();

			System.out.println("Good luck! Enter to stop the roulette");
			System.out.println("");

			// random generator
			Random rand = new Random();

			// slot col 1
			for (int i = 0; i < 1; i++) {
				int answer = rand.nextInt(3);
				System.out.println("first col is: " + answer);
				
				// slot col 2
				scanner.nextLine();
				for (int i2 = 0; i2 < 1; i2++) {
					int answer2 = rand.nextInt(3);
					System.out.println("second col is: " + answer2);
					
					// slot col 3
					scanner.nextLine();
					for (int i3 = 0; i3 < 1; i3++) {
						int answer3 = rand.nextInt(3);
						System.out.println("third col is: " + answer3);
						scanner.nextLine();

						if (answer == answer2 && answer2 == answer3) {
							System.out.println("Congratz!! Got 500 dollars!!");
							YourMoney = YourMoney + 500;
						}
						else if (answer == answer2 || answer2 == answer3 || answer == answer3) {
							YourMoney = YourMoney - 100;
							System.out.println("almost there!");
						}
						else {
							YourMoney = YourMoney - 100;
							System.out.println("You lose. ");
							System.out.println();

						}
					}

				}
			}	
		}
		System.out.println("No more money to bet, you are Done");
	}
}

