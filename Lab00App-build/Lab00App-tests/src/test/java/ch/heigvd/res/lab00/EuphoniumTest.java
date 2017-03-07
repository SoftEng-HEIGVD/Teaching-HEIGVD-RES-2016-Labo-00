package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**

 * 
 * @author wojciech myszkorowski
 */
public class TrumpetTest {

  
  @Test
  public void checkTheSoundOfMyInstrumentEuphonium() {
    IInstrument trumpet = new Euphonium();
    String sound = trumpet.play();
    Assert.assertEquals("euphonium", sound);
  }
}
