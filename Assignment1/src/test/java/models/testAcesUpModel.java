

package models;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/14/16.
 */
public class testAcesUpModel {

    @Test
    public void testModelExists(){
        // validates that the model is created
        AcesUp tl = new AcesUp();
        assertNotNull(tl);
    }

    @Test
    public void checkDeckSize(){
        // validates that the deck contains 52 cards
        AcesUp deck = new AcesUp();
        int expectedSize = 52;
        assertEquals(expectedSize, deck.numberOfItems());
    }

    @Test
    public void validateDeck(){
        // validates that each card from the cards array exist in the deck
        AcesUp deck = new AcesUp();
        String[] cards = {"1s", "2s", "3s", "4s", "5s", "6s", "7s", "8s", "9s", "10s", "11s", "12s", "13s", "1h", "2h", "3h", "4h", "5h", "6h", "7h", "8h", "9h", "10h", "11h", "12h", "13h", "1c", "2c", "3c", "4c", "5c", "6c", "7c", "8c", "9c", "10c", "11c", "12c", "13c", "1d", "2d", "3d", "4d", "5d", "6d", "7d", "8d", "9d", "10d", "11d", "12d", "13d"};
        Boolean notFound = false;
        for(int i=0; i<52; i++){
            for(int j=0; i<52;i++){
                if(cards[i] != deck.getCard(i)){
                    notFound = true;
                }
            }

        }
        assertFalse(notFound);


    }

}
