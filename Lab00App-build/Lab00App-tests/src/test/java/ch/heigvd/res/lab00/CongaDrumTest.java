package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * @author Luana Martelli
 */
public class CongaDrumTest {
  
  @Test
  public void aCongaDrumShouldMakeDum() {
    IInstrument conga = new CongaDrum();
    String sound = conga.play();
    Assert.assertEquals("dum", sound);
  }
 
}
