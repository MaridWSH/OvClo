import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameFunctions {
    static final String[] COLORS = {"R", "B", "G", "Y", "P", "C", "W", "O"}; 
    static String generatecode() {
    String code = "";
    while (code.length() < 4) {
        int rand = (int)(Math.random() * 8);
        String color = COLORS[rand];
        if (!code.contains(color)) {
            code += color;
        }
    }
    return code;
}
    
    static boolean validateinput(String text) {  
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
}
