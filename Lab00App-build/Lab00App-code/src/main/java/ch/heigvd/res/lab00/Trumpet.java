package ch.heigvd.res.lab00;

/**
 * @author Loan Lassalle
 */
 
 interface IInstrument
 {
    String play();
    int getSoundVolume();
    String getColor();
 }
 
public class Trumpet implements IInstrument
{
    String sound;
    int soundVolume;
    String color;
    
    public Trumpet()
    {
        sound = "pouet";
        soundVolume = 30;
        color = "golden";
    }

    public String play()
    {
        return sound;
    }

    public int getSoundVolume()
    {
        return soundVolume;
    }

    public String getColor()
    {
        return color;
    }
}
 
class Flute implements IInstrument
{
    String sound;
    int soundVolume;
    String color;
    
    public Flute()
    {
        sound = "fuu";
        soundVolume = 10;
        color = "wood";
    }

    public String play()
    {
        return sound;
    }

    public int getSoundVolume()
    {
        return soundVolume;
    }

    public String getColor()
    {
        return color;
    }
}
