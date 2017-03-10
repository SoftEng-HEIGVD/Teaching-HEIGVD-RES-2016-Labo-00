package ch.heigvd.res.lab00;

/*@author Xavier Vaz Afonso*/
 
public class Bell implements IInstrument {

  private String sound;
  private int soundVolume;
  private String color;

  public Bell() {
    sound = "bell";
    soundVolume = 10;
  	color = "rose";
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
