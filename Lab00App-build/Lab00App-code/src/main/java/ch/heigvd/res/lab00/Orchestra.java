package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by verdo on 02.03.2016.
 */
public class Orchestra {

    private Vector<IInstrument> tabInstrument;

    public Orchestra(){
       tabInstrument = new Vector<IInstrument>();
    }

    public int getNumberOfInstruments() {
        return tabInstrument.size();
    }

    public void addInstrument(IInstrument instrument) {
        tabInstrument.add(instrument);
    }

    public List<String> makeMusic() {
        List<String> l = new ArrayList<String>();
        for (IInstrument i:tabInstrument) {
            l.add(i.play());
        }

        return l;
    }
}
