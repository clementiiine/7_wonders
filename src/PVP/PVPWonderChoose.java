package PVP;

import WondersIntroduction.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class PVPWonderChoose extends JFrame{

    String getText;
    

    public PVPWonderChoose(String getText) {

        JFrame ChooseWonderFrame = new JFrame();
        ChooseWonderFrame.setTitle("Choose Wonder");
        
        //Définir l'image de fond
        ImageIcon ChooseWonderBackground = new ImageIcon("src/images/background/playBackground.png");
        JLabel imageLabel = new JLabel(ChooseWonderBackground);
        imageLabel.setSize(ChooseWonderBackground.getIconWidth(),ChooseWonderBackground.getIconHeight());
        ChooseWonderFrame.getLayeredPane().add(imageLabel,new Integer(Integer.MIN_VALUE));

        //Configuration de la fenêtre
        ChooseWonderFrame.setSize(ChooseWonderBackground.getIconWidth(),ChooseWonderBackground.getIconHeight());
        ChooseWonderFrame.setLocationRelativeTo(null);
        ChooseWonderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChooseWonderFrame.setVisible(true);

        this.getText = getText;
        //System.out.println(getText);

        JPanel backgroundJpanel = (JPanel)ChooseWonderFrame.getContentPane();
        backgroundJpanel.setOpaque(false);
        backgroundJpanel.setLayout(null);


        //Configuration des données
        Vector<Vector<Object>> contextList = new Vector<>();    //Liste des données

        Vector<Object> titleList = new Vector<>();      //Liste des titres
        titleList.add("Player");
        titleList.add("Name");
        titleList.add("Wonder");


        // Création du modèle DefaultTableMode ; Gestion des conteneurs de données
        DefaultTableModel model = new DefaultTableModel(contextList, titleList);
        JTable table = new JTable(model);   //Configuration du tableau
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(180, 60, 400, 300);
        backgroundJpanel.add(scrollPane);



        //Ajout des merveilles à la liste des merveilles
        ArrayList<String> wonderList = new ArrayList<>();
        wonderList.add("Alexandria");
        wonderList.add("Babylon");
        wonderList.add("Ephesus");
        wonderList.add("Giza");
        wonderList.add("Halicarnassus");
        wonderList.add("Olympia");
        wonderList.add("Rhodes");

        //Création de conseils textuels

        //Création d'une sélection de numéros de série de joueurs
        JTextPane nopPane = new JTextPane();
        nopPane.setBounds(1125, 65, 250, 50);
        nopPane.setEditable(false);
        nopPane.setFont(new Font("楷体",Font.BOLD,16));
        nopPane.setForeground(Color.BLACK);
        nopPane.setText("CHOOSE YOUR  PLAYER  : "); 
        backgroundJpanel.add(nopPane); 

        //Création d'une sélection de numéros de joueurs
        JLabel playersLabel = new JLabel("Player: ");
        DefaultComboBoxModel<Object> NumberOfPlayer = new DefaultComboBoxModel<>();
        for (int i = 1; i<(Integer.parseInt(getText)+1); i ++){
            NumberOfPlayer.addElement("Player" + i);
        }
        JComboBox<Object> comboBoxList1 = new JComboBox<>(NumberOfPlayer);
        playersLabel.setBounds(1000, 200, 100, 40);
        comboBoxList1.setBounds(1050, 200, 80, 40);
        backgroundJpanel.add(playersLabel);
        backgroundJpanel.add(comboBoxList1);

        //Création une sélection de noms de joueurs
        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameofPlayerField = new JTextField(20);
        nameLabel.setBounds(1150, 200, 100, 40);
        nameofPlayerField.setBounds(1200, 200, 80, 40);
        backgroundJpanel.add(nameLabel);
        backgroundJpanel.add(nameofPlayerField);

        //Créer une sélection de merveilles
        JLabel wonderJLabel = new JLabel("Wonder: ");
        DefaultComboBoxModel<Object> wonderchoose = new DefaultComboBoxModel<>();
        for (int i = 0;i<wonderList.size(); i ++){
            wonderchoose.addElement(wonderList.get(i));
        }
        JComboBox<Object> comboBoxList2 = new JComboBox<>(wonderchoose);
        wonderJLabel.setBounds(1300, 200, 100, 40);
        comboBoxList2.setBounds(1350, 200, 110, 40);
        backgroundJpanel.add(wonderJLabel);
        backgroundJpanel.add(comboBoxList2);

        //Créer un bouton de confirmation
        JButton confirmButton = new JButton("Confirm");
        confirmButton.setBounds(1430, 270, 100, 40);
        backgroundJpanel.add(confirmButton);

        //Ajouter l'icône des 7 merveilles

        //Alexandria
        ImageIcon AlexandriaIcon = new ImageIcon("src/images/cards/wonders/Alexandria.png");
        JButton alexandriaButton = new JButton();
        alexandriaButton.setOpaque(false);
        alexandriaButton.setContentAreaFilled(false);
        alexandriaButton.setFocusPainted(false);
        alexandriaButton.setBorder(null);
        alexandriaButton.setIcon(AlexandriaIcon);
        alexandriaButton.setBounds(100,250,AlexandriaIcon.getIconWidth(), AlexandriaIcon.getIconHeight());
        backgroundJpanel.add(alexandriaButton);

        //Babylon
        ImageIcon BabylonIcon = new ImageIcon("src/images/cards/wonders/Babylon.png");
        JButton babylButton = new JButton();
        babylButton.setOpaque(false);
        babylButton.setContentAreaFilled(false);
        babylButton.setFocusPainted(false);
        babylButton.setBorder(null);
        babylButton.setIcon(BabylonIcon);
        babylButton.setBounds(500, 250, BabylonIcon.getIconWidth(), BabylonIcon.getIconHeight());
        backgroundJpanel.add(babylButton);

        //Ephesus
        ImageIcon EphesusIcon = new ImageIcon("src/images/cards/wonders/Ephesus.png");
        JButton ephesusButton = new JButton();
        ephesusButton.setOpaque(false);
        ephesusButton.setContentAreaFilled(false);
        ephesusButton.setFocusPainted(false);
        ephesusButton.setBorder(null);
        ephesusButton.setIcon(EphesusIcon);
        ephesusButton.setBounds(900, 250, EphesusIcon.getIconWidth(), EphesusIcon.getIconHeight());
        backgroundJpanel.add(ephesusButton);

        //Giza
        ImageIcon GizaIcon = new ImageIcon("src/images/cards/wonders/Giza.png");
        JButton gizaButton = new JButton();
        gizaButton.setOpaque(false);
        gizaButton.setContentAreaFilled(false);
        gizaButton.setFocusPainted(false);
        gizaButton.setBorder(null);
        gizaButton.setIcon(GizaIcon);
        gizaButton.setBounds(1300, 250, GizaIcon.getIconWidth(), GizaIcon.getIconHeight());
        backgroundJpanel.add(gizaButton);

        //Halicarnassus
        ImageIcon HalicarnassusIcon = new ImageIcon("src/images/cards/wonders/Halicarnassus.png");
        JButton HalicarnassusButton = new JButton();
        HalicarnassusButton.setOpaque(false);
        HalicarnassusButton.setContentAreaFilled(false);
        HalicarnassusButton.setFocusPainted(false);
        HalicarnassusButton.setBorder(null);
        HalicarnassusButton.setIcon(HalicarnassusIcon);
        HalicarnassusButton.setBounds(300, 500, HalicarnassusIcon.getIconWidth(), HalicarnassusIcon.getIconHeight());
        backgroundJpanel.add(HalicarnassusButton);

        //Olympia
        ImageIcon OlympiaIcon = new ImageIcon("src/images/cards/wonders/Olympia.png");
        JButton OlympiaButton = new JButton();
        OlympiaButton.setOpaque(false);
        OlympiaButton.setContentAreaFilled(false);
        OlympiaButton.setFocusPainted(false);
        OlympiaButton.setBorder(null);
        OlympiaButton.setIcon(OlympiaIcon);
        OlympiaButton.setBounds(700, 500, OlympiaIcon.getIconWidth(), OlympiaIcon.getIconHeight());
        backgroundJpanel.add(OlympiaButton);

        //Rhodes
        ImageIcon RhodesIcon = new ImageIcon("src/images/cards/wonders/Rhodes.png");
        JButton RhodesButton = new JButton();
        RhodesButton.setOpaque(false);
        RhodesButton.setContentAreaFilled(false);
        RhodesButton.setFocusPainted(false);
        RhodesButton.setBorder(null);
        RhodesButton.setIcon(RhodesIcon);
        RhodesButton.setBounds(1100, 500, RhodesIcon.getIconWidth(), RhodesIcon.getIconHeight());
        backgroundJpanel.add(RhodesButton);

        //Configurer des boutons individuels
        confirmButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e ) {
                String playernumber = comboBoxList1.getSelectedItem().toString();
                String name = nameofPlayerField.getText();
                String wonderchooseelement = comboBoxList2.getSelectedItem().toString();

                Vector<Object> list = new Vector<>();       //Liste des options
                list.addElement(playernumber);
                list.addElement(name);
                list.addElement(wonderchooseelement);
                //Ajouter les options dans la liste
                model.addRow(list);

                //effacer les données
                nameofPlayerField.setText("");
                NumberOfPlayer.removeElement(playernumber);
                wonderchoose.removeElement(wonderchooseelement);

                if (NumberOfPlayer.getSize() ==  0){
                    ChooseWonderFrame.setVisible(false);
                    new PlayPVP(contextList);
                }

            }
        });
        

        alexandriaButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Alexandria();
            }
        });

        babylButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Babylon();
            }
        });

        ephesusButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Ephesus();
            }
        });

        gizaButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Giza();
            }
        });

        HalicarnassusButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Halicarnassus();
            }
        });

        OlympiaButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Olympia();
            }
        });

        RhodesButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Rhodes();
            }
        });

    }



}
