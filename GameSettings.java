public class GameSettings {
    private int rounds;
    private String secretCode;

    public GameSettings() {
        this.rounds = 10; // Default value
        this.secretCode = GameFunctions.generatecode(); // Generate random by default
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = (rounds >= 1 && rounds <= 15) ? rounds : 10; // Validation
    }

    public String generatecode() {
        return secretCode;
    }

    public void setSecretCode(String code) {
        if (GameFunctions.validateinput(code)) {
            this.secretCode = GameFunctions.generatecode();
        } else {
            this.secretCode = code;
        }
    }
}
