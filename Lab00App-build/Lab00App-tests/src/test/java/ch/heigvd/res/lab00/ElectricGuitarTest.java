package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * Classe testant une guitare �l�ctrique
 * @author P-B Monaco
 * @author Olivier Liechti
 */
public class ElectricGuitarTest {

  @Test
  public void thereShouldBeAnIInstrumentInterfaceAndAnElectricGuitarClass() {
    IInstrument eGuitar = new ElectricGuitar();
    assertNotNull(eGuitar);
  }
    
  @Test
  public void anElectricGuitarShouldMakeWaaWaaaa() {
    ElectricGuitar eGuitar = new ElectricGuitar();
    String sound = eGuitar.play();
    Assert.assertEquals("waawaaaa", sound);
  }
  
  @Test
  public void anElectricGuitarShouldHaveAJack() {
    ElectricGuitar eGuitar = new ElectricGuitar();
    String connector = eGuitar.getConnector();
    Assert.assertNotNull(connector);
  }

  @Test
  public void anElectricGuitarShouldHaveSixOrSevenStrings() {
    ElectricGuitar eGuitar = new ElectricGuitar();
    int nbString = eGuitar.getStringNumber();
    Assert.assertTrue(nbString == 6 || nbString == 7);
  }
 
  @Test
  public void anElectricGuitarShouldHaveAConnector() {
    ElectricGuitar eGuitar = new ElectricGuitar();
    ElectricGuitar.Connector connector = eGuitar.getConnector();
    Assert.assertNotNull(eGuitar);
  }
 
}
