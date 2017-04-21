package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private ArrayList<IInstrument> instruments = new ArrayList<>();
    public int getNumberOfInstruments() {
        return instruments.size();
    }

    public void addInstrument(IInstrument instrument) {
        instruments.add(instrument);
    }

    public List<String> makeMusic() {
        ArrayList<String> sounds = new ArrayList<>();
        for (IInstrument i : instruments)
            sounds.add(i.play());
        return sounds;
    }
}
