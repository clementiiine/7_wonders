package StartGame;

import PVE.PVE;
import PVP.PVP;
import music.code.ButtonClick1;
import music.code.ButtonClick2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGame extends JFrame{
	public StartGame(){

		//Jouer de la musique de fond
		/*Background bgm = new Background();
		try {  
            bgm.setAudioClip(Applet  
                    .newAudioClip((new File("src/music/bgm/Mystica-Bandari.wav")).toURL()));  
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        }  
        bgm.loop();//Lecture en boucle*/

		//Définir le son du bouton
		ButtonClick1 buttonClick1 = new ButtonClick1();
		ButtonClick2 buttonClick2 = new ButtonClick2();

		//Configuration de la fenêtre
		JFrame game = new JFrame("Game");
		game.setTitle("Bienvenue dans la nouvelle fenêtre");

		//arrière-plan
		ImageIcon image = new ImageIcon("src/images/background/7-wonders-architects.png");
		JLabel imageJLabel = new JLabel(image);
		imageJLabel.setSize(image.getIconWidth(),image.getIconHeight()); 
		game.getLayeredPane().add(imageJLabel,new Integer(Integer.MIN_VALUE));
		JPanel pan = (JPanel)game.getContentPane();
		pan.setOpaque(false);
		pan.setLayout(null);

		//Bouton PVP et PVE
		JButton PVP = new JButton("PVP");
		JButton PVE = new JButton("PVE");

		//Régler le bouton de sourdine
		ImageIcon quiet = new ImageIcon("src/images/button/Quiet.jpg");
		JButton quietButton = new JButton();
		quietButton.setOpaque(false);
		quietButton.setContentAreaFilled(false);
		quietButton.setFocusPainted(false);
		quietButton.setBorder(null);
		quietButton.setIcon(quiet);

		//Rejoindre Jpanel
		pan.add(PVP);
		pan.add(PVE);
		pan.add(quietButton);
		PVP.setBounds(368, 150, 100, 30);
		PVE.setBounds(368, 200, 100, 30);
		quietButton.setBounds(770, 340, quiet.getIconWidth(), quiet.getIconHeight());
		
		//System.out.println(image.getIconWidth());
		//System.out.println(image.getIconHeight());

		game.setSize(image.getIconWidth(),image.getIconHeight());
		game.setLocationRelativeTo(null);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(true);

		/*quietButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				buttonClick2.playMusic();
				bgm.stop();
			}

		});*/

		PVP.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//buttonClick1.playMusic();
				new PVP();
				game.setVisible(false);
			}

		});

		PVE.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//buttonClick1.playMusic();
				new PVE();
				game.setVisible(false);
			}

		});
	}
}
