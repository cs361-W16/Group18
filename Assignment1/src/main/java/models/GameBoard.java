package models;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Created by Charles Siebert on 1/22/2016.
 */
public class GameBoard implements Serializable {
    public java.util.LinkedList<String> ColumnList;
    public String card;

    public GameBoard() {
        ColumnList = new LinkedList<String>();
    }

    public void addtoBoard(String card) {
        ColumnList.add(card);
    }

    public String getlastitem() {
        return ColumnList.getLast();
    }

    public int getSize() {
        return ColumnList.size();
    }

}
