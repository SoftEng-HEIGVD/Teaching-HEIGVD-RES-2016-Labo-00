package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/** Test class for IInstrument Carillon
 * @author Sydney Hauke
 */

public class CarillonTest {
    @Test
    public void aCarillonShouldMakeDong() {
        IInstrument carillon = new Carillon();
        String sound = carillon.play();
        Assert.assertEquals("dong", sound);
    }
}
