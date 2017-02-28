package ch.heigvd.res.lab00;

import java.util.List;
import java.util.LinkedList;

/**
 * @author Damien Rochat
 */
public class Orchestra {

    private List<IInstrument> instruments;

    public Orchestra() {
        instruments = new LinkedList<>();
    }

    public void addInstrument(IInstrument instrument) {
        instruments.add(instrument);
    }

    public int getNumberOfInstruments() {
        return instruments.size();
    }

    public List<String> makeMusic() {
        List<String> musics = new LinkedList<>();
        for (IInstrument instrument : instruments)
            musics.add(instrument.play());
        return musics;
    }
}
