package loginin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Registration extends JFrame {

	HashMap<String,char[]> Users= new HashMap<>();

	public  Registration() {
		setSize(300,290);//Taille de la fenêtre
		setTitle("Registration Window");
		JLabel username=new JLabel("Username"); //label de nom d'utilisateur
		JLabel password=new JLabel("Password");
		JTextField enter_username=new JTextField(15);//texte de nom d'utilisateur
		JPasswordField enter_password=new JPasswordField(15);//texte de mot de passe
		enter_password.setEchoChar('*');//afficher le mot de passe avec *
		JButton confirm=new JButton("Confirm");
		JButton reset=new JButton("Reset");
		JButton back=new JButton("Back");
		setVisible(true);//visualisation de fenêtre
		Container Loginin=getContentPane();//conteneur
//		Ajoutez les zones de texte Jlabel et JTextField du nom d'utilisateur et du mot de passe,
//		la zone de mot de passe JPasswordField et les boutons JButton OK, JButton Reset et JButton Register au conteneur.                         //
        Loginin.add(username);
		Loginin.add(password);
		Loginin.add(enter_username);
		Loginin.add(enter_password);
		Loginin.add(confirm);
		Loginin.add(reset);
		Loginin.add(back);
		setBounds(400,400,400,400);//définir la longueur et la largeur de la fenêtre à 300, 300,
//		et afficher la fenêtre à 300, 300 à partir du coin supérieur gauche de l'écran
		Loginin.setLayout(null);
//		Définir la position et la taille de chaque composant dans le conteneur
        username.setBounds(40,100,80,18);
		password.setBounds(40,200,80,18);
		enter_username.setBounds(110,100,200,18);
		enter_password.setBounds(110,200,200,18);
		confirm.setBounds(140,300,100,30);
		reset.setBounds(20,300,100,30);
		back.setBounds(260,300,100,30);


		back.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {

				new Loginin();
				CloseWindows();
			}
			
		});

		reset.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				enter_username.setText("");//effacer le texte de nom d'utilisateur
				enter_password.setText("");//effacer le texte de mot de passe
			}
		});

		confirm.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0){

				Users.put(enter_username.getText(), enter_password.getPassword());

				for(String key: Users.keySet()){
					System.out.println(key);
					System.out.println(Users.get(key));
				}
				
				System.out.println(Users.size());

				new Loginin();
				CloseWindows();
				
			}
		});
	}

	public HashMap<String,char[]> getUsers(){
		return Users;
		
	}

	public void CloseWindows(){
		setVisible(false);
	}
   

}

