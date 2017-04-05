package ch.heigvd.res.lab00;

/**
 * Created by quentingigon on 21.02.17.
 */
public class Flute implements IInstrument {
  public Flute() {
  }

  @Override
  public String play() {
    return null;
  }

  @Override
  public int getSoundVolume() {
    return 5;
  }

  @Override
  public String getColor() {
    return "red";
  }
}
