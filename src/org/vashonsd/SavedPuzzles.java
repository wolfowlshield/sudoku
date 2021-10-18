package org.vashonsd;

import java.util.ArrayList;

public class SavedPuzzles {

    ArrayList<int[]> testPuzzle = new ArrayList<>() {{ // Just don't question it, I'm not sure either
        add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});  // It overrides the constructor or initializer or some other madness
        add(new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3});  // But it works so... New format
        add(new int[]{7, 8, 9, 1, 2, 3, 4, 5, 6});
        add(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 1});
        add(new int[]{5, 6, 7, 8, 9, 1, 2, 3, 4});
        add(new int[]{8, 9, 1, 2, 3, 4, 5, 6, 7});
        add(new int[]{3, 4, 5, 6, 7, 8, 9, 1, 2});
        add(new int[]{6, 7, 8, 9, 1, 2, 3, 4, 5});
        add(new int[]{9, 1, 2, 3, 4, 5, 6, 7, 8});
        add(new int[]{1,2,3,4,5,6,7,8,9,2,5,8});
        add(new int[]{1,2,3,4,5,6,7,8,9,5,1,9});
    }};

    ArrayList<int[]> puzzle1 = new ArrayList<>() {{
        add(new int[]{5, 6, 8, 3, 4, 2, 1, 9, 7});
        add(new int[]{2, 4, 7, 1, 9, 5, 8, 6, 3});
        add(new int[]{9, 1, 3, 6, 8, 7, 2, 5, 4});
        add(new int[]{6, 8, 5, 7, 3, 4, 2, 1, 9});
        add(new int[]{3, 1, 2, 9, 5, 8, 6, 7, 4});
        add(new int[]{4, 7, 9, 1, 6, 2, 5, 3, 8});
        add(new int[]{9, 2, 6, 4, 7, 3, 8, 5, 1});
        add(new int[]{7, 8, 1, 5, 2, 6, 4, 3, 9});
        add(new int[]{3, 4, 5, 8, 9, 1, 7, 2, 6});
        add(new int[]{1,2,2,4,5,6,6,7,7,8,9,9,9,1,3,4,5,5,6,6,7,7,8,9,1,1,2,2,3,3,3,4,5,6,7,9,9,9});
        add(new int[]{1,2,3,1,1,2,3,1,2,2,1,2,3,4,6,6,4,6,4,6,4,6,6,6,7,8,7,8,7,8,9,9,8,8,9,7,8,9});
    }};

    public SavedPuzzles() {

    }

    public ArrayList<int[]> getPuzzle() {
        return puzzle1;
    }
}