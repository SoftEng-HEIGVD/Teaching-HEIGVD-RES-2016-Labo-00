/*
 * Author:            Rosanne Combremont, HEIG-VD
 * Creation:          27.02.16
 * Last modification: 27.02.16
 */
package ch.heigvd.res.lab00;
import java.util.LinkedList;
import java.util.List;

public class Orchestra {
    
    public Orchestra()
    {
        orchestra = new LinkedList<>();
    }
    
    public void addInstrument(IInstrument i)
    {
        orchestra.add(i);
    }
    public int getNumberOfInstruments()
    {
        return orchestra.size();
    }
    public List<String> makeMusic()
    {
        List<String> sound = new LinkedList<>();
        for(IInstrument i: orchestra)
        {
            sound.add(i.play());
        }
        return sound;
    }
    
    private List<IInstrument> orchestra;
}
