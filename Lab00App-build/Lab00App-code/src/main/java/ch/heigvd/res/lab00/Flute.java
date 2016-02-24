package ch.heigvd.res.lab00;

/**
 * Created by julien on 24.02.16.
 */
public class Flute implements IInstrument
{
    public String play()
    {
        return "pouet de la flute";
    }

    public int getSoundVolume()
    {
        return 5;
    }

    public String getColor()
    {
        return "silver";
    }
}
