public class Player {
    private String lastGuess;
    private int wp;
    private int mp;

    public int getWellplaced() {
        return wp;
    }

    public void setWellplaced(int wp) {
        this.wp = wp;
    }

    public int getMisplaced() {
        return mp;
    }

    public void setMisplaced(int mp) {
        this.mp = mp;
    }

    public String getLastGuess() {
        return lastGuess;
    }

    public void setLastGuess(String guess) {
        this.lastGuess = guess;
    }

    public boolean validateGuess(String guess) {
        return !GameFunctions.validateinput(guess);
    }
}
