package assignments.java.Week1.Puzzles;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Puzzling testApp = new Puzzling();

        // System.out.println(testApp.getTenRolls().toString());
        int[] loopThrough = testApp.getTenRolls();
        for (int i = 0; i < loopThrough.length; i++) {
            System.out.println(loopThrough[i]);

        }
    }
}
