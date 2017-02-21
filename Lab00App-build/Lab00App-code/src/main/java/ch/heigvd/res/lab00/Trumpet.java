/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo 00
 Fichier     : 
 Auteur(s)   : Matthieu Chatelan
 Date        : 

 But         : 

 Remarque(s) : 

 Compilateur : jdk1.8.0_102
 -----------------------------------------------------------------------------------
*/
package ch.heigvd.res.lab00;

class Trumpet implements IInstrument
{
	private int soundVolume = 100;
	private String color = "golden";

	public String play()
	{
		return "pouet";	
	}

	public int getSoundVolume()
	{
		return soundVolume;	
	}

	public String getColor()
	{
		return color;	
	}
}

