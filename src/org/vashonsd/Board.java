package org.vashonsd;

/*
 * System.out.println("9 [   | 2 |   ] [   | 5 |   ] [   |   |   ]");
 * System.out.println("8 [ 1 |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("7 [   |   |   ] [   |   |   ] [   | 9 |   ]");
 * System.out.println("  [ - + - + - ] [ - + - + - ] [ - + - + - ]");
 * System.out.println("6 [ 3 |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("5 [   |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("4 [   |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("  [ - + - + - ] [ - + - + - ] [ - + - + - ]"); Example Board
 * System.out.println("3 [   |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("2 [   |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("1 [   |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("    1   2   3     4   5   6     7   8   9");
 */

import java.util.ArrayList;

public class Board {

    ArrayList<Square> squareArrayList = new ArrayList<>();

    public Board() {
        for (int i = 0; i < 9; i++) {
            squareArrayList.add(new Square());
        }
    }

    public String toString() {
        String result = "";
        for (int squareRow = 0; squareRow < 3; squareRow++) {
            for (int row = 0; row < 3; row++) {
                result = result.concat((9 - row - (squareRow * 3)) + " ");
                for (int i = 0; i < 3; i++) { // This may be stupid
                    result = result.concat(squareArrayList.get(i + (3 * squareRow)).getRow(row));
                }
                result = result.concat("\n");
            }
            if (squareRow!= 2) {
                result = result.concat("  [ - + - + - ] [ - + - + - ] [ - + - + - ]\n");
            }
        }
        result = result.concat("    1   2   3     4   5   6     7   8   9");
        return result;
  }
}
