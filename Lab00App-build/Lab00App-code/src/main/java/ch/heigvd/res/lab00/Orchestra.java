/**
 * ===============================================================
 * Project name : Lab00App-build
 * Create by    : mathieuurstein
 * On           : 02.03.16
 * ================================================================
 * Edited By    : -
 * On           : -
 * ================================================================
 * Version      : 1.0
 * ================================================================
 * Description  : -
 */
package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

public class Orchestra {

    LinkedList<IInstrument> instruments;

    public Orchestra() {
        this.instruments = new LinkedList<>();
    }

    public int getNumberOfInstruments() {
        return instruments.size();
    }

    public void addInstrument(IInstrument instru) {
        instruments.add(instru);
    }

    public List<String> makeMusic() {
        LinkedList sounds = new LinkedList<String>();
        for (IInstrument i : instruments) {
            sounds.add(i.play());
        }
        return sounds;
    }
}
