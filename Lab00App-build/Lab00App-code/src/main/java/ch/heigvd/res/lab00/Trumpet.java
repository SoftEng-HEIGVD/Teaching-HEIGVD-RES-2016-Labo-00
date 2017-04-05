package ch.heigvd.res.lab00;

/**
 * @author Julien Baeriswyl
 */
public class Trumpet implements IInstrument
{
    public static final int    SOUND_VOLUME = 90;
    public static final String SOUND_NAME   = "golden";
    public static final String COLOR        = "pouet";
    
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
