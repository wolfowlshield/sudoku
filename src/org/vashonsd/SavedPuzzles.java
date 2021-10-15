package org.vashonsd;

import java.util.ArrayList;

public class SavedPuzzles {

    ArrayList<int[]> puzzle1 = new ArrayList<>();
    int[] square1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] square2 = {4, 5, 6, 7, 8, 9, 1, 2, 3};
    int[] square3 = {7, 8, 9, 1, 2, 3, 4, 5, 6};
    int[] square4 = {2, 3, 4, 5, 6, 7, 8, 9, 1};
    int[] square5 = {5, 6, 7, 8, 9, 1, 2, 3, 4};
    int[] square6 = {8, 9, 1, 2, 3, 4, 5, 6, 7};
    int[] square7 = {3, 4, 5, 6, 7, 8, 9, 1, 2};
    int[] square8 = {6, 7, 8, 9, 1, 2, 3, 4, 5};
    int[] square9 = {9, 1, 2, 3, 4, 5, 6, 7, 8};

    public SavedPuzzles() {
        puzzle1.add(square1);
        puzzle1.add(square2);
        puzzle1.add(square3);
        puzzle1.add(square4);
        puzzle1.add(square5);
        puzzle1.add(square6);
        puzzle1.add(square7);
        puzzle1.add(square8);
        puzzle1.add(square9);
    }

    public ArrayList<int[]> getPuzzle1() {
        return puzzle1;
    }
}