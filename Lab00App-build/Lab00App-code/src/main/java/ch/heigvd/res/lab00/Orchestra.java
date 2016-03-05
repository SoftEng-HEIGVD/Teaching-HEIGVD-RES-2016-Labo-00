package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sebbos on 02.03.2016.
 */
public class Orchestra {
    private LinkedList<IInstrument> instrumentsList;

    public Orchestra() {
        instrumentsList = new LinkedList<>();
    }

    public int getNumberOfInstruments() {
        return instrumentsList.size();
    }

    public void addInstrument(IInstrument instrument) {
        instrumentsList.add(instrument);
    }

    public List<String> makeMusic() {
        List<String> soundsList = new LinkedList<>();

        for (IInstrument inst : instrumentsList) {
            soundsList.add(inst.play());
        }

        return soundsList;
    }
}
