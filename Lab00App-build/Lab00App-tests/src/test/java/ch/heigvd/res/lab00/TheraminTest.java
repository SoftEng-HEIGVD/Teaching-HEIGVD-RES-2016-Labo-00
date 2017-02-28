package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author David
 */
public class TheraminTest {

    @Test
    public void aTheraminShouldMakeBzzz() {
        IInstrument trumpet = new Theramin();
        String sound = trumpet.play();
        Assert.assertEquals("bzzz", sound);
    }
}
