/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo 00
 Fichier     : Flute.java
 Auteur(s)   : Matthieu Chatelan
 Date        : 02/21/2017 11:43:04 AM 

 But         : Créer une classe Flute qui correspond au cahier des charges

 Compilateur : jdk1.8.0_102
 -----------------------------------------------------------------------------------
*/
package ch.heigvd.res.lab00;

class Flute implements IInstrument
{
	// Volume sonore de la flute (trompette > flute)
	private int soundVolume = 10;

	// Couleur arbitraire de la flute
	private String color = "purple";

	// Permet de jouer le son d'une flute
	public String play()
	{
		return "tudididu";	
	}

	// Permet de récupérer le volume sonore de l'instrument
	public int getSoundVolume()
	{
		return soundVolume;	
	}

	// Permet de récupérer la couleur de l'instrument
	public String getColor()
	{
		return color;
	}
}
