package GUI;

import java.awt.Frame;

import javax.swing.JDialog;

public class DialogAjoutFiche extends JDialog 
{
	// constructeur de la class dialogajoutfiche
	public DialogAjoutFiche(Frame frame,String titre,boolean modal)
	{
		super(frame,titre,modal);
		
		// affiche du titre
		this.setTitle("Création de la fiche controle");
		// taille de la boite de dialogue
		this.setSize(1024, 768);
		// affichage au centre de l'ecran
		this.setLocationRelativeTo(null);
	}
	
	
}
