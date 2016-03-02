package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mado on 02.03.2016.
 */
public class Orchestra {
    public int getNumberOfInstruments() {
        return liste.size();
    }

    public void addInstrument(IInstrument instr) {
        liste.add(instr);
        sound.add(instr.play());
    }

    public List<String> makeMusic() {
        return sound;
    }

    private LinkedList<IInstrument> liste = new LinkedList<IInstrument>();
    private List<String> sound = new LinkedList<>();
}
