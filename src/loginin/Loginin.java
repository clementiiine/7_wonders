package loginin;

import StartGame.StartGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Loginin extends JFrame {
	     
	public Loginin() { 
		setSize(500,500);// taille de fenêtre
		setTitle("Login Window");
		JLabel username=new JLabel("Username"); //label de nom d'utilisateur
		JLabel password=new JLabel("Password");
		JTextField enter_username=new JTextField(15);//texte de nom d'utilisateur
		JPasswordField enter_password=new JPasswordField(15);//texte de mot de passe
		enter_password.setEchoChar('*');//afficher le mot de passe avec *
		JButton confirm=new JButton("Confirm");
		JButton reset=new JButton("Reset");
		JButton registration=new JButton("registration");
		setVisible(true);//fenêtre visible
		Container Loginin=getContentPane();//conteneur
//		Ajoutez les zones de texte Jlabel et JTextField du nom d'utilisateur et du mot de passe
//		, la zone de mot de passe JPasswordField et les boutons JButton OK, JButton Reset et JButton Register au conteneur.                         //
        Loginin.add(username);
		Loginin.add(password);
		Loginin.add(enter_username);
		Loginin.add(enter_password);
		Loginin.add(confirm);
		Loginin.add(reset);
		Loginin.add(registration);
		setBounds(400,400,400,400);//définir la longueur et la largeur de la fenêtre à 300, 300,
		// et afficher la fenêtre à 300, 300 à partir du coin supérieur gauche de l'écran
		Loginin.setLayout(null);
//		Définir la position et la taille de chaque composant dans le conteneur
        username.setBounds(40,100,80,18);
		password.setBounds(40,200,80,18);
		enter_username.setBounds(110,100,200,18);
		enter_password.setBounds(110,200,200,18);
		confirm.setBounds(140,300,100,30);
		reset.setBounds(20,300,100,30);
		registration.setBounds(260,300,100,30);
		
		reset.addActionListener(new ActionListener() {//réinitialiser le texte de nom d'utilisateur et de mot de passe
 
			@Override
			public void actionPerformed(ActionEvent arg0) {

				enter_username.setText("");//réinitialiser le texte de nom d'utilisateur
				enter_password.setText("");//réinitialiser le texte de mot de passe
			}
			
		});
		confirm.addActionListener(new ActionListener() {//confirmer le nom d'utilisateur et le mot de passe
			 
			@Override
			public void actionPerformed(ActionEvent arg0) {

				Registration registration = new Registration();
				registration.CloseWindows();

				HashMap<String,char[]> usersMap = registration.getUsers(); 

				for(String key1 : usersMap.keySet()){
					System.out.println(key1);
					System.out.println(usersMap.get(key1));
				}
				

                String username_start = "1";
                String password_start = "1";

				Map<String,String> Administrators = new HashMap<>();
				Administrators.put(username_start, password_start);

				for(String key : Administrators.keySet()){
					if(enter_username.getText().trim().equals(key)&&new String(enter_password.getPassword()).equals(Administrators.get(key))) {//fonction equals pour faire correspondre le nom d'utilisateur et le mot de passe
						JOptionPane.showMessageDialog(null,"Successful login");
						
						new StartGame();//créer une nouvelle fenêtre de jeu
						setVisible(false);
					}else {
						for(String key1 : usersMap.keySet()) {
							System.out.println("11");
							System.out.println(key1);
							System.out.println(usersMap.get(key));
							if (enter_username.getText().trim().equals(key1)&&new String(enter_password.getPassword()).equals(String.valueOf(usersMap.get(key1)))) {
								JOptionPane.showMessageDialog(null,"Successful login");
								new StartGame();//créer une nouvelle fenêtre de jeu
								setVisible(false);
							}else {
								JOptionPane.showMessageDialog(null,"Login failed");
							}
						}
					}	
				}

			}
				
		});
		registration.addActionListener(new ActionListener(){//créer une nouvelle fenêtre d'enregistrement
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Registration();//créer une nouvelle fenêtre d'enregistrement
				setVisible(false);
			}
			
		});
		
	}
		public static void main(String[] args) {
			new Loginin();
			
		}
		

	}



