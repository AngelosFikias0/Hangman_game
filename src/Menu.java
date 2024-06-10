import java.util.Scanner;

// Class representing the game menu.
public class Menu {

	// Prints menu
    public String MenuPrint() {
        Scanner console = new Scanner(System.in);
        String ans;
        do {
            System.out.print("MAIN MENU\n- Start a new Game (N)\n- Statistics (S)\n- Exit (E)\nPlease enter your choice: ");
            ans = console.next().toUpperCase().trim();
        } while (!isValidChoice(ans));
        return ans;
    }
     // Validates the user's menu choice.
    private boolean isValidChoice(String choice) {
        return choice.equals("N") || choice.equals("S") || choice.equals("E");
    }
}
