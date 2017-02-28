/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Thomas
 */


class Trumpet implements IInstrument {
    
    private String sound;
    private int trumpetVolume;
    private String color;
    
    public Trumpet(){
        this.sound = "pouet";
        this.trumpetVolume = 10;
        this.color = "golden";
    }
    public String play(){
        return sound;
    }
    
    public int getSoundVolume() {
        return trumpetVolume;
    }
    
    public String getColor() {
        return color;
    }
    
}


