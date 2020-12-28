
/** 
 * Selin Ustaoglu and Damla Savas 
 * @1533754 and 1533746
 * @ Group 44
 * @date    
 */

import java.util.Scanner;
import java.util.Random;

public class Hangman {
	Scanner scanner = new Scanner(System.in);

	void play() {
		int point = 10;

		// Secret words
		String[] bagOfWords = new String[] { "the", "walrus", "and", "carpenter", "were", "walking", "close", "at",
				"hand" };

		// Initialize the random number generator
		System.out.println("Type an arbitrary number");
		int seed = scanner.nextInt();
		Random random = new Random(seed);

		// Select a secret word
		String secret = bagOfWords[random.nextInt(bagOfWords.length)];

		char[] word = new char[secret.length()];
		for (int i = 0; i < word.length; i++) {
			word[i] = '_';
		}
		print(word);

		while (true) {
			char guess = scanner.next().charAt(0);
			boolean found = false;
			for (int i = 0; i < secret.length(); i++) {
				if (secret.charAt(i) == guess) {
					found = true;
					word[i] = guess;
				}
			}
			
			print(word);
			
			if (found == false) {
				point--;

				if (point == 0) {
					System.out.println("Unlucky, you lost!");
					System.out.println("The secret word was " + secret);
					break;
				} 
			} else {
				boolean won = true;
				for (int j = 0; j < word.length; j++) {
					if (word[j] == '_') {
						won = false;
						break;
					}

				}
				if (won) {
					System.out.println("you won");
					break;
				}
			}
		}

	}

	private void print(char[] word) {
		for (char c : word) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		(new Hangman()).play();
	}
}
