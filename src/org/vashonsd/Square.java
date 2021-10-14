package org.vashonsd;

import java.util.ArrayList;

/*
 * [   |   |   ]
 * [   |   |   ]
 * [   |   |   ]
 */
public class Square {

    ArrayList<Cell> cellArrayList = new ArrayList<>();

    public Square () {
        for (int i = 0; i < 9; i++) {
            cellArrayList.add(new Cell(4, true));
        }
    }

    public String getRow(int row) {
        String result = "[ ";
        for (int i = 0; i < 3; i++) { // I HAVE HARNESSED THE POWER OF FOUR FOR LOOPS, 3^4 = 81 Cells
            result = result.concat(cellArrayList.get(i + (3 * row)).toString());
            if (i != 2) {
                result = result.concat(" | ");
            } else {
                result = result.concat(" ] ");
            }
        }
        return result;
    }
}
