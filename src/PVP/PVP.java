package PVP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PVP extends JFrame{
    
    String NumberOfPlayers;
    public PVP() {
        JFrame PVPFrame = new JFrame();
        PVPFrame.setTitle("PVP 模式");      

        //设置背景
        ImageIcon SpaceBackground = new ImageIcon("src/images/background/星空背景.GIF");
        JLabel imageLabel = new JLabel(SpaceBackground);
        imageLabel.setSize(SpaceBackground.getIconWidth(),SpaceBackground.getIconHeight());
        PVPFrame.getLayeredPane().add(imageLabel,new Integer(Integer.MIN_VALUE));
        JPanel PVPpan = (JPanel)PVPFrame.getContentPane();
        PVPpan.setOpaque(false);
        PVPpan.setLayout(null);
        
        //nouvelle zone de texte
        JTextPane wordsArea = new JTextPane();
        wordsArea.setBounds(300, 200, 200, 30);
        wordsArea.setEditable(false);   //Les paramètres ne peuvent pas être modifiés
        wordsArea.setFont(new Font("楷体",Font.BOLD,16)); // couleur de la police
        wordsArea.setBackground(new Color(3,70,124));   //couleur de fond
        wordsArea.setForeground(Color.WHITE);   //couleur de texte
        
        wordsArea.setText("How many players?");
        
        PVPpan.add(wordsArea);

        //Ajouter une boîte de saisie
        JTextField playersnumber = new JTextField(20);
        playersnumber.setOpaque(false);
        //Définir la couleur du texte - blanc
        playersnumber.setForeground(Color.WHITE);
        PVPpan.add(playersnumber);
        playersnumber.setBounds(350, 250, 100, 25);

        //Ajouter un bouton
        JButton confirmButton = new JButton("Confirm");
        confirmButton.setBounds(450, 300, 100, 30);
        PVPpan.add(confirmButton);

        //Ajouter un bouton de retour
        PVPFrame.setSize(SpaceBackground.getIconWidth(),SpaceBackground.getIconHeight());
        PVPFrame.setLocationRelativeTo(null);       //Centrer la fenêtre
        PVPFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PVPFrame.setVisible(true);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberOfPlayers = playersnumber.getText();
                new PVPWonderChoose(NumberOfPlayers);
                //new PVPWonderChoose(NumberOfPlayers);
                PVPFrame.setVisible(false);     //Fermer la fenêtre
                //PVPFrame.dispose();
            }
        });

    }
    
}