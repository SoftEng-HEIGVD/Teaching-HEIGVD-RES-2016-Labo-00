/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import ch.heigvd.res.lab00.Application;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author arthur
 */
public class MaracasTest {
    
    
    @Test
    public void maracasShouldMakeTshTsh(){
        Maracas maracas = new Maracas();
        String sound = maracas.play();
        Assert.assertEquals("TshTsh", sound);
    }
}
