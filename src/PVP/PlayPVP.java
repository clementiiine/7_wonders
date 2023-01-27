package PVP;

import CardAndDeck.Card;
import CardAndDeck.Deck;
import EffectOfScience.effectofscience;
import EffectOfScience.effectofsciencelist;
import Wonders.AllWonder;
import Wonders.Wonder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.*;


public class PlayPVP{
    Vector<Vector<Object>> contextList;

    static JPanel centerDeckJPanel_control = new JPanel();
    static JPanel leftDeckJPanel_control = new JPanel();
    static JPanel rightDeckJPanel_control = new JPanel();

    static JLabel wonderJLabel;

    static int i = 0;
    static int cardnumber = 0;

    public PlayPVP(Vector<Vector<Object>> contextList){
        this.contextList = contextList;

        List<String> AllInfoList = new ArrayList<>();
        //Passage de données à partir de la contextlist
        for(Vector<Object> v : contextList){
            for(int i = 0; i<v.size();i++){
                AllInfoList.add((String) v.elementAt(i));   //Une liste de données pour une seule chaîne
            }
        }

        //Créer son nom, la liste des merveilles choisies par le joueur
        List<String> nameList = new ArrayList<>();
        List<String> wonderList_String = new ArrayList<>();
        for (int i = 0;i<AllInfoList.size();i++){
            if(i%3 == 1){
                nameList.add(AllInfoList.get(i));
            }else if(i%3 == 2){
                wonderList_String.add(AllInfoList.get(i));
            }
        }

        //Obtenez toutes les merveilles
        AllWonder allWonder = new AllWonder();
        List<Wonder> wonderList = allWonder.GetAllWonder();

        //Créer une terrasse
        Deck deckcard = new Deck();
        List<Card> deck = new ArrayList<>();
        deck = deckcard.getAllCardList();
        //Mélangez les cartes
        Collections.shuffle(deck);
        //Le pont est divisé en sections contextList.size()
        ArrayList<List<Card>> Separatelist = averageAssign(deck,(contextList.size()+1));

        //Configurer un jeu sans carte centrale
        ArrayList<List<Card>> LeftAndRightCardList =  Separatelist;
        LeftAndRightCardList.remove(0);

        //Créer des pages d'images
        JFrame playPVPFrame = new JFrame();
        playPVPFrame.setTitle("7 wonders: architects");


        //Set à mettre dans le conteneur
        Container container  = playPVPFrame.getContentPane();
        container.setLayout(null);

        //Mettez l'image du miracle
        JPanel wonderJPanel = new JPanel();
        //Faire de la civilisation choisie par le premier joueur la première civilisation à agir
        ImageIcon wonderIcon = wonderList.get(0).getStage1Icon();
        wonderJLabel = new JLabel(wonderIcon);
        wonderJPanel.add(wonderJLabel);
        container.add(wonderJPanel);
        wonderJPanel.setBounds(710, 400, 400, 400);

        //Créez une page pour chaque joueur
        List<Playersview> PlayersList = new ArrayList<>();
        for(int i = 0;i<nameList.size();i++){
            List<Card> cardchooselist = new ArrayList<>();
            Playersview playersview = new Playersview(i%nameList.size(), wonderList.get((i)%nameList.size()), getCenterCard(Separatelist.get(0),cardchooselist), getCard(LeftAndRightCardList.get((i)%nameList.size()),cardchooselist), getCard(LeftAndRightCardList.get((i+1)%nameList.size()),cardchooselist), cardchooselist);
            PlayersList.add(playersview);
        }


        //Mise en place de l'initialisation
        JPanel centerDeckJPanel = PlayersList.get(0).getCenterPanel();
        JPanel leftDeckJPanel = PlayersList.get(0).getLeftPanel();
        JPanel rightDeckJPanel = PlayersList.get(0).getRightPanel();
        //Définir la position de JPanel
        centerDeckJPanel_control.add(centerDeckJPanel);
        leftDeckJPanel_control.add(leftDeckJPanel);
        rightDeckJPanel_control.add(rightDeckJPanel);
        centerDeckJPanel_control.setBounds(800, 10, 220, 300);
        leftDeckJPanel_control.setBounds(200, 400, 220, 300);
        rightDeckJPanel_control.setBounds(1420, 400, 220, 300);

        container.add(centerDeckJPanel_control);
        container.add(leftDeckJPanel_control);
        container.add(rightDeckJPanel_control);

        //le button de nextplayer
        JButton nextPlayerButton = new JButton("NEXT");
        container.add(nextPlayerButton);
        nextPlayerButton.setBounds(1700, 900, 120, 70);
        nextPlayerButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                centerDeckJPanel_control.remove(centerDeckJPanel);
                leftDeckJPanel_control.remove(leftDeckJPanel);
                rightDeckJPanel_control.remove(rightDeckJPanel);

                if(i>1){
                    centerDeckJPanel_control.remove(PlayersList.get((i-1)%nameList.size()).getCenterPanel());
                    leftDeckJPanel_control.add(PlayersList.get((i-1)%nameList.size()).getLeftPanel());
                    rightDeckJPanel_control.add(PlayersList.get((i-1)%nameList.size()).getRightPanel());

                    centerDeckJPanel_control.add(PlayersList.get((i)%nameList.size()).getCenterPanel());
                    leftDeckJPanel_control.add(PlayersList.get((i)%nameList.size()).getLeftPanel());
                    rightDeckJPanel_control.add(PlayersList.get((i)%nameList.size()).getRightPanel());

                    ImageIcon wonderIcon = PlayersList.get((i-1)%nameList.size()).getwonder().getStage1Icon();
                    wonderJLabel.setIcon(wonderIcon);
                }

                i++;

            }
        });

        JButton showcardchoosebButton = new JButton("Show Cardchoose");
        container.add(showcardchoosebButton);
        showcardchoosebButton.setBounds(820, 900, 150, 70);
        showcardchoosebButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                List<Card> cardchooseList = PlayersList.get(i%nameList.size()).cardChooseList;
                System.out.println(i%nameList.size());
                //System.out.println(cardchooseList.size());
                //for(int i = 0;i<cardchooseList.size();i++){
                //System.out.println(cardchooseList.get(i).getName());
                //}
                new CardChoose(cardchooseList);

            }
        });

        //joindre jeton
        getjetion(PlayersList.size(), container);
        //joindre le EffectOfScience
        getEffectOfScience(container);

        //Ajout d'une image de fond
        ImageIcon playBackGround = new ImageIcon("src/images/background/playBackground.png");
        JLabel background = new JLabel(playBackGround);
        background.setSize(playBackGround.getIconWidth(),playBackGround.getIconHeight());
        container.add(background);
        //Définition des propriétés de l'écran
        playPVPFrame.setSize(playBackGround.getIconWidth(),playBackGround.getIconHeight());
        playPVPFrame.setLocationRelativeTo(null);
        playPVPFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        playPVPFrame.setVisible(true);





    }




    //----------------------------------------------------------------------------------------------------------------------------
    public  static <T> ArrayList<List<Card>> averageAssign(List<Card> source, int n) {
        ArrayList<List<Card>> result = new ArrayList<List<Card>>();
        int remainder = source.size() % n;  //Calculez d'abord le reste
        int number = source.size() / n;  //Ensuite, il y a les commerciaux
        int offset = 0;//Décalage
        for (int i = 0; i < n; i++) {
            List<Card> value = null;
            if (remainder > 0) {
                value =  source.subList(i * number + offset, (i + 1) * number + offset + 1);
                remainder--;
                offset++;
            } else {
                value =  source.subList(i * number + offset, (i + 1) * number + offset);
            }
            result.add(value);
        }
        return result;
    }

    public static List<JButton> GetDeck(List<Card> cardList){
        List<JButton> cardButtonList = new ArrayList<>();
        for(int i = 0;i<cardList.size();i++){
            ImageIcon cardimage = cardList.get(i).getCardImage();
            JButton cardButton = new JButton(cardimage);
            cardButtonList.add(cardButton);
        }
        return cardButtonList;
    }

    public static JPanel getCard(List<Card> cardList,List<Card> cardchooseList){
        Iterator<Card> it = cardList.iterator();
        JPanel jPanel = new JPanel();
        CardLayout cl = new CardLayout();
        jPanel.setLayout(cl);
        Card card;
        JButton jButton;
        while(it.hasNext()){
            card = it.next();
            ImageIcon imageIcon = card.getCardImage();
            jButton = new JButton(imageIcon);
            jPanel.add(jButton);
            cl.show(jPanel, card.getName());
            jButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cl.next(jPanel);
                    cardchooseList.add(cardList.get(cardnumber));
                    //System.out.println(cardnumber);
                    cardnumber++;
                }
            });
        }
        jPanel.setSize(220,300);
        return jPanel;
    }

    public static JPanel getCenterCard(List<Card> cardList,List<Card> cardchooseList){
        Iterator<Card> it = cardList.iterator();
        JPanel jPanel = new JPanel();
        CardLayout cl = new CardLayout();
        jPanel.setLayout(cl);
        Card card;
        JButton jButton;
        while(it.hasNext()){
            card = it.next();
            ImageIcon imageIcon = card.getCardbackImage();
            jButton = new JButton(imageIcon);
            jPanel.add(jButton);
            cl.show(jPanel, card.getName());
            jButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardchooseList.add(cardList.get(cardnumber));
                    cl.next(jPanel);
                    //System.out.println(cardnumber);
                    cardnumber++;
                }
            });
        }
        jPanel.setSize(220,300);
        return jPanel;
    }
    //Configuration de jeton
    public static void getjetion(int j, Container co){
        // définir les boutons de guerre et de paix
        //ImageIcon warIcon = new ImageIcon("src/images/cards/WarStart/war.png");
        ImageIcon peaceIcon = new ImageIcon("src/images/cards/WarStart/peace.png");

        // déterminer la quantité de conflit de jeton nécessaire
        int number_of_jeton_conflit = 0;
        switch(j){
            case 2:
                number_of_jeton_conflit = 3;
                break;
            case 3:
                number_of_jeton_conflit = 3;
                break;
            case 4:
                number_of_jeton_conflit = 4;
                break;
            case 5:
                number_of_jeton_conflit = 5;
                break;
            case 6:
                number_of_jeton_conflit = 6;
                break;
            case 7:
                number_of_jeton_conflit = 7;
                break;
        }

        // Définir le paramètre de position du premier jeton
        int x = 5;
        int y = 5;
        // Boucle pour régler tous les jetons
        for (int i = 0; i<number_of_jeton_conflit;i++){
            JLabel Peace_Start = new JLabel(peaceIcon);
            co.add(Peace_Start);
            Peace_Start.setBounds(x,y,peaceIcon.getIconWidth(),peaceIcon.getIconHeight());
            x += 100;
        }
    }

    public void getEffectOfScience(Container co){
        List<effectofscience> allEffectOfScience = new ArrayList<>();
        effectofsciencelist effectofsciencelist = new effectofsciencelist();
        allEffectOfScience = effectofsciencelist.getAllEffectOfScienceList();
        List<ImageIcon> effectOfScienceImageIconList = new ArrayList<>();
        for(int i = 0;i<4;i++){
            int indexnumber = (int)(Math.random()*allEffectOfScience.size());
            if(i == 0){
                effectOfScienceImageIconList.add(allEffectOfScience.get(indexnumber).getEffectOfSciencebackImage());
                allEffectOfScience.remove(indexnumber);
            }else{
                effectOfScienceImageIconList.add(allEffectOfScience.get(indexnumber).getEffectOfScienceImage());
                allEffectOfScience.remove(indexnumber);
            }
        }
        int x = 1200;
        int y = 30;
        for(int i = 0; i<effectOfScienceImageIconList.size();i++){
            JLabel effectOfScienceJLabel = new JLabel(effectOfScienceImageIconList.get(i));
            co.add(effectOfScienceJLabel);
            effectOfScienceJLabel.setBounds(x, y, effectOfScienceImageIconList.get(i).getIconWidth(), effectOfScienceImageIconList.get(i).getIconHeight());
            x += 150;
        }
    }

}