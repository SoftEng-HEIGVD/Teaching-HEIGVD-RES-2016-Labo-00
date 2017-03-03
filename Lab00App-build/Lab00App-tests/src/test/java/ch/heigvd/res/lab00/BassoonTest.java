package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

 // @author Denise Gemesio

public class TrumpetTest {
  
  @Test
  public void aBassoonShouldMakeBassoon() {
    IInstrument bassoon = new Bassoon();
    String sound = bassoon.play();
    Assert.assertEquals("bassoon", sound);
  }
 
}
