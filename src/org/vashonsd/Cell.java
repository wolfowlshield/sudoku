package org.vashonsd;

public class Cell {
    int number;
    boolean isShown;

    public Cell(int num, boolean show) {
        number = num;
        isShown = show;
    }

    public boolean isCorrect(int guess) { // Probably should be a void that sets isHidden to false if correct
        return (number == guess);
    }

    public void show() {
        isShown = true;
    }

    public String toString() {
        if (isShown) {
            return String.valueOf(number);
        }
        return " ";
    }
}
