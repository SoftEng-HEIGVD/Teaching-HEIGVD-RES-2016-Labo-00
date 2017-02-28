package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class Aeolian_harpTest {

  @Test
  public void aAeolian_harpShouldMakeDing() {
    IInstrument aeolian_harp = new Aeolian_harp();
    String sound = aeolian_harp.play();
    Assert.assertEquals("ding", sound);
  }



  
 
}
