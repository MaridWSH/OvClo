import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class GameConfigure {
    private GameSettings settings;

    public GameConfigure(String[] args) {
        this.settings = new GameSettings();
        parseArguments(args);
    }

    public GameSettings getSettings() {
        return settings;
    }

    private void parseArguments(String[] args) {
        if (args.length > 1) {
            ArrayList<String> optionList = new ArrayList<>(Arrays.asList(args));
            Iterator<String> itr = optionList.listIterator();

            while (itr.hasNext()) {
                String option = itr.next();
                if (option.equals("-t")) {
                    try {
                        settings.setRounds(Integer.parseInt(itr.next()));
                    } catch (Exception e) {
                        System.out.println("Invalid rounds. Defaulting to 10.");
                    }
                }
                if (option.equals("-c")) {
                    settings.setSecretCode(itr.next());
                }
            }
        }
    }
}
