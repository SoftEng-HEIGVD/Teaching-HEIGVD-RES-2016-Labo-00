package ch.heigvd.res.lab00;

/**
 * Created by quentingigon on 21.02.17.
 */
public class Trumpet implements IInstrument {

  public Trumpet() {
  }

  @Override
  public String play() {
    return "pouet";
  }

  @Override
  public int getSoundVolume() {
    return 10;
  }

  public String getColor() {
    return "golden";
  }
}
