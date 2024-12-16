import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class My_Mastermind {
    public static void main(String[] args) {
        GameConfigure controller = new GameConfigure(args);
        GameLoop loop = new GameLoop(controller.getSettings());
        loop.run();
    }
}
