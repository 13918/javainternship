import java.util.Scanner;

public class numbergame {

	public static void guess_num()
	{
		try (Scanner scan = new Scanner(System.in)) 
		{
			int n = 1 + (int)(100* Math.random());
			int limit = 10;
			int i, g;

			System.out.println("A number is chosen" + "between 1 to 100." + "Guess the number" + " within 5 trials.");
			for (i = 0; i < limit; i++) {
				System.out.println("guess the number:");
                g = scan.nextInt();
				if (n == g) {
					System.out.println(
						"Congratulations!" + " You guessed the number.");
					break;
				}
				else if (n > g && i != limit - 1) {
					System.out.println("The number is " + "greater than " + g);
				}
				else if (n < g && i != limit - 1) {
					System.out.println("The number is" + " less than " + g);
				}
				else {
					System.out.println("wrong number");
				}
			}

			if (i == limit) {
				System.out.println("You have exhausted" + " limited trials.");
                System.out.println("The number was " + n);
			}
		}
	}
	public static void main(String arg[])
	{
		guess_num();
	}
}

