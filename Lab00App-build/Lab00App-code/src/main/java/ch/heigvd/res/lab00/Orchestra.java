package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

public class Orchestra {

    private final LinkedList<IInstrument> instruments = new LinkedList<>();

    public int getNumberOfInstruments() {
        return instruments.size();
    }

    public void addInstrument(IInstrument instrument) {
        instruments.add(instrument);
    }

    public List<String> makeMusic() {
        List<String> res = new LinkedList<>();
        for (IInstrument i : instruments) {
            res.add(i.play());
        }
        return res;
    }
}
