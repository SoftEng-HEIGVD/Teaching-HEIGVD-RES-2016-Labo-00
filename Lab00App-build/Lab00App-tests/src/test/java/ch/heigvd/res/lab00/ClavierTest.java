/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;


import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
!!
 * 
 * @author Abass Mahdavi
 */


public class ClavierTest {

  
  @Test
  public void thereShouldBeAClavierClass() {
    IInstrument clavier = new Clavier();
    assertNotNull(clavier);
  }
  
  @Test
  public void itShouldBePossibleToPlayAClavier() {
    IInstrument clavier = new Clavier();
    String sound = clavier.play();
    assertNotNull(sound);
  }
  
  @Test
  public void aClavierShouldMakeDayyyn() {
    IInstrument clavier = new Clavier();
    String sound = trumpet.play();
    Assert.assertEquals("dayyyn", sound);
  }
  
  @Test
  public void aClavierShouldNotBeMute() {
    IInstrument clavier = new Clavier();
    int clavierVolume = clavier.getSoundVolume();
    Assert.assertTrue(trumpetVolume > 0);
  }

  @Test
  public void aClavierShouldBeIvory() {
    IInstrument clavier = new Clavier();
    String color = clavier.getColor();
    Assert.assertEquals("ivory", color);
  }
  
 
}