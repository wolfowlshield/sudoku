package org.vashonsd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SavedPuzzles puzzles = new SavedPuzzles();

        ArrayList<int[]> currentPuzzle = puzzles.getPuzzle1();

        Board board = new Board(currentPuzzle);

        //board.findCell(1,9);
        for (int i = 0; i < currentPuzzle.get(9).length; i++) { // Don't use a for each, use a normal for loop
            board.initCell(currentPuzzle.get(9)[i],currentPuzzle.get(10)[i]);
            // System.out.println(currentPuzzle.get(9)[i] + ", " + currentPuzzle.get(10)[i]);
        }
        
        System.out.println(board);

        int x;
        int y;
        int guess;
        boolean stillRunning = true;

        while (stillRunning) {
            System.out.println("Gimme three numbers");
            x = input.nextInt();
            y = input.nextInt();
            guess = input.nextInt();
            board.checkCell(x, y, guess);
            System.out.println(board);
            stillRunning = false;
        }

        // Board output is complete
        // Board is fully initialized
        // Now for user interaction
    }
}
