package ch.heigvd.res.lab00;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Samuel on 02.03.2016.
 */
public class Orchestra{
    private List<IInstrument> instruments = new ArrayList<>();

    public int getNumberOfInstruments(){
        return instruments.size();
    }
    public void addInstrument(IInstrument instrument){
        instruments.add(instrument);
    }
    public List<String> makeMusic(){
        List<String> str = new ArrayList<>();
        for(IInstrument i : instruments){
            str.add(i.play());
        }
        return str;
    }
}
