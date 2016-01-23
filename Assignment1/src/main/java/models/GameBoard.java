package models;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Created by Charles Siebert on 1/22/2016.
 */
public class GameBoard implements Serializable {
    public java.util.LinkedList<String> ColumnList;
    public String card;

    //Initializing Official Game board
    LinkedList col1 = new LinkedList<String>();
    LinkedList col2 = new LinkedList<String>();
    LinkedList col3 = new LinkedList<String>();
    LinkedList col4 = new LinkedList<String>();

    public GameBoard() {
        ColumnList = new LinkedList<String>();
    }

    //compare string logic, if false, the strings are not similar in suit
    //compare also tests if first number is higher than second number
    //function will be used

    public char suitChar(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'd') {
                return 'd';
            }
            if (s1.charAt(i) == 'c') {
                return 'c';
            }
            if (s1.charAt(i) == 's') {
                return 's';
            }
            else if (s1.charAt(i) == 'h') {
                return 'h';
            }
        }
        return 'n'; // logically won't happen
    }

    public int str2int(String s1) {
        String newstr = "";
        for(int i = 0; i < s1.length() -1; i++) {
            newstr += s1.charAt(i);
        }
        int intvalue = Integer.parseInt(newstr);
        return intvalue;
    }

    public boolean sameSuit(char c1, char c2) {
        if ( c1 == c2 ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lowerNum(int num1, int num2) {
        if ( num1 < num2 ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compare(String s1, String s2) {
        //suit declaration, if same, cancel out
        char suit1, suit2;
        int num1, num2;
        suit1 = suitChar(s1);
        suit2 = suitChar(s2);

        num1 = str2int(s1);
        num2 = str2int(s2);

        //same suit
        if ( suit1 == suit2 ) {
            return true; //can remove
        }
        else {
        if ( sameSuit(suit1, suit2) == true ) {
            //the
            if ( lowerNum(num1, num2) ) {
                return true;
            } else {
                return false;
            }
        } else {
            return false; // not the same suit, can't remove
        }
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
