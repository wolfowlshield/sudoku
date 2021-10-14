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

public class Board {

    Square square1 = new Square();
    Square square2 = new Square();
    Square square3 = new Square();
    Square square4 = new Square();
    Square square5 = new Square();
    // Square[] squares = {square1, square2, square3, square4, square5};

    public Board() {

    }

    public String toString() {
        return square1.toString() + square2 + square3 + "\n" +
                "  [ - + - + - ] [ - + - + - ] [ - + - + - ]\n" +
                square4 + square5;
    }
}
