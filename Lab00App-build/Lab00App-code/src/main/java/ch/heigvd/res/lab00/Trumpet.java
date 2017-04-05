package ch.heigvd.res.lab00;

/**
 * Created by julien on 24.02.16.
 */
public class Trumpet implements IInstrument
{
    public String play()
    {
       return "pouet";
    }

    public int getSoundVolume()
    {
      return 10;
    }

    public String getColor()
    {
        return "golden";
    }
}
