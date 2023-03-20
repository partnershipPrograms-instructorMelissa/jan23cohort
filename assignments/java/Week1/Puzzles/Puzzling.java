package assignments.java.Week1.Puzzles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Puzzling {

    public int[] getTenRolls() {
        Random rand = new Random();
        int[] newList = new int[10];
        for (int i = 0; i < 10; i++) {
            newList[i] = (rand.nextInt(1, 11));
        }
        return newList;
    }

}
