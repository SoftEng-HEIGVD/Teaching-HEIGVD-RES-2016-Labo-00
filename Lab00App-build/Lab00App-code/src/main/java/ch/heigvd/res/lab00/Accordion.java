package ch.heigvd.res.lab00;

/**
 * @author Daniel Palumbo
 */
public class Accordion implements IInstrument {
    String sound;
    int AccordionVolume;
    String color;

    public Accordion(){
      sound = "fuui";
      AccordionVolume = 6;
      color = "wood";
    }

    public String play(){
      return sound;
    }

    public int getSoundVolume(){
      return AccordionVolume;
    }

    public String getColor(){
      return color;
    }
}