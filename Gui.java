package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Gui extends JFrame {
	
	public Gui() {
		setTitle("TFCKN - Mitglieder");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Layout
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout(1, 1));
		//Menu
		createMenuBar();
		
		JPanel selectContent = new JPanel();
		selectContent.setLayout(new FlowLayout());
		selectContent.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		JPanel header = new JPanel();
		header.setLayout(new BorderLayout());
		header.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		JPanel mainContent = createForm();
		JPanel graphics = new JPanel();
		graphics.setLayout(null);
		graphics.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		pane.add(selectContent, BorderLayout.EAST);
		pane.add(header, BorderLayout.NORTH);
		pane.add(mainContent, BorderLayout.CENTER);
		pane.add(graphics, BorderLayout.SOUTH);
		
		
		
	}
	
	 private JPanel createForm() {
		 JPanel mainContent = new JPanel();
			mainContent.setLayout(new FlowLayout());
			mainContent.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			JTextField id = new JTextField();
			id.setBounds(126, 65, 20, 20);
			id.setBorder(new TitledBorder("ID"));
			mainContent.add(id);
			id.setColumns(2);
			id.setEnabled(false);
			
			JTextField name = new JTextField();
			name.setBounds(128, 65, 86, 20);
			name.setBorder(new TitledBorder("Vorname"));
			mainContent.add(name);
			name.setColumns(15);

			JTextField surname = new JTextField();
			surname.setBounds(128, 65, 86, 20);
			surname.setBorder(new TitledBorder("Nachname"));
			mainContent.add(surname);
			surname.setColumns(15);

			JTextField street = new JTextField();
			street.setBounds(126, 157, 212, 40);
			street.setBorder(new TitledBorder("Straße"));
			mainContent.add(street);
			street.setColumns(20);

			JTextField houseNumber = new JTextField();
			houseNumber.setBounds(126, 157, 212, 40);
			houseNumber.setBorder(new TitledBorder("Nr."));
			mainContent.add(houseNumber);
			houseNumber.setColumns(5);
			
			JTextField zip = new JTextField();
			zip.setBounds(126, 157, 212, 40);
			zip.setBorder(new TitledBorder("PLZ"));
			mainContent.add(zip);
			zip.setColumns(20);
			
			JTextField city = new JTextField();
			city.setBounds(126, 157, 212, 40);
			city.setBorder(new TitledBorder("Stadt"));
			mainContent.add(city);
			city.setColumns(20);
			
			
			JTextField phone = new JTextField();
			phone.setBounds(126, 157, 212, 40);
			phone.setBorder(new TitledBorder("Telefon"));
			mainContent.add(phone);
			phone.setColumns(20);

			JTextField mail = new JTextField();
			mail.setBounds(126, 157, 212, 40);
			mail.setBorder(new TitledBorder("Email"));
			mainContent.add(mail);
			mail.setColumns(20);
			
			String [] genders = {"weiblich", "männlich", "divers"};
			JComboBox<String> gender = new JComboBox<String>(genders);
			gender.setBorder(new TitledBorder("Geschlecht"));
			mainContent.add(gender);
			
			
		/**
		 * TODO: Eine separate DatePicker Klasse, um eine Auswahl für jeweils Geburtsdatum, Eintrittsdatum, Austrittsdatum zu haben
		 * Wichtig: Muss als String exportierbar sein, um dann im korrekten format in die Datenbank geschrieben zu werden
		 */
;		
			
		return mainContent;
	}

	private JMenuBar createMenuBar() {
		 JMenuBar menu = new JMenuBar();
			JMenu datei = new JMenu("Datei");
			menu.add(datei);
			/**
			 * TODO: Action Listener, der auf fileExport zugreift hinzufügen
			 */
			JMenuItem exportieren = new JMenuItem("exportieren");
			JMenuItem schliessen = new JMenuItem("schließen");
			datei.add(exportieren);
			datei.add(schliessen);
			schliessen.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			JMenu bearbeiten = new JMenu("Bearbeiten");
			menu.add(bearbeiten);
			//Action Listener zum Einblenden des Eingabeformulars
			JMenuItem eintritt = new JMenuItem("Neues Mitglied");
			JMenuItem austritt = new JMenuItem("Mitglied löschen");
			//ActionListener, der zunächst die Mitgliederliste anzeigt und nach auswahl den delete Befehl ausführt
			JMenuItem korrektur = new JMenuItem("Eintrag korrigieren");
			bearbeiten.add(eintritt);
			bearbeiten.add(austritt);
			bearbeiten.add(korrektur);
			
			JMenu sortieren = new JMenu("Sortieren");
			menu.add(sortieren);
			JMenuItem sortiereNachEintritt = new JMenuItem("Nach Eintritt");
			JMenuItem sortiereNachAustritt = new JMenuItem("Nach Austritt");
			JMenuItem sortiereNachGezahlt = new JMenuItem("Nach gezahltem Beitrag");
			JMenuItem sortiereNachGeburtstag = new JMenuItem("Nach Geburtstag");
			sortieren.add(sortiereNachEintritt);
			sortieren.add(sortiereNachAustritt);
			sortieren.add(sortiereNachGezahlt);
			sortieren.add(sortiereNachGeburtstag);
			setJMenuBar(menu);
			
			return menu;
	}
}
