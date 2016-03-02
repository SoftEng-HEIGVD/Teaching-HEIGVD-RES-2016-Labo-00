package ch.heigvd.res.lab00;

import java.util.List;
import java.util.ArrayList;


/**
 * Created by michael on 02.03.16.
 */
public class Orchestra {

    private ArrayList<IInstrument> instruments;

    public Orchestra(){
        instruments = new ArrayList<>();
    }

    public int getNumberOfInstruments(){
        return instruments.size();
    }

    public void addInstrument(IInstrument instrument){
        instruments.add(instrument);
    }

    public List<String> makeMusic(){
        List<String> tmp = new ArrayList<>();

        for(IInstrument i : instruments){
            tmp.add(i.play());
        }

        return tmp;
    }
}
