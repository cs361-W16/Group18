

package models;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/14/16.
 */
public class testAcesUpModel {

    @Test
    public void checkDeckSize(){
        AcesUp deck = new AcesUp();
        int expectedSize = 52;
        assertEquals( expectedSize, deck.numberOfItems() );
    }

    @Test
    public void testModelExists(){
        AcesUp tl = new AcesUp();
        assertNotNull(tl);
    }

}
