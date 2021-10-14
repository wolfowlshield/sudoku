package org.vashonsd;

public class Cell {
    int number;
    boolean isHidden;

    public Cell(int num, boolean hide) {
        number = num;
        isHidden = hide;
    }

    public boolean isCorrect(int guess) {
        return (number == guess);
    }

    public String toString() {
        return number;
    }
}
