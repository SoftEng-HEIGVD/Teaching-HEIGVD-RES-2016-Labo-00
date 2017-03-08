/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo 00
 Fichier     : IInstrument.java
 Auteur(s)   : Matthieu Chatelan
 Date        : 02/21/2017 11:43:34 AM 

 But         : Création d'une interface

 Compilateur : jdk1.8.0_102
 -----------------------------------------------------------------------------------
*/
package ch.heigvd.res.lab00;

public interface IInstrument
{
	String play(); 			// Jouer un son
	String getColor(); 		// Retourner la couleur
	int getSoundVolume(); 	// Retourner le volume sonore 
}

