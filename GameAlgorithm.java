public class GameAlgorithm {
    private String guestCode;
    private String randomCode;
    private int wp;
    private int mp;

    public GameAlgorithm(String randomCode, String guestCode) {
        this.guestCode = guestCode;
        this.randomCode = randomCode;
    }

    public void wellPiecesAlgo() {
        wp = 0;
        for (int i = 0; i < randomCode.length(); i++) {
            if (randomCode.charAt(i) == guestCode.charAt(i)) {
                wp++;
            }
        }
        System.out.printf("Well-placed pieces: %d%n", wp);
    }

    public void misPiecesAlgo() {
        mp = 0;
        for (int i = 0; i < randomCode.length(); i++) {
            if (randomCode.contains("" + guestCode.charAt(i)) && randomCode.charAt(i) != guestCode.charAt(i)) {
                mp++;
            }
        }
        System.out.printf("Misplaced pieces: %d%n", mp);
    }

    public int getWp() {
        return wp;
    }

    public int getMp() {
        return mp;
    }


}


