package org.vashonsd;

public class Cell {
    int number;
    boolean isShown;

    public Cell(int num, boolean show) {
        number = num;
        isShown = show;
    }

    public void isCorrect(int guess) {
        if (number == guess) {
            isShown = true;
        }
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
