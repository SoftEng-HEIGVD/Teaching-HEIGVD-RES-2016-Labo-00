package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sims
 */
public class Steel_drumTest {
      @Test
  public void aTrumpetShouldMakePouet() {
    IInstrument steel_drum = new Steel_drumTest();
    String sound = steel_drum.play();
    Assert.assertEquals("drummmmm", sound);
  }
}
