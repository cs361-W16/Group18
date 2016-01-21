package models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by michaelhilton on 1/14/16.
 */
public class AcesUp implements Serializable {
    public java.util.List<String> deck;
    public String item;
    public String action;


    public AcesUp(){
        deck = new ArrayList<String>();
        
    }

    public void addItem(String item) {
        deck.add(item);
    }

    public int numberOfItems() {
        return deck.size();
    }

    public String lastItemAdded() {
        return deck.get(todoItems.size()-1);
    }

}
