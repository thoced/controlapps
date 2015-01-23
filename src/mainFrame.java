import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import GUI.DialogAjoutFiche;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class mainFrame {

	private JFrame frame;
	private JMenuItem mAjoutFicheControl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame window = new mainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("ZP Seraing-Neupré Control Apps");
		frame.setSize(1024,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuFichier = new JMenu("Fichier");
		menuBar.add(menuFichier);
		
		JMenuItem mClose = new JMenuItem("Fermer");
		menuFichier.add(mClose);
		
		JMenu menuGestion = new JMenu("Gestion des contrôles");
		menuBar.add(menuGestion);
		
		mAjoutFicheControl = new JMenuItem("Ajouter une fiche de controle");
		mAjoutFicheControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				// creation de la boite de dialog ajout d'une fiche de control
				DialogAjoutFiche daf = new DialogAjoutFiche(null,"Création d'une fiche de controle",true);
				daf.setVisible(true);
			}
		});
		menuGestion.add(mAjoutFicheControl);
	}

}
