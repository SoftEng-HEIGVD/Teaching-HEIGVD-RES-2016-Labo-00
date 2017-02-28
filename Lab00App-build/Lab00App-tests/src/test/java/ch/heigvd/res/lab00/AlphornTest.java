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
 * @author Julien Brêchet
 */
public class AlphornTest {
   @Test
   public void alphornDoBrooo() {
      IInstrument corDesAlpes = new Alphorn();
      String sound = corDesAlpes.play();
      Assert.assertEquals("Brooo", sound);
   }
}
