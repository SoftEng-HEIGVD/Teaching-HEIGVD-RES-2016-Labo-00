package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Benjamin Schubert on 3/2/16.
 */
public class Orchestra {
    ArrayList<IInstrument> instruments = new ArrayList<>();

    public int getNumberOfInstruments() {
        return instruments.size();
    }

    public void addInstrument(IInstrument instrument) {
        instruments.add(instrument);
    }

    public List<String> makeMusic() {
        ArrayList<String> music = new ArrayList<>();
        for(IInstrument i: instruments) {
            music.add(i.play());
        }
        return music;
    }
}
