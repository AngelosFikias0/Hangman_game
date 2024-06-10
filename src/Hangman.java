import java.util.Scanner;

// Class representing the Hangman game.
public class Hangman {
    private Scanner console = new Scanner(System.in);

    // Plays a game of hangman
    public boolean playGame(String word) {
        boolean win = false; // To track if the player has won
        int tries = 0; // Number of incorrect attempts
        int tries_left = word.length() - (word.length() / 4); // Allowed attempts based on word length
        String guessedLetters = ""; // Store guessed letters
        StringBuilder cryptotemp = new StringBuilder("-".repeat(word.length())); // Masked version of the word

        while (tries < tries_left && !win) { // Loop until max attempts or win
            printGameState(cryptotemp, tries_left - tries); // Print current state of the game
            String answer = getUserInput(); // Get user's guess

            if (answer.length() > 1) { // Check if the guess is a full word
                win = handleFullWordGuess(word, answer); // Handle full word guess
                if (!win) tries++; // Increment tries if guess is wrong
            } else {
                char ans = answer.charAt(0); // Single character guess
                if (guessedLetters.contains(answer)) { // Check if letter already guessed
                    System.out.println("You already guessed that letter.");
                } else {
                    guessedLetters += ans; // Add to guessed letters
                    if (word.contains(answer)) { // Check if letter is in the word
                        updateCryptotemp(word, cryptotemp, ans); // Update masked word
                        win = checkWin(cryptotemp, word); // Check if player has won
                    } else {
                        System.out.println("There are no " + answer + "’s in the word."); // Incorrect guess
                        tries++; // Increment tries
                    }
                }
            }
        }

        if (!win) { // If the player didn't win
            System.out.println("You lost! The word is: " + word);
        }

        printEndGameStats(win); // Print end game stats
        return win; // Return game result
    }

    // Print the current state of the game
    private void printGameState(StringBuilder cryptotemp, int guessesLeft) {
        System.out.println("The random word is now: " + cryptotemp + "\nYou have " + guessesLeft + " guesses left.\nYour guess: ");
    }

    // Get user's input
    private String getUserInput() {
        return console.next().toUpperCase().trim();
    }

    // Handle a full word guess
    private boolean handleFullWordGuess(String word, String guess) {
        if (guess.equals(word)) { // Check if the guess is correct
            System.out.println("The guess is CORRECT!\nCongratulations! You guessed the word: " + word);
            return true; // Return true if correct
        } else {
            System.out.println("The word " + guess + " is not the answer."); // Incorrect full word guess
            return false; // Return false if incorrect
        }
    }

    // Update the masked word with the correct letter
    private void updateCryptotemp(String word, StringBuilder cryptotemp, char ans) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ans) { // Check each letter
                cryptotemp.setCharAt(i, ans); // Update masked word
            }
        }
    }

    // Check if the player has guessed the word
    private boolean checkWin(StringBuilder cryptotemp, String word) {
        if (cryptotemp.toString().equals(word)) { // Compare masked word with actual word
            System.out.println("Congratulations! You guessed the word: " + word);
            return true; // Return true if guessed correctly
        }
        return false; // Return false if not guessed yet
    }

    // Print end game statistics
    private void printEndGameStats(boolean win) {
        System.out.println(win ? "You won!" : "Better luck next time!"); // Print win or lose message
    }
}
