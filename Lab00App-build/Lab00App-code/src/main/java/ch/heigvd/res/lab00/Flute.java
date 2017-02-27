/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Chaymae
 */

public class Flute implements IInstrument {

    private String sound;
    private int soundVolume;
    private String color;

    public Flute() {
        this.sound = "pouet-pouet";
        this.color = "black";
        this.soundVolume = 70;
    }

    public String play() {
        return sound;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public String getColor() {
        return color;
    }
}
