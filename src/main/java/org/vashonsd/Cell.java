package main.java.org.vashonsd;

public class Cell {
    int number;
    boolean isShown;

    public Cell(int num, boolean show) {
        number = num;
        isShown = show;
    }

    public boolean isCorrect(int guess) {
        if (number == guess && !isShown) {
            isShown = true;
            return true;
        }
        return false;
    }

    public boolean isShown() {return isShown;}

    public String toString() {
        if (isShown) {
            return String.valueOf(number);
        }
        return " ";
    }
}
