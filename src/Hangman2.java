
/** 
 * Selin Ustaoglu and Damla Savas 
 * @1533754 and 1533746
 * @ Group 44
 * @date    
 */

import java.util.Scanner;
import java.util.Random;

public class Hangman2 {
    Scanner scanner = new Scanner(System.in);

    void play() {
        int point = 10;
        String guess;
        int index;
        int index2;

        // Secret words
        String[] bagOfWords = new String[] { "the", "walrus", "and", "carpenter", "were", "walking", "close", "at",
                "hand" };

        // Initialize the random number generator
        System.out.println("Type an arbitrary number: ");
        int seed = scanner.nextInt();
        Random random = new Random(seed);

        // Select a secret word
        String secret = bagOfWords[random.nextInt(bagOfWords.length)];

        String[] word = new String[secret.length()];
        for (int i = 0; i < word.length; i++) {
            word[i] = "_";
            System.out.print(word[i] + " ");

        }
        System.out.println();

        while (true) {
            guess = scanner.next();
            index = secret.indexOf(guess);
            if (index == -1) {
                point--;

                for (int i = 0; i < word.length; i++) {
                    System.out.print(word[i] + " ");

                }
                System.out.print(" \n");
            } else {
                word[index] = guess;
                String otherHalf = secret.substring(index + 1);
                index2 = otherHalf.indexOf(guess);

                if (index2 > -1) {
                    index += index2 + 1;
                    word[index] = guess;
                }

                for (int i = 0; i < word.length; i++) {
                    System.out.print(word[i] + " ");
                }
                System.out.print(" \n");
            }

            // check player won or not 
            boolean won = true;

            for (int j=0 ; j<word.length; j++) {
                if (word[j].equals("_")) {
                    won = false;
                   break;
                }
                
            }
            if(won){
                System.out.println("you won");
                break;
            }

            if (point == 0) {
                System.out.println("Unlucky, you lost!");
                System.out.println("The secret word was " + secret);
                break; 
            }
        }
    }

    public static void main(String[] args) {
        (new Hangman()).play();
    }
}
