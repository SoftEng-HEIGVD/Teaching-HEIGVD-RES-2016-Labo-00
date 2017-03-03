/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharie nguefack
 */
package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {
    
    private String sound = "pouet";
    private String color = "golden";
    private int volume = 2;
    
    public String play(){
        return this.sound;
    }
    public int getSoundVolume(){
        return volume;
    }
    
    public String getColor(){
        return this.color;
    }
    
}
