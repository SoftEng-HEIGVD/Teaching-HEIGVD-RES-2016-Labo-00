package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Christopher Browne
 */

public class Orchestra {
    private List<IInstrument> instrumentList = new LinkedList<IInstrument>();

    public int getNumberOfInstruments(){
        return instrumentList.size();
    }

    public void addInstrument(IInstrument instrument){
        instrumentList.add(instrument);
    }

    public List<String> makeMusic(){
        List<String> soundList = new LinkedList<String>();
        for(IInstrument instrument:instrumentList)
            soundList.add(instrument.play());
        return soundList;
    }
}
