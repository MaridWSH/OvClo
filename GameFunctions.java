import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameFunctions {
    static final String[] COLORS = {"R", "B", "G", "Y", "P", "C", "W", "O"}; 

//    static String generatecode() {
//        List<String> chosenColors = new ArrayList<>();
//        Random rand = new Random();
//        while (chosenColors.size() < 4) {
//            String color = COLORS[rand.nextInt(COLORS.length)];
//            if (!chosenColors.contains(color)) {
//                chosenColors.add(color);
//            }
//        }
//        return String.join("", chosenColors); 
//    }
    static String generatecode() {
    String code = "";
    while (code.length() < 4) {
        int rand = (int)(Math.random() * 8); // Random number between 0-7
        String color = COLORS[rand];
        if (!code.contains(color)) {
            code += color;
        }
    }
    return code;
}
    
    static boolean validateinput(String text) { // negative logic 
        if (text.length() != 4) return true;

        for (char c : text.toCharArray()) {
            boolean isValid = false;
            for (String validColor : COLORS) {
                if (String.valueOf(c).equalsIgnoreCase(validColor)) {
                    isValid = true;
                    break;
                }
            }
            if (!isValid) return true;
        }
        return false;
    }
    
//    static boolean isValid(String text) {
//    if (text.length() != 4) return false;
//
//    for (char c : text.toCharArray()) {
//        boolean isValid = false;
//        for (String validColor : COLORS) {
//            if (String.valueOf(c).equalsIgnoreCase(validColor)) {
//                isValid = true;
//                break;
//            }
//        }
//        if (!isValid) return false;
//    }
//    return true;
//}

}
