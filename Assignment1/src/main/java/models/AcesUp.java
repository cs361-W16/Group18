package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by michaelhilton on 1/14/16.
 */
public class AcesUp implements Serializable {
    public java.util.List<String> deck;
    public String item;
    public String action;


    public AcesUp() {
        deck = new ArrayList<String>();
        deck.add("1s");
        deck.add("2s");
        deck.add("3s");
        deck.add("4s");
        deck.add("5s");
        deck.add("6s");
        deck.add("7s");
        deck.add("8s");
        deck.add("9s");
        deck.add("10s");
        deck.add("11s");
        deck.add("12s");
        deck.add("13s");
        deck.add("1h");
        deck.add("2h");
        deck.add("3h");
        deck.add("4h");
        deck.add("5h");
        deck.add("6h");
        deck.add("7h");
        deck.add("8h");
        deck.add("9h");
        deck.add("10h");
        deck.add("11h");
        deck.add("12h");
        deck.add("13h");
        deck.add("1c");
        deck.add("2c");
        deck.add("3c");
        deck.add("4c");
        deck.add("5c");
        deck.add("6c");
        deck.add("7c");
        deck.add("8c");
        deck.add("9c");
        deck.add("10c");
        deck.add("11c");
        deck.add("12c");
        deck.add("13c");
        deck.add("1d");
        deck.add("2d");
        deck.add("3d");
        deck.add("4d");
        deck.add("5d");
        deck.add("6d");
        deck.add("7d");
        deck.add("8d");
        deck.add("9d");
        deck.add("10d");
        deck.add("11d");
        deck.add("12d");
        deck.add("13d");

        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i) + " ");
        }
    }

    public void shuffleDeck(){
        Random rand = null;
        int size = deck.size();
        for(int i =0; i<100; i++)
        {
            // generate random numbers
            int randomNum1 = rand.nextInt(size + 1);
            int randomNum2 = rand.nextInt(size + 1);
            // swap
            String temp = deck.get(randomNum1);
            deck.set(randomNum1, deck.get(randomNum2));
            deck.set(randomNum2, temp);
        }
    }

    public String getCard( int index ){
        return deck.get(index);
    }

    public int numberOfItems() {
        return deck.size();
    }

    public String lastItemAdded() {
        return deck.get( deck.size()-1 );
    }

}
