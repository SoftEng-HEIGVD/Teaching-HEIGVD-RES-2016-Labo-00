package ch.heigvd.res.lab00;

/**
 *
 * @author Sims
 */
public class BassClarinet implements IInstrument{
  private String sound;
  private int soundVolume;
  private String color;

  public BassClarinet() {
    sound = "buuh";
    soundVolume = 10;
    color = "red";
  }

  public String play() {
    return sound;
  }

  public int getSoundVolume(){
  	return soundVolume;
  }
  
  public String getColor()
  {
	return color;
  }
}
