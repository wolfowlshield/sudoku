package org.vashonsd;

/*
 * [   |   |   ]
 * [   |   |   ]
 * [   |   |   ]
 */
public class Square {

    Cell cell1;

    public Square () {
        cell1 = new Cell(5, false);
    }

    @Override
    public String toString() {
        return "[ " + cell1 + " | ";
    }
}
