/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author christopher
 */
public class Flute implements IInstrument {
    public String play() {
        return "fu";
    }

    public int getSoundVolume() {
        return 10;
    }

    public String getColor() {
        return "silver";
    }
}
