package org.vashonsd;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SavedPuzzles puzzles = new SavedPuzzles();

        ArrayList<int[]> currentPuzzle = puzzles.getPuzzle();

        Board board = new Board(currentPuzzle);

        for (int i = 0; i < currentPuzzle.get(9).length; i++) {
            board.initCell(currentPuzzle.get(9)[i],currentPuzzle.get(10)[i]);
            // System.out.println(currentPuzzle.get(9)[i] + ", " + currentPuzzle.get(10)[i]);
            // ^ would print out coordinates if uncommented
        }
        
        System.out.println(board);

        String guess;
        int x;
        int y;
        int num;
        boolean stillRunning = true;

        while (stillRunning) {
            System.out.println("Insert the following: x-coordinate, y-coordinate, and number");
            guess = input.nextLine();
            if (guess.equals("exit")) {
                stillRunning = false;
            } else {
                String numbers = guess.replaceAll("[^0-9]", ""); // Thank you stackOverflow
                if (numbers.length() < 3) {
                    System.out.println("You didn't use enough numbers");
                } else {
                    x = Integer.parseInt(numbers.substring(0, 1));
                    y = Integer.parseInt(numbers.substring(1, 2));
                    num = Integer.parseInt(numbers.substring(2));

                    if (!board.checkCell(x, y, num)) {
                        System.out.println(board);
                        System.out.println("That's the wrong number");
                    } else {
                        System.out.println(board);
                        if (board.isFinished()) {
                            System.out.println("Congrats! You Win!");
                            stillRunning = false;
                        }
                    }
                }
            }
        }
    }
}
