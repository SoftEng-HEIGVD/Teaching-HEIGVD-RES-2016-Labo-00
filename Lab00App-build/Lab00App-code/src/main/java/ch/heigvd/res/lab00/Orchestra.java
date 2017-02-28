/**
 *
 * @author Kevin PONCE
 * @date 02.03.16
 * @RES
 * @Labo00
 */

package ch.heigvd.res.lab00;
import java.util.ArrayList;
import java.util.List;

public class Orchestra 
{
    private ArrayList<IInstrument> orchestre = new ArrayList<>();
    
    public void addInstrument(IInstrument instrument)
    {
        orchestre.add(instrument);
    }
    
    public int getNumberOfInstruments()
    {
        return orchestre.size();
    }
    
    public List<String> makeMusic()
    {
        List<String> son = new ArrayList<>();
        
        for(IInstrument i : orchestre)
        {
            son.add(i.play());
        }
        return son;
    }
}
