package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sebbos on 02.03.2016.
 */
public class Orchestra {
    private int numberOfInstruments;
    private LinkedList<IInstrument> listOfInstruments;

    public Orchestra() {
        listOfInstruments = new LinkedList<>();
    }

    public int getNumberOfInstruments() {
        return numberOfInstruments;
    }

    public void addInstrument(IInstrument instrument) {
        numberOfInstruments++;
        listOfInstruments.add(instrument);
    }

    public List<String> makeMusic() {
        List<String> listOfSounds = new LinkedList<>();

        for (IInstrument instr : listOfInstruments) {
            listOfSounds.add(instr.play());
        }

        return listOfSounds;
    }
}
