package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by julien on 02.03.16.
 */
public class Orchestra
{
    LinkedList<IInstrument> instruments = new LinkedList<>();

    public void addInstrument (IInstrument iInstrument)
    {
        instruments.add(iInstrument);
    }

    public int getNumberOfInstruments()
    {
        return instruments.size();
    }

    public List<String> makeMusic()
    {
        List<String> rtn = new LinkedList<>();

        for (IInstrument i : instruments)
            rtn.add(i.play());

        return rtn;
    }
}
