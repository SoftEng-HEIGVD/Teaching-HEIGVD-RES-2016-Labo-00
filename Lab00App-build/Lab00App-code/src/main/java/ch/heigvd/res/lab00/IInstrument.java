/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Tony Clavien (tony.clavien@heig-vd.ch)
 */
public interface IInstrument {
    String play();
    int getSoundVolume();
    String getColor();
    
}
