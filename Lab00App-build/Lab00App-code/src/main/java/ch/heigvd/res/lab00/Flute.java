/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author dbnsky
 */
public class Flute implements IInstrument{

    public String play() {
        return "Fulte pour l'apero";
    }

    public int getSoundVolume() {
        return 90;
    }

    public String getColor() {
        return "Argent";
    }
}
