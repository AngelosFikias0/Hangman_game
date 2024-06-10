// Main class to start the Hangman game.
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Statistics stats = new Statistics();
        RandomGen randint = new RandomGen();
        Dictionary word = new Dictionary();
        Hangman newgame = new Hangman();

        int wins = 0;
        int losses = 0;
        int games = 0;

        while (true) {
            String choice = menu.MenuPrint();

            switch (choice) {
            	// New game
                case "N":
                    games++;
                    String gameWord = word.getWord(randint.randgen());
                    boolean win = newgame.playGame(gameWord);
                    if (win) {
                        wins++;
                    } else {
                        losses++;
                    }
                    break;
            	// View statistics
                case "S":
                    stats.printStatistics(wins, losses, games);
                    break;
                // Exit game
                case "E":
                    System.out.print("Exited the game.");
                    return;
                default:
                    System.out.println("\nInvalid choice. Please enter N, S, or E.\n");
                    break;
            }
        }
    }
}
