import java.util.Scanner;

public class GameLoop {
    private GameSettings settings;
    private Player player;

    public GameLoop(GameSettings settings) {
        this.settings = settings;
        this.player = new Player();
    }

    public void run() {
        int round = 1;
        System.out.println("Will you win? Let's find out! 😊");
        System.out.println("Instructions:");
        System.out.println("- Use only the first letter of each color (case-insensitive, e.g., R, b, etc.).");
        System.out.println("- Your guess must be exactly 4 letters long.");
        System.out.println("- Available colors: Red (R), Blue (B), Green (G), Yellow (Y), Purple (P), Cyan (C), White (W), Orange (O).");
        System.out.println("Are you ready? Enter your guess!");

        Scanner input = new Scanner(System.in);
        while (round <= settings.getRounds()) {
            System.out.printf("Round %d/%d: ", round, settings.getRounds());
            String guess = input.nextLine().toUpperCase();

            if (!player.validateGuess(guess)) {
                System.out.println("Invalid guess! Try again.");
                System.out.println("Last Valid Guess Was : "+player.getLastGuess() + " -Well Placed was : " +player.getWellplaced() + " -Miss Places was :" +player.getMisplaced());
                continue;
            }

            player.setLastGuess(guess);
            if (settings.generatecode().equals(guess)) {
                System.out.println("Congrats! You guessed it!");
                break;
            } else {
                GameAlgorithm algorithm = new GameAlgorithm(settings.generatecode(), guess);
                algorithm.wellPiecesAlgo();
                player.setWellplaced(algorithm.getWp());
                algorithm.misPiecesAlgo();
                player.setMisplaced(algorithm.getMp());
            }

            if (round == settings.getRounds()) {
                System.out.println("Game Over! The secret code was: " + settings.generatecode());
            }
            round++;
        }
    }
}
