/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo 00
 Fichier     : Trumpet.java
 Auteur(s)   : Matthieu Chatelan
 Date        : 02/21/2017 11:44:03 AM 

 But         : Création d'une classe Trumpet selon cc

 Compilateur : jdk1.8.0_102
 -----------------------------------------------------------------------------------
*/
package ch.heigvd.res.lab00;

class Trumpet implements IInstrument
{
	// Une trompette émet un son plus important qu'une flute
	private int soundVolume = 100;

	// Une trompette est d'une couleur spécifiée
	private String color = "golden";

	// Permet de jouer un son 
	public String play()
	{
		return "pouet";	
	}

	// Permet de récupérer le volume sonore de la trompette
	public int getSoundVolume()
	{
		return soundVolume;	
	}

	// Permet de récupérer la couleur de la trompette
	public String getColor()
	{
		return color;	
	}
}

