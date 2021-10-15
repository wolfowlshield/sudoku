package org.vashonsd;

public class Main {


    public static void main(String[] args) {

        SavedPuzzles puzzles = new SavedPuzzles();
        Board board = new Board(puzzles.getPuzzle1());
        System.out.println(board);
        // Board output is complete
        // Board is half initialized, still need to only show some numbers
        // Then we need to add user interaction
    }
}
