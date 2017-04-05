package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Amel Dussier
 */
public class Orchestra {

    private List<IInstrument> instruments = new LinkedList();

    // get the number of instruments in the orchestra
    Object getNumberOfInstruments() {
        return instruments.size();
    }

    // add an instrument to the orchestra
    void addInstrument(IInstrument instrument) {
        instruments.add(instrument);
    }

    // get the music played by all instruments together
    List<String> makeMusic() {
        List<String> music = new LinkedList();
        for (IInstrument i : instruments)
            music.add(i.play());
        return music;
    }

}
