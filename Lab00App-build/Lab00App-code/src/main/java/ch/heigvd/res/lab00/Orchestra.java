package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ornidon on 02.03.2016.
 */
public class Orchestra {

    private LinkedList<IInstrument> orchestra = new LinkedList<>();

    public int getNumberOfInstruments() {
        return orchestra.size();
    }

    public void addInstrument(IInstrument instrument) {
        orchestra.add(instrument);
    }


    public List<String> makeMusic() {
        List<String> sounds = new LinkedList<>();
        for (IInstrument i : orchestra){
            sounds.add(i.play());
        }
        return sounds;
    }
}
