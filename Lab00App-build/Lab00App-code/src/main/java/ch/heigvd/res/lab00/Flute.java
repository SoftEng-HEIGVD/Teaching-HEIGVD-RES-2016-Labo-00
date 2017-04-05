package ch.heigvd.res.lab00;

/**
 * @author Julien Baeriswyl
 */
public class Flute implements IInstrument
{
    public static final int    SOUND_VOLUME = 80;
    public static final String SOUND_NAME   = "silver";
    public static final String COLOR        = "fuu";
    
    public int getSoundVolume ()
    {
        return SOUND_VOLUME;
    }
    
    public String getColor ()
    {
        return SOUND_NAME;
    }
    
    public String play ()
    {
        return COLOR;
    }
}
